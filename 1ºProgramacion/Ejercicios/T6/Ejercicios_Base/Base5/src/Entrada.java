
/*Modifica el ejercicio anterior para que el IMC se pueda calcular según el genero de la persona.
En este caso, para poder calcular el IMC según genero se utilizan las siguientes tablas*/


import model.Persona;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce el genero (hombre o mujer");
        Persona persona=new Persona();
        Persona persona1=new Persona("Nombre", "Apellido", "DNI");
        Persona persona2=new Persona("nombre", "apellido", "dni", 35, 165, 55.5, scanner.nextLine());


        System.out.println("Introduce tus datos:" +
                "\nNombre:" +
                "\nApellidos:" +
                "\nDNI:" +
                "\nEdad:" +
                "\nAltura:" +
                "\nPeso:" +
                "\nGemero: (hombre o mujer)");
         Persona persona3=new Persona(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextInt(), scanner.nextDouble(), scanner.nextLine());

        persona.mostrarDatos();
        System.out.println();
        persona1.mostrarDatos();
        System.out.println();
        persona2.mostrarDatos();
        System.out.println();

        persona2.aumentarEdad(10);
        System.out.println();
        persona2.mostrarDatos();
        System.out.println();
        System.out.println();


        persona2.mostrarDatos();
        System.out.println();
        persona2.imc();
        persona3.mostrarDatos();
        System.out.println();
        persona3.imc();


    }
}