package SWITCH;

import java.util.Scanner;

/*Escribe un programa que pida al usuario ingresar un número del 1 al 12 y muestre el nombre del mes correspondiente utilizando una sentencia switch.*/
public class SWITCH5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa un número del 1 al 12:");
        int mes= sc.nextInt();
        switch (mes){
            case 1:
                System.out.println("El número 1 corresponde al mes de enero");
                break;
            case 2:
                System.out.println("El número 2 corresponde al mes de febrero");
                break;
            case 3:
                System.out.println("El número 3 corresponde al mes de marzo");
                break;
            case 4:
                System.out.println("El número 4 corresponde al mes de abril");
                break;
            case 5:
                System.out.println("El número 5 corresponde al mes de mayo");
                break;
            case 6:
                System.out.println("El número 6 corresponde al mes de junio");
                break;
            case 7:
                System.out.println("El número 7 corresponde al mes de julio");
                break;
            case 8:
                System.out.println("El número 8 corresponde al mes de agosto");
                break;
            case 9:
                System.out.println("El número 9 corresponde al mes de septiembre");
                break;
            case 10:
                System.out.println("El número 10 corresponde al mes de octubre");
                break;
            case 11:
                System.out.println("El número 11 corresponde al mes de noviembre");
                break;
            case 12:
                System.out.println("El número 12 corresponde al mes de diciembre");
                break;
            default:
                System.out.println("Ese número no corresponde a ningún mes");

        }
    }
}
