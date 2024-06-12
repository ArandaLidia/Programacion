package IF;

import java.util.Scanner;


public class T3_3 {
    public static void main(String[] args) {
/*Léase un número entero. Se comprobará si dicho número es o no múltiplo de 20,
 y también se comprobará si está o no entre -100 y 100.
 En la salida se mostrará uno de los siguientes menasajes:
 -“Es múltiplo de 20 y está entre -100 y 100”.
 - “Es múltiplo de 20 y no está entre -100 y 100”.
 - “No es múltiplo de 20 y está entre -100 y 100”-
 - “No es múltiplo de 20 y no está entre -100 y 100”.
 ** * Un número es múltiplo de otro cuando su resto es igual a 0 **
 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        double numero = scanner.nextDouble();
        double numero2 = 20;
        double resto = numero % numero2;
        /* System.out.println(resto); // Para que yo pueda comprobar si es multiplo  o no de 20.*/

        if (numero >= -100 && numero <= 100 && resto == 0) {
            System.out.println("Es multiplo de 20 y está entre -100 y 100");
        } else if (numero > -100 && numero > 100 && resto == 0) {
            System.out.println("Es multiplo de 20 y no está entre -100 y 100");
        } else if (numero >= -100 && numero <= 100 && resto != 0) {
            System.out.println("No multiplo de 20 y  está entre -100 y 100");
        } else if (numero < -100 || numero > 100 && resto != 0) {
            System.out.println("No es multiplo de 20 y no está entre -100 y 100");
        }

    }
}