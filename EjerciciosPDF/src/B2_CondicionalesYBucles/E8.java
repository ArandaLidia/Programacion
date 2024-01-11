package B2_CondicionalesYBucles;

import java.util.Scanner;

/*Pedir un número N, y mostrar todos los números del 1 al N.
 */
public class E8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un número.");
        int numN= scanner.nextInt();
int contador=0;

        for (int i = 1; i < numN+1; i++) {
            System.out.print(i+"\t");
        }



    }
}
