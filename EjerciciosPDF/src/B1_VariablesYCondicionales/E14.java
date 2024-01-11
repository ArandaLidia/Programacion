package B1_VariablesYCondicionales;

import java.util.Scanner;

/*Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
 */
public class E14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una nota del 1 al 10.:");
        int nota = scanner.nextInt();
        if (nota < 0 || nota > 10) System.out.println("El valor introducido no es válido.");
        else if (nota < 5) {
            System.out.println("INSUFICIENTE");
        } else if (nota == 5) {
            System.out.println("SUFICIENTE");
        } else if (nota==6) {
            System.out.println("BIEN");
        } else if (nota<9) {
            System.out.println("NOTABLE");
        } else if (nota<=10) {
            System.out.println("SOBRESALIENTE");

        }
    }
}
