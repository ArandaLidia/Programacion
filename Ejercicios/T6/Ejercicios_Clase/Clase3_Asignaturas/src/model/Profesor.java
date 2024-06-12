package model;
/*Desarrollar una clase llamada Profesor que:
- Tenga un método ponerNotas que recibe un parámetro de tipo Alumno y que no devuelve nada. Pondrá una calificación aleatoria a cada una de las asignaturas del alumno.
- Tenga un método calcularMedia que recibe un parámetro de tipo Alumno y devuelve
un double.*/
public class Profesor {
    private Alumno alumno;
    public void ponerNotas(Alumno alumno){
        alumno.getAsignatura1().setCalificacion((Math.random()*10)+1);
        alumno.getAsignatura2().setCalificacion((Math.random()*10)+1);
        alumno.getAsignatura3().setCalificacion((Math.random()*10)+1);
    }
    public double calcularMedia(Alumno alumno){
        return (alumno.getAsignatura1().getCalificacion()+alumno.getAsignatura2().getCalificacion()+alumno.getAsignatura3().getCalificacion())/3;
    }
}
