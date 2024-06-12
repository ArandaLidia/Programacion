package B2_CondicionalesYBucles;

import java.util.Scanner;

/*Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.*/
public class E21 {
    public static void main(String[] args) {
boolean contadorNegativo=false;
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el número "+(i+1)+":");
            int num= scanner.nextInt();
            if (num<0){
                contadorNegativo=true;
                break;
            }
        }
        if(contadorNegativo){
            System.out.println("Has introducido algún número negativo.");
        }else {
            System.out.println("No has introducido ningún número negativo.");
        }
    }
}
