package B4_Tablas;

import java.util.Scanner;

/*Leer 5 números y mostrarlos en el mismo orden introducido.*/
public class E1 {
    public static void main(String[] args) {
        int[] num =new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce el número "+(i+1)+":");
            num[i]= scanner.nextInt();
        }
        for (int item :
                num) {
            System.out.print(item+"\t");
        }
    }
}
