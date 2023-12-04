package SWITCH;

import java.util.Scanner;

/*7. Desarrolla un programa que solicite al usuario ingresar una nota del 1 al 5 y muestre un mensaje de calificación utilizando una sentencia switch (por ejemplo, "Suspenso", "Aprobado", "Notable", "Sobresaliente", etc.).
8.*/
public class SWITCH7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la calificación de 0 a 10:");
        int calificacion= sc.nextInt();
        switch (calificacion){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Calificación: Suspenso");
                break;
            case 5:
                System.out.println("Calificación: aprobado");
                break;
            case 6:
                System.out.println("Calificación: Bien");
                break;
            case 7:
            case 8:
                System.out.println("Califiación: Notable");
                break;
            case 9:
                System.out.println("Calificación: Sobresaliente");
                break;
            case 10:
                System.out.println("Calificación: Matrícula de honor");
                break;
            default:
                System.out.println("Calificación erronea");
        }
    }
}
