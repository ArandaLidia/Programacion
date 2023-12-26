package VariablesYCondicionales;

import java.util.Scanner;

/*Pedir un número e indicar si es positivo o negativo.*/
public class E5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un número para saber si es positivo o negativo.");
        int num= scanner.nextInt();
        if(num<0){
            System.out.println("El número es negativo.");
        }else{
            System.out.println("El número es positivo.");
        }
    }
}