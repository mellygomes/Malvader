package br.com.entidade;

import java.sql.Statement;
import java.time.LocalDate;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.controle.Cliente;
import br.com.controle.Endereco;

public class ClienteDAO {
	
    public static void inserir(Cliente c) throws Exception {
		
        String queryUsuario = "INSERT INTO Usuario(id_usuario, nome_usuario, cpf_usuario, nascimento_usuario, telefone_usuario, tipo_usuario, senha_usuario, user_usuario)"
            + "values(null,?,?,?,?,?,?,?)"; //query string pra inserir na tabela usuario

        String queryEndereco = "INSERT INTO Endereco(id_endereco, cep, local, numero, bairro, cidade, uf, fk_usuario_id)"
            + "values(null,?,?,?,?,?,?,?)"; //query string pra inserir na tabela endereco

        String queryCliente = "INSERT INTO Cliente(id_cliente, fk_usuario_id)"
            + "values(null, ?)"; //query string pra inserir na tabela funcionario

        try (Connection con = DAO.conectar()) {
            con.setAutoCommit(false);
            PreparedStatement pst = con.prepareStatement(queryUsuario, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, c.getNome_usuario());
            pst.setString(2, c.getCpf_usuario());
            pst.setDate(3, Date.valueOf(c.getNascimento_usuario()));
            pst.setString(4, c.getTelefone_usuario());
            pst.setString(5, c.getTipo_usuario());
            pst.setString(6, c.getSenha_cliente());
            pst.setString(7, c.getUser_usuario());
            pst.executeUpdate();

            ResultSet rs = pst.getGeneratedKeys(); //busca a chave que foi gerada na tabela do usuario inserido

            if (rs.next()) { //se tiver conseguido a chave, pega e coloca em idUsuario
                int pk = rs.getInt(1); 

                if (pk > 0) { //se o id for > 0 entao foi possivel busca-la
                        Endereco e = c.getEndereco_usuario();
                        if (e != null) {
                            PreparedStatement pste = con.prepareStatement(queryEndereco);
                            pste.setString(1, e.getCep());
                            pste.setString(2, e.getLocal());
                            pste.setInt(3, e.getNumeroCasa());
                            pste.setString(4, e.getBairro());
                            pste.setString(5, e.getCidade());
                            pste.setString(6, e.getUf());
                            pste.setInt(7, pk);
                            int rows_endereco = pste.executeUpdate();

                            if (rows_endereco > 0) {	
                                pst = con.prepareStatement(queryCliente);
                                pst.setInt(1, pk);

                                int rowsCliente= pst.executeUpdate(); //da o update

                                if (rowsCliente > 0) { //se o resultado do update for > 0 entao foi possivel inserir o funcionario
                                    con.commit(); //tudo certo, então commita
                                    System.out.println("Cliente inserido com sucesso!");
                                }
                            } else {
                                con.rollback();
                                System.out.println("Erro ao obter o endereco do usuario. Transação revertida.");
                            }
                        } else {
                            con.rollback();
                            System.out.println("Erro ao obter id do usuario. Transação revertida.");
                        }
                } else { //qualquer erro resulta rollback
                    con.rollback();
                    System.out.println("Erro ao obter id do usuario. Transação revertida.");
                }
        } else {
            con.rollback();
            System.out.println("Erro ao obter a chave gerada para o usuario. Transação revertida.");
        }

        DAO.desconectar(con);

        } catch (SQLException e){
                e.printStackTrace();
        }
    }

