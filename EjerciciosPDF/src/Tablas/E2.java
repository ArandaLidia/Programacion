package Tablas;

import java.util.Scanner;

/*Leer 5 números y mostrarlos en orden inverso al introducido.
*/
public class E2 {
    public static void main(String[] args) {
        int[]tabla=new int[5];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un número:");
            tabla[i]= scanner.nextInt();
        }
        for (int i = 4  ; i >=0 ; i--) {
            System.out.println(tabla[i]);
        }
    }
}
