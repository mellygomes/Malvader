package br.com.entidade;

import java.sql.Statement;
import java.time.LocalDate;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.controle.Cliente;
//import br.com.model.Endereco;

public class ClienteDAO {
	
public static void inserir(Cliente c) throws Exception {

    String queryUsuario = "INSERT INTO Usuario(id_usuario, nome_usuario, cpf_usuario, nascimento_usuario, telefone_usuario, tipo_usuario, senha_usuario, user_usuario)"
        + "values(null,?,?,?,?,?,?,?)"; //query string pra inserir na tabela usuario

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
                pst = con.prepareStatement(queryCliente);
                pst.setInt(1, pk);

                int rowsCliente= pst.executeUpdate(); //da o update

                if (rowsCliente > 0) { //se o resultado do update for > 0 entao foi possivel inserir o funcionario
                    con.commit(); //tudo certo, então commita
                    DAO.desconectar(con);
                    System.out.println("Cliente inserido com sucesso!");
                }
            } else { //qualquer erro resulta rollback
                con.rollback();
                System.out.println("Erro ao obter id do usuario. Transação revertida.");
            }

        } else {
            con.rollback();
            System.out.println("Erro ao obter a chave gerada para o usuario. Transação revertida.");
        }

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

//	public static Funcionario findBy(String cpf) throws Exception {		
//		String query = "SELECT * FROM Funcionario where id_usuario = ?";		
//		try (Connection con = ConexaoBanco.conectar()) {
//			PreparedStatement pst = con.prepareStatement(query);
//			pst.setString(1, cpf);
//			ResultSet rs = pst.executeQuery();
//			Funcionario f = new Funcionario();
//			while (rs.next()) {
//				f = (Funcionario) rs;
//			}
//			ConexaoBanco.desconectar(con);
//			return f;
//		} catch (SQLException e) {
//			e.printStackTrace();
//			return null;
//		}
//	}

}