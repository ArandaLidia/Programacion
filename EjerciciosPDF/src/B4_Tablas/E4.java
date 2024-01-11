package B4_Tablas;

import java.util.Scanner;

/* Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el
penúltimo, el tercero, etc.
*/
public class E4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[]num=new int[10];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce el número "+(i+1)+":");
            num[i]= scanner.nextInt();
        }
        for (int i = 0; i < num.length/2; i++) {
            System.out.print(num[i]+" "+num[num.length-i-1]+" ");
        }
    }
}
