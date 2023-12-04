package SWITCH;
import java.util.Scanner;

//*Desarrolla un programa que solicite al usuario ingresar una nota del 1 al 5 y muestre un mensaje de calificación
// utilizando una sentencia switch (por ejemplo, "Suspenso", "Aprobado", "Notable", "Sobresaliente", etc.).*/
public class T3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la nota del 1 al 10.");
        int n1 = scanner.nextInt();
        switch (n1){
            case 1:
                System.out.println("Suspenso");
                break;
            case 2:
                System.out.println("Suspenso");
                break;
            case 3:
                System.out.println("Suspenso");
                break;
            case 4:
                System.out.println("Suspenso");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
                System.out.println("Notable bajo");
                break;
            case 8:
                System.out.println("Notable alto");
                break;
            case 9:
                System.out.println("Sobresaliente");
                break;
            case 10:
                System.out.println("Matricula de honor");
                break;
            default:
                System.out.println("No ha introducido una nota válida.");
        }
    }
}