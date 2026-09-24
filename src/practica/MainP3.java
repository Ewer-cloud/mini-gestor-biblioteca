package practica;

import java.sql.Connection;
import java.sql.SQLException;

public class MainP3 {
    public static void main (String[] args) {

        // try-with-resources: abre la conexión llamando a ConexionP3.conectar()
        // y la guarda en "con". Al terminar el bloque Java la cierra sola,
        // por eso no hace falta escribir con.close().
        try(Connection con = ConexionP3.conectar()) {

            // Solo se ejecuta si la conexión se abrió sin errores
            System.out.println("Conectado");

            // Atrapa la SQLException si conectar() falla (ruta mala, URL mal escrita...)
            // y la guarda en "e". Salta aquí sin ejecutar el println de arriba.
        } catch (SQLException e) {
            // getMessage() devuelve el texto del error; println lo muestra en consola
            System.out.println(e.getMessage());
        }
    }
}
