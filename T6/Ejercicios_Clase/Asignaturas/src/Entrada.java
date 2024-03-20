import model.Alumno;
import model.Asignatura;
import model.Profesor;

/*1. **Asignaturas**
Desarrollar una clase llamada Asignatura que:
- Tenga dos atributos private de tipo int (identificador) y de tipo double (calificación).
- Tenga un constructor con un parámetro de tipo int.
- Tenga un getter para cada uno de los atributos.
- Tenga un setter para la calificación.
Desarrollar una clase llamada Alumno que:
- Tenga tres atributos private de tipo Asignatura.
- Tenga un constructor con tres parámetros de tipo Asignatura que inicialice los tres atributos.
- Tenga un constructor con tres parámetros de tipo int que inicialice los tres atributos.
- Tenga un getter para cada uno de los atributos.
Desarrollar una clase llamada Profesor que:
- Tenga un método ponerNotas que recibe un parámetro de tipo Alumno y que no devuelve nada. Pondrá una calificación aleatoria a cada una de las asignaturas del alumno.
- Tenga un método calcularMedia que recibe un parámetro de tipo Alumno y devuelve
un double.
Desarrollar una clase llamada Entrada que en su método main:
- Registrar asignatura. Cree e inicialice tres Asignaturas (a mano).
- Cree un Alumno con las tres Asignaturas (a mano).
- Cree un Profesor que le ponga calificaciones al Alumno y muestre por pantalla la media del Alumno (a mano).
- Comprueba mediante impresiones por pantalla las notas de cada alumno
1. Desarrollar una práctica que maneje el funcionamiento de una agenda. La agenda debe guardar los datos de una persona física (Nombre, Teléfono y DNI). El programa deberá permitir:
- 1: Agregar persona a la agenda
- 2: Borrar persona (según el DNI introducido)
- 3: Editar persona (según el DNI introducido)
- 4: Buscar persona (recupera la persona que tenga un DNI introducido)
- 5: Listar agenda (lista todos los contactos de la agenda con sus datos)
**Es muy parecido al ejercicio de arraylist que guardaba array de Object. En este caso se guardan en el arraylist o hashtable objetos de tipo persona***/
public class Entrada {
    public static void main(String[] args) {

        Asignatura asignatura=new Asignatura();
        Asignatura asignatura1=new Asignatura();
        Asignatura asignatura2=new Asignatura();
        Alumno alumno=new Alumno(asignatura, asignatura1, asignatura2);
        Profesor profesor=new Profesor();
        profesor.ponerNotas(alumno);
        profesor.calcularMedia(alumno);
        System.out.println("La media del alumno es: "+profesor.calcularMedia(alumno));
        System.out.println("El alumno tiene una calificación en la asignatura 1 de : "+alumno.getAsignatura1().getCalificacion());
        System.out.println("El alumno tiene una calificación en la asignatura 2 de : "+alumno.getAsignatura2().getCalificacion());
        System.out.println("El alumno tiene una calificación en la asignatura 3 de : "+alumno.getAsignatura3().getCalificacion());
    }
}