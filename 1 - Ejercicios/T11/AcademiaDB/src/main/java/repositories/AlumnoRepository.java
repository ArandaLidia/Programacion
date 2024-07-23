package repositories;

import database.DBConnection;
import model.Alumno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AlumnoRepository {

    private Connection connection;
    //Tener todas las acciones CRUD que necesito del modelo Alumno;
    //INSERT-SELECT-UPDATE-DELETE

    public void insertarAlumno(Alumno alumno){
        //INSERT - Para poder hacerlo hace falta la conexión.
            //Abrir la conexión

                connection = DBConnection.getConnection();
            //Trabajar con la conexión
                    //  INSERT INTO alumnos (nombre, apellido, correo, telefoo) VALUES ('Lidia', 'Aranda', 'correo', 1234)
                        // Si vas a introducir todas las columnas, no es necesario poner (nombre, apellido, correo, telefono) se pone directamente los datos.
        Statement statement = null;

        try {
            statement = connection.createStatement();
            String query = "INSERT INTO alumnos (nombre, apellido, correo, telefono) VALUES ('"
                    + alumno.getNombre() + "', '"
                    + alumno.getApellido() + "', '"
                    + alumno.getCorreo() + "', '"
                    + alumno.getTelefono() + "');";
            statement.execute(query);
            statement.close();
        } catch (SQLException e) {
            System.out.println("Fallo en la sentencia SQL");
            System.out.printf(e.getMessage());
        }
        //Cerrar la conexión

                DBConnection.closeConnection();
    }


    public void insertarAlumno1(Alumno alumno){
        //INSERT - Para poder hacerlo hace falta la conexión.
        //Abrir la conexión

        connection = DBConnection.getConnection();
        //Trabajar con la conexión
        //  INSERT INTO alumnos (nombre, apellido, correo, telefoo) VALUES ('Lidia', 'Aranda', 'correo', 1234)
        // Si vas a introducir todas las columnas, no es necesario poner (nombre, apellido, correo, telefono) se pone directamente los datos.
        PreparedStatement preparedStatement = null;

        try {
            String query ="INSERT INTO alumnos(nombre, apellido, correo, telefono) VALUES (?,?,?,?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1 , alumno.getNombre());
            preparedStatement.setString(2 , alumno.getApellido());
            preparedStatement.setString(3 , alumno.getCorreo());
            preparedStatement.setInt(4 , alumno.getTelefono());
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("Fallo en la sentencia SQL");
            System.out.printf(e.getMessage());
        }
        //Cerrar la conexión

        DBConnection.closeConnection();
    }

}
