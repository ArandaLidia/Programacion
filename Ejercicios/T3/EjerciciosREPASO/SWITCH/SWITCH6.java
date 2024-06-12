package SWITCH;
/*Crea un programa que permita al usuario ingresar un número del 1 al 4 y muestre un mensaje diferente para cada número utilizando una sentencia switch (por ejemplo, "Opción 1 seleccionada", "Opción 2 seleccionada", etc.).*/

import java.util.Scanner;

public class SWITCH6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa un número del 1 al 4:");
        int numero= sc.nextInt();
        switch (numero){
            case 1:
                System.out.println("Opción 1 seleccionada");
                break;
            case 2:
                System.out.println("Opción 2 seleccionada");
                break;
            case 3:
                System.out.println("Opción 3 seleccionada");
                break;
            case 4:
                System.out.println("Opción 4 seleccionada");
                break;
            default:
                System.out.println("Opción no contemplada");
        }
    }
}
