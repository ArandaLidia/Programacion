package VariablesYCondicionales;

import java.util.Scanner;

/*Pedir dos números y decir si uno es múltiplo del otro.
 */
public class E6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce el número 1: ");
        int num1= scanner.nextInt();
        System.out.println("Introduce el número2: ");
        int num2= scanner.nextInt();

        if(num1%num2==0){
            System.out.println("El número "+num1+" es múltiplo del número "+num2);
        }else{
            System.out.println("El número "+num1+" no es múltiplo del número "+num2);
        }
    }
}
