/*Crea un programa java que permita crear una pizza con sus
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

import controller.Pizza;
import model.Ingredientes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String masIngredientes;

        System.out.println("Introduce el nombre de la pizza:");
        String nombrePizza= scanner.next();
        Pizza pizza=new Pizza();
        do {
            System.out.println("Introduce el ingrediente: ");
            String nombreIngrediente= scanner.next();
            System.out.println("Introduce el precio:");
            double precioIngrediente= scanner.nextDouble();
            Ingredientes ingredientes=new Ingredientes(nombreIngrediente, precioIngrediente);
            pizza.agregarIngrediente(ingredientes);
            System.out.println("Quieres añadir más ingredientes?");
            masIngredientes= scanner.next();
        }while (masIngredientes.equalsIgnoreCase("si"));

        pizza.setNombrePizza(nombrePizza);
        pizza.setPrecioPizza(pizza.calcularPrecio());
        pizza.mostrarDatos();






    }
}