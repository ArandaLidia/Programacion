package IF;

import java.util.Scanner;

public class IF1 {
    public static void main(String[] args) {
/*Hágase un programa que lea dos enteros y
compruebe si el primero es o no mayor que el segundo.
En la salida se mostrará “El primero es mayor que el segundo” o
“El primero no es mayor que el segundo”.
 */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce el número 1");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce el número 2");
        int numero2= scanner.nextInt();
        if(numero1>numero2){;
            System.out.println("El primero es mayor que el segundo");
        }else{
            System.out.println("El primero no es mayor que el segundo");
        }
    }
}
