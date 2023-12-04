package EjerciciosBASE;

/*Realiza un programa que pida 10 números por teclado y que los almacene en un array.
A continuación se mostrará el contenido de ese array junto al índice (0 – 9)*/

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int [] numeros = new int [10];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce los números para almacenar:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce numero " +(i+1)+":");
             numeros[i]= scanner.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El número en la posición"+i+": es "+numeros[i]);

        }
    }
}
