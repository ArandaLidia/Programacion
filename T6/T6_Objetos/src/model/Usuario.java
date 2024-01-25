package model;

public class Usuario {

    //molde de lo que será uun usuario ->Manual de instrucciones
    //atributos -> caracteristicas que quiero manejar en el programa
    // Siempre en privado, las del mismo tipo en misma linea. siempre las primeras.
    private String nombre, apellido, dni, correo, pass;
    private int telefono;

    //metodos -> Funcionalidades que el objeto tiene
        //metodo constructor-> construir el propioo objeto. Por defecto tengo el constructor vacío. Usuario() -> Nada en parentesis.
        //Siempre y cuando no tengas ninguno con parametros. Si tienes uno con parametros, hay que crear un metodo usuario sin parametros.
    //Crear metodo//SIEMPRE PONER UN CONSTRUCTOR VACIO.
    //public void nombreMetodo(param1, param2, param3){}
    //Construir metodos constructores.   Public, nombre = clase. Entre parentesis
   public Usuario(String nombre1, String apellido1, String dni1){

   }

    public Usuario(java.lang.String nombre, java.lang.String apellido, java.lang.String dni, java.lang.String correo, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.telefono = telefono;
    }

    public java.lang.String getApellido() {
        return apellido;
    }

    public void setApellido(java.lang.String apellido) {
        this.apellido = apellido;
    }
}
