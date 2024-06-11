/*2. Crear una clase llamada entrada que tenga un método main el cual:
    - Mediante un scanner pida nombre, apellido, dni edad peso y altura de una persona
    - Cree la persona asociada a los datos leídos por teclado (p1)
    - Cree una persona con un nombre y un apellido que se introduzca a mano (sin scanner)
    - Crear una persona sin datos asociados
    - Mostrar los datos de todas las personas
    - Modificar la edad de todas las personas a 20*/

import model.Persona;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Persona persona=new Persona();
        Persona persona1=new Persona("Nombre", "Apellido", "DNI");
        Persona persona2=new Persona("nombre", "apellido", "dni", 35, 170, 55.5);
        System.out.println("Introduce manualmente:" +
                "\nNombre:" +
                "\nApellidos:" +
                "\nDni:" +
                "\nEdad:" +
                "\nAltura:" +
                "\nPeso:");
        Persona persona3=new Persona(scanner.next(), scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextDouble());
        Persona persona4=new Persona("Nombre", "Apellido");

        System.out.println();
        persona.mostrarDatos();
        System.out.println();
        persona1.mostrarDatos();
        System.out.println();
        persona2.mostrarDatos();
        System.out.println();
        persona3.mostrarDatos();
        System.out.println();
        persona4.mostrarDatos();

        persona.setEdad(20);
        persona1.setEdad(20);
        persona2.setEdad(20);
        persona3.setEdad(20);
        persona4.setEdad(20);

        System.out.println();
        persona.mostrarDatos();
        System.out.println();
        persona1.mostrarDatos();
        System.out.println();
        persona2.mostrarDatos();
        System.out.println();
        persona3.mostrarDatos();
        System.out.println();
        persona4.mostrarDatos();
    }
}