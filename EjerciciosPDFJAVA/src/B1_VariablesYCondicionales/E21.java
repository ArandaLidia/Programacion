package B1_VariablesYCondicionales;

import java.util.Scanner;

/*Pedir una nota numérica entera entre 0 y 10, y mostrar dicha nota de la forma: cero, uno, dos, tres...
*/
public class E21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una número del 0 al 10:");
        int numero = scanner.nextInt();
        switch (numero) {
            case 0:
                nota0();
                break;
            case 1:
                System.out.println("UNO");
                break;
            case 2:
                System.out.println("DOS.");
                break;
            case 3:
                System.out.println("TRES");
                break;
            case 4:
                System.out.println("CUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
            case 6:
                System.out.println("SEIS");
                break;
            case 7:
                System.out.println("SIETE");
                break;
            case 8:
                System.out.println("OCHO");
                break;
            case 9:
                System.out.println("NUEVE");
                break;
            case 10:
                System.out.println("DIEZ");
                break;
            default:
                System.out.println("Nota no contemplada.");

        }
    }
        public static void nota0(){
            System.out.println("CERO");
        }

    }

