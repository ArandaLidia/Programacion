package B6_Funciones;

import java.util.Scanner;

/*Diseñar una función que tenga como parámetros dos números, y que calcule el máximo.*/
public class E2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce el número 1:");
        int num1= scanner.nextInt();
        System.out.println("Introduce el número 2:");
        int num2= scanner.nextInt();
        System.out.println("El número máximo es "+maximo(num2,num1));
    }
    public static int maximo(int a, int b){
        int max;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        return max;
    }
}
