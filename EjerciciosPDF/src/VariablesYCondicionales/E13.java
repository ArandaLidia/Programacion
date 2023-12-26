package VariablesYCondicionales;

import java.util.Scanner;

/*. Pedir un número entre 0 y 9.999, decir si es capicúa.*/
public class E13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = scanner.nextInt();
        int millar = num / 1000;
        int resto = num % 1000;
        int centena = resto / 100;
        resto = resto % 100;
        int decena = resto / 10;
        int unidades = resto % 10;

        if (num > 9999 || num < 0) {
            System.out.println("El número no está dentro de rango.");
        } else if (num < 10) {
            System.out.println("El número es capicúa.");
        } else if (num < 100 && unidades == decena) {
            System.out.println("El número es capicúa");
        } else if (num < 1000 && centena == unidades) {
            System.out.println("El número es capicúa.");
        } else if (millar == unidades && centena == decena) {
            System.out.println("El número es capicúa.");
        } else {
            System.out.println("El número no es capicúa.");
        }

    }
}
