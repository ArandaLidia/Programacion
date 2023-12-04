package SWITCH;
/*Escribe un programa que solicite al usuario ingresar un número del 1 al 12 y muestre la estación del año
correspondiente (por ejemplo, "Primavera", "Verano", "Otoño", "Invierno") utilizando una sentencia switch.*/

import java.util.Scanner;

public class T3_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 12.");
        int numero = scanner.nextInt();

        switch (numero){
        case 1 :
            System.out.println("El número elegido corresponde a invierno.");
        break;
        case 2:
            System.out.println("El número elegido corresponde a invierno.");
            break;
        case 3:
            System.out.println("El número elegido corresponde a invierno.");
            break;
        case 4:
            System.out.println("El número elegido corresponde a primavera.");
            break;
        case 5:
            System.out.println("El número elegido corresponde a primavera.");
            break;
        case 6:
            System.out.println("El número elegido corresponde a primavera.");
            break;
        case 7:
            System.out.println("El número elegido corresponde a verano.");
            break;
        case 8:
            System.out.println("El número elegido corresponde a verano.");
            break;
        case 9:
            System.out.println("El número elegido corresponde a verano.");
            break;
        case 10:
            System.out.println("El número elegido corresponde a otoño.");
            break;
        case 11:
            System.out.println("El número elegido corresponde a otoño.");
            break;
        case 12:
            System.out.println("El número elegido corresponde a otoño.");
            break;
        default:
            System.out.println("El numero elegido no está dentro de rango");

    }
}
}