package model;

public class Alumno {

    private String nombre, apellido, dni;
    private double calificacion;
    private  int matricula=1;

    public void mostrarDatos(){
        System.out.println("El nombre del alumno es: "+nombre);
        System.out.println("El apellido del alumno es: "+apellido);
        System.out.println("El dni del alumno es: "+dni);
        System.out.println("La matricula del alumno es: "+matricula);
        System.out.println("La calificación obtenida por el alumno es: "+calificacion);
    }

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String dni, int matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.matricula = matricula;
    }

    public Alumno(String nombre, String apellido, String dni, int matricula, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.matricula = matricula;
        this.calificacion = calificacion;
    }

    public Alumno(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
