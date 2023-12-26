package VariablesYCondicionales;

import java.util.Scanner;

/*Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen,
debe indicarlo.*/
public class E1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese un valor para a: ");
        int valorA= scanner.nextInt();
        System.out.println("Ingrese un valor para b: ");
        int valorB= scanner.nextInt();
        System.out.println("Ingrese un valor para c: ");
        int valorC=scanner.nextInt();

        double raiz=(Math.pow(valorB,2)-(4*valorA*valorC));

        if(raiz==0){
            System.out.println("La solución es "+(-valorB+Math.sqrt(raiz))/(2*valorA));
        }else if(raiz<0){
            System.out.println("La operación no tiene solución. ");
        }else{
            System.out.println("Los valores de < x > son : "+((-valorB+Math.sqrt(raiz))/(2*valorA)) +" y "+((-valorB-Math.sqrt(raiz))/(2*valorA))  );
        }
    }
}
