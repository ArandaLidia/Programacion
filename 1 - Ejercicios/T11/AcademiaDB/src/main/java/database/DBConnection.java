package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    static Connection connection = null;

    private static void createConnection() {
        try {
            // Cargar el driver en memoria para que esté activo
            Class.forName("com.mysql.cj.jdbc.Driver");
            // URI de la base de datos
            String uri = "jdbc:mysql://127.0.0.1:3306/curso_ue"; // Asegúrate de que el nombre sea correcto
            // Abrir la conexión desde una URI, con un usuario que tiene una contraseña
            connection = DriverManager.getConnection(uri, "root", "");
            System.out.println("Conexión a la base de datos establecida con éxito.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error en la ejecución SQL: " + e.getMessage());
        }
    }

    public static Connection getConnection() {
        if (connection == null) {
            createConnection();
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close(); // Cerrar la conexión
                connection = null;
                System.out.println("Conexión cerrada con éxito.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la base de datos: " + e.getMessage());
        }
    }
}
