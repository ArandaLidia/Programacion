package Tablas;

import java.util.Arrays;
import java.util.Scanner;

/*Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma: el 1º de A, el 1º
de B, el 2º de A, el 2º de B, etc.
*/
public class E5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []tabla1=new int[10];
        int[]tabla2=new int[10];
        int[]tabla3=new int[20];
        for (int i = 0; i <10; i++) {
            System.out.println("Introduce el número :"+(i+1)+":");
            tabla1[i]= scanner.nextInt();
        }
        for (int j = 0; j < 10; j++) {
            System.out.println("Introduce el número :"+(j+1)+":");
            tabla2[j]= scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            tabla3[i]=+i;
            for (int j = 0; j < 10; j++) {
                tabla3[j]=+j;
            }
        }
        System.out.println(Arrays.toString(tabla3));
    }
}
