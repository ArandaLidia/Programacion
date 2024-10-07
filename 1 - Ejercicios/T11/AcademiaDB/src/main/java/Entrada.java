import database.DBConnection;
import model.Alumno;
import repositories.AlumnoRepository;

import java.sql.Connection;
import java.sql.SQLException;

public class Entrada {
    public static void main(String[] args) {
        Connection connection = DBConnection.getConnection();
        System.out.print(connection.toString());

        try {
            System.out.println("Base de datos: " + connection.getCatalog());
        } catch (SQLException e) {
            System.out.println("Error al cargar base de datos");
        }


        AlumnoRepository alumnoRepository=new AlumnoRepository();
        alumnoRepository.obtenerAlumnos();

        if (alumnoRepository.estaAlumno("Lidia", "correo")){
            System.out.println("El usuario está en la lista de la BD");
        }else {
            System.out.println("El usuario no está en la lista");
        }
        //alumnoRepository.insertarAlumno(new Alumno("Lidia", "Aranda", "Correo", 1234));

        //alumnoRepository.insertarAlumno1(new Alumno("Lidia1", "Apellido1", "Correo1", 2345));
        //alumnoRepository.insertarAlumno1(new Alumno("Lidia2", "Apellido2", "Correo2", 3456));
    }
}
