package VariablesYCondicionales;

import java.util.Scanner;

/* Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis.*/
public class E22 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un número del 0 al 99: ");
        int num= scanner.nextInt();
        String[] unidades = {"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String[] especiales = {"diez", "once", "doce", "trece", "catorce", "quince"};
        String[] decenas = {"", "", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        if (num >= 0 && num <= 99) {
            if (num < 10) {
                System.out.println(unidades[num]);
            } else if (num < 16) {
                System.out.println(especiales[num - 10]);
            } else {
                int decena = num / 10;
                int unidad = num % 10;

                if (unidad == 0) {
                    System.out.println(decenas[decena]);
                } else {
                    System.out.println(decenas[decena] + " y " + unidades[unidad]);
                }
            }
        } else {
            System.out.println("Número fuera de rango.");
        }
    }
}
