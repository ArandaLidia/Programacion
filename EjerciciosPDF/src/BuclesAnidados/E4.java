package BuclesAnidados;

import java.util.Scanner;

/*Dibuja un cuadrado de n elementos de lado utilizando *.*/
public class E4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce el número de elementos que tendrá el cuadrado.");
        int n= scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
