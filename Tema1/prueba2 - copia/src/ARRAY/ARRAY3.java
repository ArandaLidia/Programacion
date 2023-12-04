package ARRAY;
import java.util.Scanner;

public class ARRAY3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Introduce un número en la posición %d:\n", (i + 1));
            int numero = sc.nextInt();
            numeros[i] = numero;
        }

        System.out.println("Orden inverso:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " \t");
        }
        System.out.println("");
        System.out.println("Orden normal:");
        for (int imprimir : numeros) {
            System.out.print(imprimir + " \t");
        }
    }
}