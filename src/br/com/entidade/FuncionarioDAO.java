package br.com.entidade;

import br.com.controle.Funcionario;
import java.sql.Statement;
import java.time.LocalDate;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.controle.Endereco;

//@author emanuelly
public class FuncionarioDAO {
	
    public static void save(Funcionario f) throws Exception {

    String queryUsuario = "INSERT INTO Usuario(id_usuario, nome_usuario, cpf_usuario, nascimento_usuario, telefone_usuario, tipo_usuario, senha_usuario, user_usuario)"
        + "values(null,?,?,?,?,?,?,?)"; //query string pra inserir na tabela usuario

    String queryFuncionario = "INSERT INTO Funcionario(id_funcionario, codigo_funcionario, cargo_funcionario, fk_usuario_id)"
        + "values(null,?,?,?)"; //query string pra inserir na tabela funcionario

    String queryEndereco = "INSERT INTO Endereco(id_endereco, cep, local, numero, bairro, cidade, uf, fk_usuario_id)"
        + "values(null,?,?,?,?,?,?,?)"; //query string pra inserir na tabela endereco

    try (Connection con = DAO.conectar()) {
        con.setAutoCommit(false);

        PreparedStatement pst = con.prepareStatement(queryUsuario, Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, f.getNome_usuario());
        pst.setString(2, f.getCpf_usuario());
        pst.setDate(3, Date.valueOf(f.getNascimento_usuario()));
        pst.setString(4, f.getTelefone_usuario());
        pst.setString(5, f.getTipo_usuario());
        pst.setString(6, f.getSenha_funcionario());
        pst.setString(7, f.getUser_usuario());
        pst.executeUpdate();

        ResultSet rs = pst.getGeneratedKeys(); //busca a chave que foi gerada na tabela do usuario inserido			
        if (rs.next()) { //se tiver conseguido a chave, pega e coloca em idUsuario
            int idUsuario = rs.getInt(1); 
            System.out.print("Aqui");

            Endereco e = f.getEndereco_usuario();
            if (e != null) {
                PreparedStatement pste = con.prepareStatement(queryEndereco);
                pste.setString(1, e.getCep());
                pste.setString(2, e.getLocal());
                pste.setInt(3, e.getNumeroCasa());
                pste.setString(4, e.getBairro());
                pste.setString(5, e.getCidade());
                pste.setString(6, e.getUf());
                pste.setInt(7, idUsuario);
                pste.executeUpdate();

                PreparedStatement pstf = con.prepareStatement(queryFuncionario);
                pstf.setString(1, f.getCodigo_funcionario());
                pstf.setString(2, f.getCargo());
                pstf.setInt(3, idUsuario);

                int rowsFuncionario = pstf.executeUpdate(); //da o update

            if (rowsFuncionario > 0) { //se o resultado do update for > 0 entao foi possivel inserir o funcionario
                con.commit(); //tudo certo, então commita
                DAO.desconectar(con);
                System.out.println("Funcionario inserido com sucesso!");
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

    public static Funcionario findByUser(String user) throws Exception {
        Funcionario f = new Funcionario();

        String queryUser = "SELECT * FROM Usuario WHERE user_usuario = ?";		
        String queryFuncionario = "SELECT * FROM Funcionario WHERE fk_usuario_id = ?";

        try (Connection con = DAO.conectar()) {
        PreparedStatement pst = con.prepareStatement(queryUser);
        pst.setString(1, user);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            f.setId_usuario(rs.getInt("id_usuario"));
            f.setNome_usuario(rs.getString("nome_usuario"));
            f.setCpf_usuario(rs.getString("cpf_usuario"));
            f.setNascimento_usuario(LocalDate.parse(String.valueOf((rs.getDate("nascimento_usuario")))));
            f.setTelefone_usuario(rs.getString("telefone_usuario"));
            f.setTipo_usuario(rs.getString("tipo_usuario"));
            f.setSenha_funcionario(rs.getString("senha_usuario"));
            f.setUser_usuario(rs.getString("user_usuario"));

            int pk = f.getId_usuario();

            PreparedStatement pstf = con.prepareStatement(queryFuncionario);
            pstf.setInt(1, pk);
            ResultSet rsf = pstf.executeQuery();

            if (rsf.next()) {
                f.setCodigo_funcionario(rsf.getString("codigo_funcionario"));
                f.setCargo(rsf.getString("cargo_funcionario"));

            } else {
                System.out.print("Erro a");
            }
        } else {
            System.out.print("Nenhum funcionário");
        }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return f;
    }
}
