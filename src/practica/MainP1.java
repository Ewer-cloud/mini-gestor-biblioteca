package practica;

import java.sql.Connection;
import java.sql.SQLException;

public class MainP1 {
    public static void main(String[] args) {

        try (Connection con = ConexionP1.conectar()) {
            System.out.println("Conectado");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
