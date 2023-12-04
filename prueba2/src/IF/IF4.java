package IF;


import java.util.Scanner;

/*4. Hágase un programa que compruebe si un año pedido por teclado es bisiesto.
En la salida se mostrará o “Es bisiesto” o “No es bisiesto”,)

    El algoritmo para obtener si un año es bisiesto es el siguiente: un año es bisiesto si es múltiplo de 4.

 */
public class IF4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un año para saber si es bisiesto");
        int anio = scanner.nextInt();


        if (anio%4!=0) {
            System.out.println("El año "+anio+ "no es bisiesto");
        } else {
            System.out.println("El año "+anio+" es bisiesto");
        }
    }
}