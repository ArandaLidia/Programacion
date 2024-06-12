package SWITCH;


import java.util.Scanner;

/*Crea un programa que permita al usuario ingresar un carácter y luego determine si es una vocal o una consonante
 utilizando una sentencia switch.

 */
public class T3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un carácter para determinar si es vocal o consonante");
        char caracter = scanner.next().charAt(0);
        switch (caracter) {
            case 'a':
                System.out.println("Es una vocal.");
                break;
            case 'e':
                System.out.println("Es una vocal.");
                break;
            case 'i':
                System.out.println("Es una vocal.");
                break;
            case 'o':
                System.out.println("Es una vocal.");
                break;
            case 'u':
                System.out.println("Es una vocal.");
                break;
            case 'A':
                System.out.println("Es una vocal.");
                break;
            case 'E':
                System.out.println("Es una vocal.");
                break;
            case 'I':
                System.out.println("Es una vocal.");
                break;
            case 'O':
                System.out.println("Es una vocal.");
                break;
            case 'U':
                System.out.println("Es una vocal.");
                break;
            default:
                System.out.println("Es una consonante.");


        }
    }
}