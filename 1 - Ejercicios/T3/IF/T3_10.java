package IF;

import java.util.Scanner;

/*Se lee un número entero. Dicho número se incrementará en una unidad si es par, y se decrementará en una unidad si es impar.
 Se muestra por consola el nuevo valor del número.*/
public class T3_10 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Inserte un número entero.");
        int numeroEntero= scanner.nextInt();
        int par=numeroEntero%2;
        if(par==0){
            System.out.println("Es par, por lo tanto el número ahora es: "+(numeroEntero+1));
        }else{
            System.out.println("Es impar, por lo tanto el número ahora es: "+(numeroEntero-1));
        }

    }
}
