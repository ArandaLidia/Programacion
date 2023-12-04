package IF;

import java.util.Scanner;

//Leer tres enteros y mostrarlos ordenados.
public class IF8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el número 1:");
        int n1= sc.nextInt();
        System.out.println("Introduce el número 2:");
        int n2= sc.nextInt();
        System.out.println("Introduce el número 3:");
        int n3= sc.nextInt();

        if (n1<n2&&n2<n3) {
            System.out.println("Los números ordenados son "+n1+" "+n2+" "+n3+".");
        } else if (n1<n3&&n3<n2) {
            System.out.println("Los números ordenados son "+n1+" "+n3+" "+n2+".");
        }else if (n2<n1&&n1<n3) {
            System.out.println("Los números ordenados son "+n2+" "+n1+" "+n3+".");
        }else if (n2<n3&&n3<n1) {
            System.out.println("Los números ordenados son "+n2+" "+n3+" "+n1+".");
        }else if (n3<n1&&n1<n2) {
            System.out.println("Los números ordenados son "+n3+" "+n1+" "+n2+".");
        }else if (n3<n2&&n2<n1) {
            System.out.println("Los números ordenados son "+n3+" "+n2+" "+n1+".");
        }
    }
}
