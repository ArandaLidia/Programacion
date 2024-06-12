package B1_VariablesYCondicionales;

import java.util.Scanner;

/* Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.*/
public class E11 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un número entre 0 y 9.999: ");
        int num= scanner.nextInt();
        if(num>=0&&num<10){
            System.out.println("El número tiene una cifra.");
        }else if(num>=10&&num<100){
            System.out.println("El número tiene dos cifras.");
        }else if(num>=100&&num<1000){
            System.out.println("El número tiene tres cifras.");
        }else if(num>=1000&&num<10000){
            System.out.println("El número tiene cuatro cifras.");
        }


    }
}
