package IF;

import java.util.Scanner;

/**
 * Hágase un programa que lea tres enteros positivos,
 * y compruebe si alguno es suma de los otros dos. En la salida se mostrará
 * “Ninguno es suma de los otros dos” o “8 = 2 + 6” (en este último caso se introdujeron los números 2, 8 y 6). SumaTres.java
 */

/**
 * @author lidia
 */
public class T3_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número 1");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce el número 2");
        int numero2 = scanner.nextInt();
        System.out.println("Introduce el número 3");
        int numero3 = scanner.nextInt();

        if (numero1 == numero2 + numero3) {
            System.out.println(numero1 + "=" + numero2 + "+" + numero3);
        } else if (numero2 == numero3 + numero1) {
            System.out.println(numero2 + "=" + numero3 + "+" + numero1);
        } else if (numero3 == numero1 + numero2) {
            System.out.println(numero3 + "=" + numero1 + "+" + numero2);
        } else {
            System.out.println("Ninguno es la suma de los otros 2.");
        }
    }
}