package CondicionalesYBucles;

import java.util.Scanner;

/*Pedir un número y calcular su factorial.*/
public class E12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un número para obtener su factorial: ");
        int num= scanner.nextInt();
        int factorial=1;
        for (int i = 1; i < num+1; i++) {
            factorial*=i;

        }
        System.out.printf("El factorial del número %d es %d.\n",num,factorial);
    }
}
