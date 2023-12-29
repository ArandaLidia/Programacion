package CondicionalesYBucles;

import java.util.Scanner;

/*Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
*/
public class E20 {
    public static void main(String[] args) {
        int sueldoMaximo=0;
        int sueldo=0;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce el número de sueldos que vas a introducir: ");
        int n= scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Sueldo nº "+(i+1)+" ");
            sueldo= scanner.nextInt();
            if (sueldo>sueldoMaximo){
                sueldoMaximo=sueldo;
            }
        }
        System.out.println("El sueldo máximo es: "+sueldoMaximo);
    }
}
