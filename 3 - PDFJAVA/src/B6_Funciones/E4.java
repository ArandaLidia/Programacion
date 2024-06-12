package B6_Funciones;

import java.util.Scanner;

/* Ídem una versión que calcule el máximo de una tabla de n elementos.*/
public class E4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int[] num=new int[scanner.nextInt()];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce el número "+(i+1)+":");
           num[i]= scanner.nextInt();
        }
        System.out.println("El número maximo es "+maximo(num));
    }
    public static int maximo(int[]tabla){
        int max=0;
        for (int item :
                tabla) {
            if(item>max){
            max=item;
            }
        }
        return max;
    }
}
