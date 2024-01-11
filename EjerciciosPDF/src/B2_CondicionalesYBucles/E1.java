package B2_CondicionalesYBucles;

import java.util.Scanner;

/*Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número
negativo.
*/
public class E1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        do{
            System.out.println("Introduce un número:");
            num= scanner.nextInt();
            if(num>=0){
                int cuadrado=(int)Math.pow(num,2);
                System.out.printf("El cuadrado del número %d es %d.", num, cuadrado);
                System.out.println();
            }else {
                System.out.println("Programa finalizado.");
            }
        }while(num>=-1);
    }
}
