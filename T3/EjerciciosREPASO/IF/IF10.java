package IF;

import java.util.Scanner;

/*Se lee un número entero. Dicho número se incrementará en una unidad si es par, y se decrementará en una unidad si es impar.
 Se muestra por consola el nuevo valor del número.
 */
public class IF10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero= sc.nextInt();
        if(numero%2==0){
            System.out.println("El número es par y el nuevo número es "+(++numero));
        }else{
            System.out.println("El número es impar y el  nuevo número es "+(--numero));
        }
    }
}
