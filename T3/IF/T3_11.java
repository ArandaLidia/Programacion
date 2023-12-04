package IF;

import java.util.Scanner;

/*Se leen tres enteros y un valor booleano para ordenarlos ascendentemente o descendentemente. Se mostrarán los valores leídos ordenados.*/
public class T3_11 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce el número 1:");
        int numero1= scanner.nextInt();
        System.out.println("Introduce el número 2:");
        int numero2= scanner.nextInt();
        System.out.println("Introduce el número 3:");
        int numero3= scanner.nextInt();
        System.out.println("¿Ordenar en ascendente? true/false");
        boolean ascendente= scanner.nextBoolean();

        if (!ascendente) {
            if (numero1 > numero2 && numero1 > numero3) {
                if (numero2 > numero3) {
                    System.out.println(numero1 + " " + numero2 + " " + numero3);
                } else {
                    System.out.println(numero1 + " " + numero3 + " " + numero2);
                }
            } else if (numero2 > numero1 && numero1 > numero3) {
                if (numero1 > numero3) {
                    System.out.println(numero2 + " " + numero1 + " " + numero3);
                } else {
                    System.out.println(numero2 + " " + numero3 + " " + numero1);
                }
            } else if (numero3 > numero2 && numero3 > numero1) {
                if (numero1 > numero2) {
                    System.out.println(numero3 + " " + numero1 + " " + numero2);
                } else {
                    System.out.println(numero3 + " " + numero2 + " " + numero1);
                }
            }
        } else {
            if (numero1 > numero2 && numero1 > numero3) {
                if (numero2 > numero3) {
                    System.out.println(numero3 + " " + numero2 + " " + numero1);
                } else {
                    System.out.println(numero2 + " " + numero3 + " " + numero1);
                }
            } else if (numero2 > numero1 && numero1 > numero3) {
                if (numero1 > numero3) {
                    System.out.println(numero3 + " " + numero1 + " " + numero2);
                } else {
                    System.out.println(numero1 + " " + numero3 + " " + numero2);
                }
            } else if (numero3 > numero2 && numero3 > numero1) {
                if (numero1 > numero2) {
                    System.out.println(numero2 + " " + numero1 + " " + numero3);
                } else {
                    System.out.println(numero1 + " " + numero2 + " " + numero3);
                }
            }
        }
    }
}