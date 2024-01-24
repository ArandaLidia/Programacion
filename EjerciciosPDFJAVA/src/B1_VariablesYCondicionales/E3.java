package B1_VariablesYCondicionales;

import java.util.Scanner;

/*Pedir el radio de una circunferencia y calcular su longitud.*/
public class E3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce el radio de la circuferencia: ");
        int radio= scanner.nextInt();
        double longitud=Math.PI*2*radio;
        System.out.printf("La longitud de la circuferencia es %.2f",longitud);
    }
}
