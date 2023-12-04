package IF;

import java.util.Scanner;

/*5. Determinar si un número natural de 4 dígitos (entre 1000 y 9999) es capicúa. Se comprobará previamente que el número introducido tiene 4 dígitos. En la salida se mostrará uno de los siguientes mensajes:
    1. “El número no tiene 4 dígitos”;
    2. “Es capicúa”
    3. “No es capicúa”.
    - * Un número es capicúa cuando se lee igual de izquierda a derecha que de derecha a izquierda */
public class IF5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número de 4 dígitos");
        int numero= sc.nextInt();
        int millares=numero/1000;
        int restante=numero%1000;
        int centenas=restante/100;
        restante=restante%100;
        int decenas=restante/10;
        restante=restante%10;
        int unidades=restante/10;
        if(numero>=1000&&numero<=9999){
            if(restante==millares){
                if(centenas==decenas){
                    System.out.println("El número es capicúa.");
                }
            }else{
                System.out.println("El número no es capicúa.");
            }
        }else{
            System.out.println("Número fuera de rango.");
        }
    }
}
