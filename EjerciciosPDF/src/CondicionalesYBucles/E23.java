package CondicionalesYBucles;

import java.util.Scanner;

/*Pedir 5 números e indicar si alguno es múltiplo de 3.*/
public class E23 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean multiplo=false;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el número "+(i+1)+":");
            int num= scanner.nextInt();
            if(num%3==0){
                multiplo=true;
                break;
            }
        }
        if (multiplo){
            System.out.println("Hay algún multiplo de 3.");
        }else{
            System.out.println("No hay multiplo de 3. ");
        }
    }
}
