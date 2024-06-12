package SWITCH;

import java.util.Scanner;

/*Realiza un programa que solicite al usuario ingresar un mes (como un número del 1 al 12) y muestre la cantidad de días que tiene ese mes, considerando años no bisiestos.*/
public class SWITCH4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un número de mes para saber cuantos días tiene:");
        int mes= sc.nextInt();

        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("El mes tiene 31 días");
                break;
            case 2:
                System.out.println("El mes tiene 28 días");
                break;
            default:
                System.out.println("El mes tiene 30 días");
        }
    }
}
