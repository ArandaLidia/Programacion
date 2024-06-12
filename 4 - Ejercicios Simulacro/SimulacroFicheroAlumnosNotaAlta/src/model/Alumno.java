package model;

import java.util.ArrayList;

public class Alumno {
    private String nombre, apellido, correo;
    private int nota;


    public Alumno(String nombre, String apellido, String correo, int nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.nota = nota;

    }
public void mostarDatos(){
    System.out.println("El nombre es: "+nombre);
    System.out.println("El apellido es: "+apellido);
    System.out.println("El correo es: "+correo);
    System.out.println("La nota es: "+nota);
}


    public Alumno() {

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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
