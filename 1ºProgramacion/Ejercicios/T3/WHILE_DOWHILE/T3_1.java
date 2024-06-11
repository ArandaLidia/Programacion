package WHILE_DOWHILE;
/*Leer números enteros hasta introducir un 0. El programa obtendrá la suma de todos
los números positivos. (SumarPositivos)*/

import java.util.Scanner;

public class T3_1 {
    public static void main(String[] args) {
        int sumanumeros = 0;
        int numero = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Introduce un número");
            numero = scanner.nextInt();
            if (numero > 0) {
                sumanumeros += numero;
            }
        } while (numero != 0);
        System.out.println("La suma de los números es: " + sumanumeros);
    }
}

