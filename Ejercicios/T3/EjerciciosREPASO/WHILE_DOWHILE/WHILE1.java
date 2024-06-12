package WHILE_DOWHILE;

import java.util.Scanner;

/*Leer números enteros hasta introducir un 0. El programa obtendrá la suma de todos
los números positivos. (SumarPositivos)*/
public class WHILE1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numero;
        int contador=0;
        do{
            System.out.println("Imtroduce un número: ");
            numero= sc.nextInt();
            if(numero>0){
                contador+=numero;
            }

        }while(numero!=0);
        System.out.println("La suma de los números positivos es "+contador+":");
        }
    }

