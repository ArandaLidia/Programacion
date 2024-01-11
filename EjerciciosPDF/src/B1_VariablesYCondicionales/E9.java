package B1_VariablesYCondicionales;

import java.util.Scanner;

/* Pedir dos números y mostrarlos ordenados de mayor a menor.
*/
public class E9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce el número 1: ");
        int num1= scanner.nextInt();
        System.out.println("Introduce el número 2: ");
        int num2= scanner.nextInt();

        if(num1>num2){
            System.out.println("Numeros ordenados de mayor a menor: "+num1+" "+num2);
        }else{
            System.out.println("Numeros ordenados de mayor a menor: "+num2+" "+num1);
        }
    }

}
