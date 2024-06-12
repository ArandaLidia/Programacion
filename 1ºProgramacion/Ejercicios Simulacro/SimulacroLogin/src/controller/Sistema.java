package controller;

import model.Usuario;

import java.util.ArrayList;

public class Sistema {
    ArrayList<Usuario>listaUsuarios;

    public void darAltaUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
        System.out.println("El usuario: "+usuario.getNombre()+" ha sido dado de alta.");
    }

    public boolean loginUsuario(String correo, String contraseña) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getCorreo().equals(correo) && usuario.getContraseña().equals(contraseña)) {
                System.out.println("El usuario con correo: "+correo+" existe en el sistema");
                return true;

            }
        }
        System.out.println("El usuario con correo: "+correo+" no existe en el sistema");
        return false;
    }

 public void mostrarDatos(){
        for (Usuario item : listaUsuarios) {
            item.mostrarDatos();
        }
 }
    public Sistema() {
        this.listaUsuarios = new ArrayList<>();
    }

    public Sistema(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = new ArrayList<>();
    }
}
