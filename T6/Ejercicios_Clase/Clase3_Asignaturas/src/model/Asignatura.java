package model;
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

public class Asignatura {
    private int identificador;
    private double calificacion;

    public Asignatura() {
    }

    public Asignatura(int identificador) {
        this.identificador = identificador;
    }

    public Asignatura(int identificador, double calificacion) {
        this.identificador = identificador;
        this.calificacion = calificacion;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
