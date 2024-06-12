package model;/*Crea un programa java que permita crear una pizza con sus
ingredientes. Para ello el sistema gestionará objetos de los siguientes
tipos:
a. Ingrediente: nombre, precio (0.5)
b. Pizza: nombre, precio, conjunto de ingredientes (0.5)
El programa permitirá al usuario introducir los siguientes elementos:
a. Nombre de la pizza (0.5)
b. Nombre del ingrediente y su precio. Esto será de forma iterativa hasta que
el usuario indique que la pizza no tiene más ingredientes. (1)
c. Una vez introducido todos los datos el sistema mostrará el siguiente
mensaje: “Ti pizza con nombre XXX tiene un precio de XXX y sus
ingredientes son: XXX” (1)*/

public class Ingredientes {
    private String nombre;
    private double precio;

    public void mostrarDatos(){
        System.out.println("El nombre del ingrediente es: "+nombre+" y su precio es :"+precio+" €.");
    }
    public Ingredientes() {
    }

    public Ingredientes(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
