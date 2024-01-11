package B2_CondicionalesYBucles;

import java.util.Scanner;

/*. Pedir 15 números y escribir la suma total.*/
public class E10 {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sumaNum=0;
        for (int i = 0; i < 15; i++) {
            System.out.println("Introduce el número "+(i+1)+":");
            int num= scanner.nextInt();
            sumaNum+=num;

        }
        System.out.println("La suma de los número es "+sumaNum);
    }
}
