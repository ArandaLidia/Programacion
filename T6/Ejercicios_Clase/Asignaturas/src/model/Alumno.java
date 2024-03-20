package model;
/*Desarrollar una clase llamada Alumno que:
        - Tenga tres atributos private de tipo Asignatura.
- Tenga un constructor con tres parámetros de tipo Asignatura que inicialice los tres atributos.
        - Tenga un constructor con tres parámetros de tipo int que inicialice los tres atributos.
        - Tenga un getter para cada uno de los atributos.*/
public class Alumno {
    private Asignatura asignatura1, asignatura2, asignatura3;

    public Alumno() {
    }

    public Alumno(Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3) {
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }
    public Alumno(int int1, int int2, int int3) {
        this.asignatura1 = new Asignatura(int1);
        this.asignatura2 = new Asignatura(int2);;
        this.asignatura3 = new Asignatura(int3);;
    }
    public Asignatura getAsignatura1() {
        return asignatura1;
    }

    public void setAsignatura1(Asignatura asignatura1) {
        this.asignatura1 = asignatura1;
    }

    public Asignatura getAsignatura2() {
        return asignatura2;
    }

    public void setAsignatura2(Asignatura asignatura2) {
        this.asignatura2 = asignatura2;
    }

    public Asignatura getAsignatura3() {
        return asignatura3;
    }

    public void setAsignatura3(Asignatura asignatura3) {
        this.asignatura3 = asignatura3;
    }
}
