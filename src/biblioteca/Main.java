package biblioteca;

import biblioteca.db.ConexionDB;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try (Connection con = ConexionDB.conectar()) {
            System.out.println("Conectado");
        } catch (SQLException e) {
            System.out.println("No fue posible la conexion");
            System.out.println(e.getMessage());
        }
    }
}