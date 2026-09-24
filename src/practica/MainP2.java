package practica;

import java.sql.Connection;
import java.sql.SQLException;

public class MainP2 {
    public static void main(String[] args) {

        try (Connection con = ConexionP2.conectar()) {
            System.out.println("conectado");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
