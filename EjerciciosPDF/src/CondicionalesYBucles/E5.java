package CondicionalesYBucles;

import java.util.Scanner;

/*Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo
números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina
cuando el usuario acierta.
*/
public class E5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numaleatorio=(int)((Math.random()*100)+1);
        int num;
        do {
            System.out.println("Adivina el número aleatorio introduciendo un número:");
            num= scanner.nextInt();
            if(num>numaleatorio){
                System.out.printf("El número aleatorio es menor que %d\n",num);
            }else{
                System.out.printf("El número aleatorio es mayor que %d.\n",num);
            }

        }while (numaleatorio!=num);
        System.out.println("Enhorabuena, has acertado el número aleatorio.");
    }
}
