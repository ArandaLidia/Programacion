package B6_Funciones;
/*Función a la que se le pasan dos enteros y muestra todos los números comprendidos entre ellos,
        inclusive.*/

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Introduce el número 2: ");
        int num2 = scanner.nextInt();
        mostrarNumeros(num1, num2);
    }

    public static void mostrarNumeros(int a, int b) {
        if (a <= b) {
            int[] numeros = new int[b - a + 1];  // Tamaño del array para almacenar los números
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = a + i;
            }

            // Mostrar los números
            System.out.println("Números entre " + a + " y " + b + " inclusive:");
            for (int numero : numeros) {
                System.out.print(numero + " ");
            }
        } else {
            // Si a es mayor que b, mostrar un mensaje indicando el error.
            System.out.println("Error: El primer número debe ser menor o igual al segundo número.");
        }
    }
}
