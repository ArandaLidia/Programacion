package IF;

/*5. Determinar si un número natural de 4 dígitos (entre 1000 y 9999) es capicúa. Se comprobará previamente que el número introducido tiene 4 dígitos.
En la salida se mostrará uno de los siguientes mensajes:
    1. “El número no tiene 4 dígitos”;
    2. “Es capicúa”
    3. “No es capicúa”.
    - * Un número es capicúa cuando se lee igual de izquierda a derecha que de derecha a izquierda **
*/
import java.util.Scanner;

public class T3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número de 4 dígitos");
        int numero = scanner.nextInt();
        int millares = numero / 1000;
        int restante = numero % 1000; // 321
        int centenas = restante / 100;
        restante = restante % 100;// 21
        int decenas = restante / 10;
        int unidades = restante % 10;

        if (numero >= 1000 && numero <= 9999) {
            if (unidades == millares) {
                if (decenas == centenas) {
                    System.out.println("El número es capicúa.");
                }
            } else {
                System.out.println("El número no es capicúa.");
            }
        } else {
            System.out.println("El número no tiene 4 dígitos");
        }
    }
}
