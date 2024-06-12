package model;

import java.util.Objects;

public class Usuario {
    private String nombre, correo, contraseña;

    public void mostrarDatos(){
        System.out.println("El nombre del usuario es: "+nombre);
        System.out.println("El correo del usuario es: "+correo);
        System.out.println("La contraseña del usuario es: "+contraseña);
    }

    public Usuario() {
    }

    public Usuario(String correo, String contraseña) {
        this.correo = correo;
        this.contraseña = contraseña;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario usuario)) return false;
        return Objects.equals(nombre, usuario.nombre) && Objects.equals(correo, usuario.correo) && Objects.equals(contraseña, usuario.contraseña);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, correo, contraseña);
    }

    public Usuario(String nombre, String correo, String contraseña) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
