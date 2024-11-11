package br.com.entidade;

import java.sql.Connection;
import java.sql.SQLException;

//@author emanuelly
public class TesteCon {
    public static void main(String[] args) throws Exception {
        try (Connection con = DAO.conectar()) {
            System.out.print("Conectado ao banco de dados!");
            DAO.desconectar(con);
        } catch (SQLException e){
            e.printStackTrace();
        }	
    }
}
