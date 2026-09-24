package practica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionP3 {

    // Constante (static final: no cambia) de tipo String que guarda la URL de la base.
    // Formato: jdbc:sqlite: + ruta relativa al archivo .db
    private static final String URL = "jdbc:sqlite:data/libros2.db";

    // Abre una conexión a la base y la devuelve a quien llame al método.
    // Lleva throws SQLException porque este método no maneja el error:
    // se lo pasa a quien lo llame, que decide qué hacer con él.
    public static Connection conectar() throws SQLException {
        // getConnection recibe la URL (la constante, no un texto suelto)
        return DriverManager.getConnection(URL);
    }
}