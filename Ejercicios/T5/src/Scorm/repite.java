package Scorm;

import java.util.Scanner;

public class repite {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un número a repetir:");
        int num= scanner.nextInt();
        System.out.println("Introduce el número de veces que lo quieres repetir: ");
        int numRepite= scanner.nextInt();
        repite(num,numRepite);
    }
    public static void repite(int a, int b){
        for (int i = 0; i < b; i++) {
            System.out.println(a);

        }

    }
}
