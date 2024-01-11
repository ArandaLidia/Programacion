package B1_VariablesYCondicionales;

import java.util.Arrays;
import java.util.Scanner;

/*Pedir tres números y mostrarlos ordenados de mayor a menor.
 */
public class E10 {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número 1: ");
        n1 = scanner.nextInt();
        System.out.println("Introduce el número 2: ");
        n2 = scanner.nextInt();
        System.out.println("Introduce el número 3: ");
        n3 = scanner.nextInt();

        if (n1 > n2 && n2 > n3) {
            System.out.printf("Los números ordenados de mayor a menor son: %d, %d y %d.", n1, n2, n3);
        } else if (n1 > n3 && n3 > n2) {
            System.out.printf("Los números ordenados de mayor a menor son: %d, %d y %d.", n1, n3, n2);
        } else if (n2 > n1 && n1 > n3) {
            System.out.printf("Los números ordenados de mayor a menor son: %d, %d y %d.", n2, n1, n3);
        } else if (n2 > n3 && n3 > n1) {
            System.out.printf("Los números ordenados de mayor a menor son: %d, %d y %d.", n2, n3, n1);
        } else if (n3 > n1 && n1 > n2) {
            System.out.printf("Los números ordenados de mayor a menor son: %d, %d y %d.", n3, n1, n2);
        } else if (n3 > n2 && n2 > n1) {
            System.out.printf("Los números ordenados de mayor a menor son: %d, %d y %d.", n3, n2, n1);
        }
        System.out.println();
        System.out.println();


//Ordenar números con for y arrays.

        System.out.println("¿Cuántos números quieres ordenar?");
        int cantidadNumeros = scanner.nextInt();
        int[] numeros = new int[cantidadNumeros];

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.printf("Ingresa el número %d: ", i + 1);
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        System.out.print("Los números ordenados de mayor a menor son: ");
        for (int i = cantidadNumeros - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
