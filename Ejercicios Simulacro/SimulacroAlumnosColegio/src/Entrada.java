import controller.Colegio;
import model.Alumno;

public class Entrada {
    public static void main(String[] args) {
        Colegio colegio=new Colegio();
        Alumno alumno= new Alumno("alumno1","apellido1", "dni1");
        Alumno alumno2= new Alumno("alumno2","apellido2", "dni2");
        Alumno alumno3= new Alumno("alumno3","apellido3", "dni3");

        colegio.darAlta(alumno);
        colegio.darAlta(alumno2);
        colegio.darAlta(alumno3);

        colegio.calificarAlumno(alumno.getMatricula(), 5.6);
        colegio.calificarAlumno(alumno2.getMatricula(), 8.4);
        colegio.calificarAlumno(alumno3.getMatricula(), 9.1);


        colegio.listarAlumnos();
    }
}