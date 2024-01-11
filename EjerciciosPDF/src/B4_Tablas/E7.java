package B4_Tablas;

import java.util.Scanner;

/*7. Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los números están
ordenados de forma creciente, decreciente, o si están desordenados.
*/

public class E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean creciente = true, decreciente = true;

        int[] tabla = new int[10];
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Introduce el número " + (i + 1) + ": ");
            tabla[i] = scanner.nextInt();
        }

        for (int i = 0; i < tabla.length - 1; i++) {
            if (tabla[i] > tabla[i + 1]) {
                creciente = false;
            } else if (tabla[i] < tabla[i + 1]) {
                decreciente = false;
            }
        }

        if (creciente) {
            System.out.println("Está ordenado de forma creciente.");
        } else if (decreciente) {
            System.out.println("Está ordenado de forma decreciente.");
        } else {
            System.out.println("Está desordenado.");
        }
    }
}
