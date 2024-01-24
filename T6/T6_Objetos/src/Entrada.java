import model.Usuario;

public class Entrada {
    public static void main(String[] args) {
        //iNSTANCIANDO UN OBJETO. constructor = (Usuario())
        Usuario usuario = new Usuario("Borja", "Martin", "1234A"); //CREAR OBJETO -> Se crea donde se vaya a usar.
                 //Características           private String nombre, apellido, dni, correo;
                                      //      private int telefono;
        Usuario usuario1 = new Usuario("Lidia", "Aranda", "3454B");
                 //Características           private String nombre=null, apellido=null, dni, correo;
                                    //      private int telefono;
        Usuario usuario2 = new Usuario("Jose", "Bejar", "6584C");
                    //Características           private String nombre, apellido, dni, correo;
                                        //      private int telefono;
    }

}