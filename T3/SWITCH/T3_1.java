package SWITCH;

import java.util.Scanner;

//*Escribe un programa en Java que solicite al usuario ingresar un número del 1 al 7 y muestre el día de la semana
// correspondiente utilizando una sentencia switch.*//
public class T3_1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 7.");
        int valor = scanner.nextInt();
        switch(valor){
            case 1:
                System.out.println("El número 1 corresponde al día de la semana: lunes");
                break;
            case 2:
                System.out.println("El número 2 corresponde al día de la semana: martes");
                break;
            case 3:
                System.out.println("El número 3 corresponde al día de la semana: miércoles");
                break;
            case 4:
                System.out.println("El número 4 corresponde al día de la semana: jueves");
                break;
            case 5:
                System.out.println("El número 5 corresponde al día de la semana: viernes");
                break;
            case 6:
                System.out.println("El número 6 corresponde al día de la semana: sábado");
                break;
            case 7:
                System.out.println("El número 7 corresponde al domingo");
                break;
            default:
                System.out.println("El valor no está entre los números 1 y 7");
        }





    }

}
