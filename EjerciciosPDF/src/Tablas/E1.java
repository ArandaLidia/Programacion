package Tablas;

import java.util.Scanner;

/*Leer 5 números y mostrarlos en el mismo orden introducido.*/
public class E1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[]tabla=new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el número "+(i+1) );
            tabla[i]=scanner.nextInt();
        }
        for (int item :
                tabla) {
            System.out.println(item);
        }
    }
}
