package B2_CondicionalesYBucles;

import java.util.Scanner;

/*Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.*/
public class E4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        int contador=0;
        do {
            System.out.println("Introduce un número: ");
            num= scanner.nextInt();

            if(num>=0){
                contador++;
            }
        }while (num>=0);
        System.out.printf("Se han introducido %d números positivos.\n",contador);
        System.out.println("Programa finalizado.");
    }
}
