package br.com.entidade;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

import br.com.controle.Cliente;
import br.com.controle.ContaCorrente;
import java.time.LocalDate;

//@author emanuelly
public class ContaCorrenteDAO {
    public static void save(ContaCorrente c) throws Exception {
        String queryUser = "SELECT id_usuario FROM Usuario WHERE cpf_usuario = ?";

        String queryCliente = "SELECT id_cliente FROM Cliente WHERE fk_usuario_id = ?";

        String queryConta = "INSERT INTO Conta(id_conta, numero_conta, agencia_conta, saldo, tipo_conta, fk_cliente_id)"
            + "values(null, ?,?,?,?,?)";

        String queryCc = "INSERT INTO Conta_Corrente(conta_corrente_id, limite, data_vencimento, fk_conta_id)"
            + "values(null, ?,?,?)";

        try (Connection con = DAO.conectar()) {
            con.setAutoCommit(false);

            PreparedStatement pst = con.prepareStatement(queryUser); //primeiro encontra o usuario atraves do CPF e pega o id
            Cliente cliente = c.getCliente();	
            pst.setString(1, cliente.getCpf_usuario());

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int pk = rs.getInt(1); 

                PreparedStatement pstcl = con.prepareStatement(queryCliente); //atraves do id do usuaio, busca o cliente
                pstcl.setInt(1, pk);
                ResultSet rs2 = pstcl.executeQuery();
                if (rs2.next()) {
                    int id = rs2.getInt(1);

                    PreparedStatement pstc = con.prepareStatement(queryConta, Statement.RETURN_GENERATED_KEYS); //insere a conta e o id do cliente com fk na conta
                    pstc.setInt(1, c.getNumero_conta());	
                    pstc.setString(2, c.getAgencia_conta());
                    pstc.setDouble(3, c.getSaldo_conta());
                    pstc.setString(4, c.getTipo_conta());
                    pstc.setInt(5, id);
                    pstc.executeUpdate();

                    ResultSet rspk = pstc.getGeneratedKeys(); //insere agora na tabela conta corrente, passando o id gerado na conta associada como fk

                    if (rspk.next()) {

                        int pk_c = rspk.getInt(1);
                        PreparedStatement pstcorrente = con.prepareStatement(queryCc);
                        pstcorrente.setDouble(1, c.getLimite());
                        pstcorrente.setDate(2, Date.valueOf(c.getDataVencimento()));
                        pstcorrente.setInt(3, pk_c);
                        pstcorrente.executeUpdate();

                        con.commit(); //tudo certo, então commita

                        DAO.desconectar(con);
                        System.out.println("Conta inserida com sucesso!");

                    } else {
                        con.rollback();
                        System.out.println("Erro.");
                    }

                } else {
                    con.rollback();
                    System.out.println("Erro.");
                }

            } else {
                con.rollback();
                System.out.println("Erro.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ContaCorrente findByNumero(int numero) throws Exception {
        ContaCorrente c = new ContaCorrente();

        String queryConta = "SELECT * FROM Conta WHERE numero_conta = ?";
        String queryCcorrente = "SELECT * FROM Conta_Corrente WHERE fk_conta_id = ?";

        try (Connection con = DAO.conectar()) {
            PreparedStatement pst = con.prepareStatement(queryConta);
            pst.setInt(1, numero);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                c.setAgencia_conta(rs.getString("agencia_conta"));
                c.setSaldo_conta(rs.getDouble("saldo"));
                c.setTipo_conta(rs.getString("tipo_conta"));
                int fk_cliente = rs.getInt("fk_cliente_id");

                Cliente cliente = ClienteDAO.findById(fk_cliente);
                c.setCliente(cliente);

                int pk = rs.getInt(1);

                PreparedStatement pst2 = con.prepareStatement(queryCcorrente);
                pst2.setInt(1, pk);
                ResultSet rs2 = pst2.executeQuery();

                if (rs2.next()) {
                    c.setLimite(rs2.getDouble("limite"));
                    c.setDataVencimento(LocalDate.parse(rs2.getString("data_vencimento")));	
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return c;
    }
}
