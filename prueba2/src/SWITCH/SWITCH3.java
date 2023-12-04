package SWITCH;

import java.util.Scanner;

/*Desarrolla un programa que reciba un número entero y, utilizando una sentencia switch, determine si es par o impar.*/
public class SWITCH3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int numero = sc.nextInt();
        int par = numero % 2;

         switch (par) {
            case (0):
                System.out.println("El numero es par");
                break;
            default:
                System.out.println("El numero es impar");

        }
    }
}