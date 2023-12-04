package SWITCH;

import java.util.Scanner;

/*Escribe un programa en Java que solicite al usuario ingresar un número del 1 al 7 y muestre el día de la semana correspondiente utilizando una sentencia switch.*/
public class SWITCH1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 7: ");
        int opcion= sc.nextInt();
        switch (opcion){
            case 1:
                System.out.println("El día de la semana correspondiente es Lunes");
                break;
            case 2:
                System.out.println("El día de la semana correspondiente es martes");
                break;
            case 3:
                System.out.println("El día de la semana correspondiente es miércoles");
                break;
            case 4:
                System.out.println("El día de la semana correspondiente es jueves");
                break;
            case 5:
                System.out.println("El día de la semana correspondiente es viernes");
                break;
            case 6:
                System.out.println("El día de la semana correspondiente es sábado");
                break;
            case 7:
                System.out.println("El día de la semana correspondiente es domingo");
                break;
            default:
            System.out.println("La opción no está contemplada");


        }
    }

}
