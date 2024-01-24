package B2_CondicionalesYBucles;

import java.util.Scanner;

/*Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número.*/
public class E16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 10");
        int num= scanner.nextInt();
        if(num>=0&&num<=10){
            for (int i = 0; i <= 10; i++) {
                System.out.println((num)+"*"+(i)+"="+(num*i));

            }
        }else {
            System.out.println("El número introducido no está dentro del valor pedido.");
        }
    }
}
