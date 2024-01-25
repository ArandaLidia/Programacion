/*Modifica el ejercicio anterior para que el IMC se pueda calcular según el genero de la persona.
En este caso, para poder calcular el IMC según genero se utilizan las siguientes tablas*/

import model.Persona;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Persona[]persona=new Persona[3];
        System.out.println("Introduce nombre, apellidos, dni, edad, peso, altura y genero (Hombre o mujer):");
        persona[0]=new Persona();
        persona[1]=new Persona(scanner.next(),scanner.next(), scanner.next(),scanner.nextInt(), scanner.nextDouble(),  scanner.nextInt(), scanner.next());
        persona[2]=new Persona("Lidia","Aranda");


        persona[1].mostrarDatos();
        System.out.println("El indice de masa corporal de "+persona[1].getNombre()+" es: "+persona[1].imc(persona[1].getPeso(),persona[1].getAltura()));
        persona[1].estadoFisico();
    }
}