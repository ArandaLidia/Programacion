package B2_CondicionalesYBucles;

import java.util.Scanner;

/*Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.*/
public class E6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        int sumaNumeros=0;
        do {
            System.out.println("Introduce un número para sumar. Teclee 0 para terminar el programa. ");
            num= scanner.nextInt();
            sumaNumeros+=num;
        }while (num!=0);
        System.out.println("Programa terminado.");
        System.out.println("La suma de todos los números es: "+sumaNumeros);
    }
}
