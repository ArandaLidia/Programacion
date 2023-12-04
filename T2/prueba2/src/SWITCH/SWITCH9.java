package SWITCH;

import java.util.Scanner;

/*9. Escribe un programa que solicite al usuario ingresar un número del 1 al 12 y muestre la estación del año correspondiente (por ejemplo, "Primavera", "Verano", "Otoño", "Invierno") utilizando una sentencia switch.
10.*/
public class SWITCH9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 12");
        int mes= sc.nextInt();
        switch (mes){
            case 1:
            case 2:
            case 3:
                System.out.println("El mes introducido corresponde a invierno.");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("El mes introducido corresponde a primavera.");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("El mes introducido corresponde a verano.");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("El mes introducido corresponde a otoño.");
                break;
            default:
                System.out.println("Valor introducido no válido.");

        }
    }

}
