package es.santander.ascender.ejerc001;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectarABaseDeDatos {

    public static void main(String[] args) throws ClassNotFoundException {
        ConectarABaseDeDatos conectarABaseDeDatos = new ConectarABaseDeDatos();
        conectarABaseDeDatos.connectToAndQueryDatabase("postgres", "mysecretpassword");
    }

    public void connectToAndQueryDatabase(String username, String password) throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        try (Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                username,
                password)) {
            try (Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT * FROM dato order by id");) { //El resultSet es un conjunto de resultados
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    System.out.println(id + " " + nombre);
                }
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}