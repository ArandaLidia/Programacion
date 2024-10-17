package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.Class.forName;

public class DBConnection {
    static Connection connection= null;

    public static void  createConnection(){
        try {
            //Cargar Driver en memoria
            Class.forName("com.mysql.cj.jdbc.Driver");
            String uri= "jdbc:mysql://127.0.0.1:3306/tienda";
            //Abrir la conexión
            connection= DriverManager.getConnection(uri, "root","");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el Driver.");
        } catch (SQLException e) {
            System.out.println("Error en Ejecución");
            System.out.println(e.getMessage());
        }
    }
    public static Connection getConnection(){
        if (connection==null){ //Si no hay conexión
            createConnection(); //Creamos conexión
        }
        return connection;  //si hay conexión, retorna la conexión
    }

    public static void closeConnection(){
        try {
            connection.close();
            connection=null;
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión de la Base de datos");
        }
    }
}
