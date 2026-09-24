package biblioteca;

import biblioteca.db.ConexionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String sql = "SELECT libros3.titulo, autores.nombre "
                + "FROM libros3 "
                + "JOIN autores ON libros3.autor_id = autores.id";

        try (Connection con = ConexionDB.conectar();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String titulo = rs.getString("titulo");
                String autor = rs.getString("nombre");
                System.out.println(titulo + " - " + autor);
            }

        } catch (SQLException e) {
            System.out.println("No fue posible la consulta");
            System.out.println(e.getMessage());
        }
    }
}