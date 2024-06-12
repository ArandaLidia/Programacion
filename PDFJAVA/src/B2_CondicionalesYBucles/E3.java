package B2_CondicionalesYBucles;

import java.util.Scanner;

/*Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.*/
public class E3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduce un número para saber si es par o impar:");
            num= scanner.nextInt();
            if(num==0){
                System.out.println("Has introducido el 0. Programa terminado.");
            } else if (num%2!=0) {
                System.out.printf("El número %d es impar.\n", num);
            }else if(num%2==0){
                System.out.printf("El número %d es par.\n", num);
            }

        }while (num!=0);
    }
}
