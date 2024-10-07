package repositories;

import database.DBConnection;
import database.EsquemaDB;
import model.Alumno;

import java.sql.*;

public class AlumnoRepository {

    private Connection connection;
    //Tener todas las acciones CRUD que necesito del modelo Alumno;
    //INSERT-SELECT-UPDATE-DELETE
    //Statemen -> C   UD: se codifica a "ciegas y el motor se fia de la codificación
    //PrepareStatement -> CUD : se codifica parametros y el motor ya tiene la codificación temrinada
    //execute(SQL) -> "Insert into alumnos () VALUES" -> deuelve booleano
    //executeUpdate(SQL) -> "Insert INTO alumnos () VALUES " -> devuelve un int

    //ResulSet : Read
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

    public void obtenerAlumnos(){
//SELECT * FROM ALUMNOS
        //ResultSET -> el conjunto de datos que se obtienen de una seleccion
    connection = DBConnection.getConnection();

        try {
            Statement statement= connection.createStatement();
            ResultSet resultado = statement.executeQuery("SELECTO * FROM alumnos");
            while (resultado.next()){
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                int telefono = resultado.getInt("telefono");
                System.out.println(nombre + " " + apellido + " " + telefono);
            }
        } catch (SQLException e) {
            System.out.println("Error en SQL");
        }finally {
            DBConnection.closeConnection();
            connection=null;
        }
    }

    public boolean estaAlumno(String nombre, String correo){
        //SELECT * FROM alumnos WHERE nombre='nombre' AND correo='correo'
        //String query="SELECT * FROM alumnos WHERE nombre='"+nombre+"'AND correo='" +correo+"'";
        boolean estaAlumno=false;
        String query= String.format("SELECT * FROM %s WHERE %s='%s' AND %s='%s'", EsquemaDB.TAB_ALUMNOS,
                EsquemaDB.COL_NAME, nombre,
                EsquemaDB.COL_EMAIL, correo);

        connection=DBConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultado = preparedStatement.executeQuery();
            estaAlumno=resultado.next();
        } catch (SQLException e) {
            System.out.println("Error en SQL");
        }finally {
            DBConnection.closeConnection();
            connection=null;
        }

        //Cuando el usuario cumple condiciones = TRUE
        //Si el usuario no cumple conficiones = False
        return estaAlumno;
    }
}