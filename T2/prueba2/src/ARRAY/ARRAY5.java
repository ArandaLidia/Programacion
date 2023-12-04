package ARRAY;

import java.util.Scanner;

/*Realiza un programa que pida 8 números enteros, los guarde en un array y que luego muestre esos números junto con la palabra “par” o “impar” según proceda.*/
public class ARRAY5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[]numeros=new int[8];
        int introduce=0;
        for (int i = 0; i <numeros.length; i++) {
            System.out.println("Introduce el número "+(i+1)+" ");
            introduce= sc.nextInt();
            numeros[i]=introduce;

        }
        for (int imprimir:numeros) {
            if(imprimir%2==0){
                System.out.println("El número "+imprimir+" es par.");
            }else{
                System.out.println("El número "+imprimir+" es impar.");
            }

        }

    }

}