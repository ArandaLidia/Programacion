package CondicionalesYBucles;

import java.util.Scanner;

/*Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca
un 0.
*/
public class E2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduce un número");
            num= scanner.nextInt();
            if (num > 0) {
                System.out.printf("El número %d es positivo.\n", num);
            } else if (num<0) {
                System.out.printf("El número %d es negativo. \n",num);
            }else {
                System.out.println("Programa finalizado.");
            }


        }while (num!=0);

        }
}
