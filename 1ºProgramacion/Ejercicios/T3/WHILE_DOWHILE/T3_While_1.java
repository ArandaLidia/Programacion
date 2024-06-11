package WHILE_DOWHILE;

import java.util.Scanner;

public class T3_While_1 {
    public static void main(String[] args) {
    int sumanumeros = 0;
    int numero = 0;
    Scanner scanner = new Scanner(System.in);
    do {
        System.out.println("Introduce un número");
        numero = scanner.nextInt();
        if (numero > 0) {
            sumanumeros += numero;
        }
    } while (numero != 0);
    System.out.println("La suma de los números es: " + sumanumeros);
}
}
