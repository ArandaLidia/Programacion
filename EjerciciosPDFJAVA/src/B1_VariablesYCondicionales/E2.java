package B1_VariablesYCondicionales;

import java.util.Scanner;

/*Pedir el radio de un círculo y calcular su área. A=PI*r^2.*/
public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el radio del circulo ");
        int radio= scanner.nextInt();
        double area=(Math.PI*Math.pow(radio,2));
        System.out.printf("El área del circulo es %.2f", area);
    }
}
