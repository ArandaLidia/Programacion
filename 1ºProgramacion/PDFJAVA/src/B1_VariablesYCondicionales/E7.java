package B1_VariablesYCondicionales;

import java.util.Scanner;

/*Pedir dos números y decir cual es el mayor.*/
public class E7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce el número 1 a comparar: ");
        int num1= scanner.nextInt();
        System.out.println("Introduce el número 2 a comparar: ");
        int num2= scanner.nextInt();

        if(num1>num2){
            System.out.println("El número "+num1+" es mayor que "+num2);
        }else{
            System.out.println(" El número "+num1+" es menor que "+num2);
        }
    }


}

