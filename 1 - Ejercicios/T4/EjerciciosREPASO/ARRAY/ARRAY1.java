package ARRAY;

import java.util.Scanner;

/*Realiza un programa que pida 10 números por teclado y que los almacene en un array.
A continuación se mostrará el contenido de ese array junto al índice (0 – 9)*/
public class ARRAY1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] numeros= new int [10];
        for (int i = 0; i <= numeros.length-1; i++) {
            System.out.println("Introduce número "+(i+1)+":" );
            int numeross=sc.nextInt();
            numeros[i]=numeross;

        }
        for (int i = 0; i <= numeros.length-1 ; i++) {
            System.out.printf("La posición del número %d es %d.\n", numeros[i],i+1);
        }

    }
}
