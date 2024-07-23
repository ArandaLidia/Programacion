import database.DBConnection;
import model.Alumno;
import repositories.AlumnoRepository;

import java.sql.Connection;
import java.sql.SQLException;

public class Entrada {
    public static void main(String[] args) {
        Connection connection = DBConnection.getConnection();

        try {
            System.out.println("Base de datos: " + connection.getCatalog());
        } catch (SQLException e) {
            System.out.println("Error al cargar base de datos");
        }


        AlumnoRepository alumnoRepository=new AlumnoRepository();
        alumnoRepository.insertarAlumno(new Alumno("Lidia", "Aranda", "Correo", 1234));

        alumnoRepository.insertarAlumno1(new Alumno("Lidia1", "Apellido1", "Correo1", 2345));
    }
}
