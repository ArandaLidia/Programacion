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
        Persona[]persona=new Persona[3];
        System.out.println("Introduce nombre, apellidos, dni, edad, peso y altura:");
        persona[0]=new Persona();
        persona[1]=new Persona(scanner.next(),scanner.next(), scanner.next(),scanner.nextInt(), scanner.nextDouble(),  scanner.nextInt());
        persona[2]=new Persona("Lidia","Aranda");

        for (Persona item : persona) {
            item.mostrarDatos();
        }
        for(Persona item: persona){
            item.setEdad(20);
        }
        for (Persona item : persona) {
            item.mostrarDatos();
        }

        /*persona.mostrarDatos();
        persona1.mostrarDatos();
        persona2.mostrarDatos();

        persona.setEdad(20);
        persona1.setEdad(20);
        persona2.setEdad(20);
        persona.mostrarDatos();
        persona1.mostrarDatos();
        persona2.mostrarDatos();*/

    }

}