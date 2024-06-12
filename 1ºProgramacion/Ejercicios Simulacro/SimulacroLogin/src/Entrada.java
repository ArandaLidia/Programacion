import controller.Sistema;
import model.Usuario;

public class Entrada {
    public static void main(String[] args) {
        Sistema sistema=new Sistema();
        Usuario usuario=new Usuario("Usuario1", "correo1", "contraseña1");
        Usuario usuario2=new Usuario("Usuario2", "correo2", "contraseña2");
        Usuario usuario3=new Usuario("Usuario3", "correo3", "contraseña3");
        System.out.println("__________________________________");
        sistema.darAltaUsuario(usuario);
        sistema.darAltaUsuario(usuario2);
        sistema.darAltaUsuario(usuario3);
        System.out.println("__________________________________");
        sistema.mostrarDatos();
        System.out.println("__________________________________");
        System.out.println(sistema.loginUsuario("correo4", "contraseña4"));
        System.out.println(sistema.loginUsuario("correo1", "contraseña1"));
    }

}