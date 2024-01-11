package B4_Tablas;

import java.util.Scanner;

/*Leer 5 números y mostrarlos en orden inverso al introducido.*/
public class E2 {
    public static void main(String[] args) {
        int[] num = new int[5];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce el número "+(i+1)+":");
            num[i]= scanner.nextInt();
        }
        for (int i = num.length; i >0 ; i--) {
            System.out.print(i+"\t");
        }
    }
}