    public static Cliente findByUser(String user) throws Exception {
        Cliente c = new Cliente();

        String queryUser = "SELECT * FROM Usuario WHERE user_usuario = ?";		
        //String queryCliente = "SELECT * FROM Cliente WHERE fk_usuario_id = ?";

        try (Connection con = DAO.conectar()) {
            PreparedStatement pst = con.prepareStatement(queryUser);
            pst.setString(1, user);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                c.setId_usuario(rs.getInt("id_usuario"));
                c.setNome_usuario(rs.getString("nome_usuario"));
                c.setCpf_usuario(rs.getString("cpf_usuario"));
                c.setNascimento_usuario(LocalDate.parse(String.valueOf((rs.getDate("nascimento_usuario")))));
                c.setTelefone_usuario(rs.getString("telefone_usuario"));
                c.setTipo_usuario(rs.getString("tipo_usuario"));
                c.setSenha_cliente(rs.getString("senha_usuario"));
                c.setUser_usuario(rs.getString("user_usuario"));
            } else {
                System.out.print("Erro: resultset retornou null");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    return c;
}

    public static Cliente findById(int id) throws Exception {		
        Cliente cliente = new Cliente();

        String queryC = "SELECT fk_usuario_id FROM Cliente WHERE id_cliente = ?";		
        String queryU = "SELECT * FROM Usuario WHERE id_usuario = ?";		

        try (Connection con = DAO.conectar()) {

            PreparedStatement pst = con.prepareStatement(queryC);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int fk = rs.getInt("fk_usuario_id");

                PreparedStatement pst2 = con.prepareStatement(queryU);
                pst2.setInt(1, fk);
                ResultSet rs2 = pst2.executeQuery();

                if (rs2.next()) {
                    cliente.setId_usuario(rs2.getInt("id_usuario"));
                    cliente.setNome_usuario(rs2.getString("nome_usuario"));
                    cliente.setCpf_usuario(rs2.getString("cpf_usuario"));
                    cliente.setNascimento_usuario(LocalDate.parse(String.valueOf((rs2.getDate("nascimento_usuario")))));
                    cliente.setTelefone_usuario(rs2.getString("telefone_usuario"));
                    cliente.setTipo_usuario(rs2.getString("tipo_usuario"));
                    cliente.setSenha_cliente(rs2.getString("senha_usuario"));
                    cliente.setUser_usuario(rs2.getString("user_usuario"));
                    DAO.desconectar(con);			
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cliente;		
    }
    
    //OBS aquii: ainda precisa tratar a excecao para o caso do cliente ter mais de uma conta,
    //nesse caso, ele precisa deletar todas as contas vinculadas antes de deletar o usuario
    public static void delete(String cpf) throws Exception {
        //query select
        String queryUser = "SELECT * FROM Usuario WHERE cpf_usuario = ?";
        String queryCliente = "SELECT * FROM Cliente WHERE fk_usuario_id = ?";
        String queryConta = "SELECT * FROM Conta WHERE fk_cliente_id = ?";
        //query delete
        String queryDelete_Conta = "DELETE FROM Conta WHERE id_conta = ?";
        String queryDelete_Cliente = "DELETE FROM Cliente WHERE id_cliente = ?";
        String queryDelete_Endereco = "DELETE FROM Endereco WHERE fk_usuario_id = ?";
        String queryDelete_User = "DELETE FROM Usuario WHERE id_usuario = ?";

        try (Connection con = DAO.conectar()) {
            con.setAutoCommit(false);

            //encontrar
            PreparedStatement pst = con.prepareStatement(queryUser);
            pst.setString(1, cpf);
            ResultSet rsUser = pst.executeQuery();

            if (rsUser.next()) {
                int id_user = rsUser.getInt("id_usuario");

                PreparedStatement pst1 = con.prepareStatement(queryCliente);
                pst1.setInt(1, id_user);
                ResultSet rsCliente = pst1.executeQuery();

                if (rsCliente.next()) {
                    int id_cliente = rsCliente.getInt("id_cliente");

                    PreparedStatement pst3 = con.prepareStatement(queryConta);
                    pst3.setInt(1, id_cliente);
                    ResultSet rsConta = pst3.executeQuery();

                    if (rsConta.next()) {

                        int id_conta = rsConta.getInt("id_conta");
                        String tipo_conta = rsConta.getString("tipo_conta");

                        if (tipo_conta.equals("CORRENTE")) {
                            String queryDelete_ContaTipo = "DELETE FROM Conta_Corrente WHERE fk_conta_id = ?";
                            PreparedStatement pst4 = con.prepareStatement(queryDelete_ContaTipo);
                            pst4.setInt(1, id_conta);
                            int rows = pst4.executeUpdate();

                            if (rows <= 0) {
                                System.out.println("Erro ao deletar o tipo da conta.");
                                con.rollback();
                                return;
                            }

                        } else if (tipo_conta.equals("POUPANCA")) {	
                            String queryDelete_ContaTipo = "DELETE FROM Conta_Poupanca WHERE fk_conta_id = ?";
                            PreparedStatement pst4 = con.prepareStatement(queryDelete_ContaTipo);
                            pst4.setInt(1, id_conta);
                            int rows = pst4.executeUpdate();

                            if (rows <= 0) {
                                System.out.println("Erro ao deletar o tipo da conta.");
                                con.rollback();
                                return;
                            }
                        } else {
                            System.out.println("Erro ao obter o tipo da conta.");
                            return;
                        }

                        PreparedStatement pst5 = con.prepareStatement(queryDelete_Conta);
                        pst5.setInt(1, id_conta);
                        int rows_conta = pst5.executeUpdate();

                        if (rows_conta > 0) {
                            PreparedStatement pst6 = con.prepareStatement(queryDelete_Cliente);
                            pst6.setInt(1, id_cliente);
                            int rows_cliente = pst6.executeUpdate();

                            if (rows_cliente > 0) {
                                PreparedStatement pst7 = con.prepareStatement(queryDelete_Endereco);
                                pst7.setInt(1, id_user);
                                int rows_endereco = pst7.executeUpdate();

                                System.out.print("" +rows_endereco);

                                if (rows_endereco > 0) {
                                    PreparedStatement pst8 = con.prepareStatement(queryDelete_User);
                                    pst8.setInt(1, id_user);
                                    int rows_usuario = pst8.executeUpdate();

                                    if (rows_usuario > 0) {
                                        con.commit();
                                        System.out.println("Usuario cliente, e contas associadas foram deletados com sucesso!");
                                    } else {
                                        System.out.println("Erro ao deletar o usuario.");
                                        con.rollback();
                                    }
                                } else {
                                    System.out.println("Erro ao deletar tabela endereco do usuario.");
                                    con.rollback();
                                }			
                            } else {
                                System.out.println("Erro ao deletar tabela cliente do usuario.");
                                con.rollback();
                            }					
                        } else {
                            System.out.println("Erro ao deletar conta do usuario.");
                            con.rollback();
                        }
                    } else {
                        System.out.println("Erro ao obter id da conta.");
                    }					
                } else {
                    System.out.println("Erro ao obter id do cliente.");
                }
            } else {
                System.out.println("Erro ao obter id do usuario.");
            }	
            
            DAO.desconectar(con);

        } catch (SQLException e) {
                e.printStackTrace();
        }
    }  
}