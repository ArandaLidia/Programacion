package B1_VariablesYCondicionales;

import java.util.Scanner;
/* Pedir dos números y decir si son iguales o no.*/
public class E4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce el primer número a comparar: ");
        int num1= scanner.nextInt();
        System.out.println("Introduce el segundo número a comparar: ");
        int num2= scanner.nextInt();

        if(num1==num2){
            System.out.println("Los números son iguales.");
        }else{
            System.out.println("Los números no son iguales.");
        }
    }
}
