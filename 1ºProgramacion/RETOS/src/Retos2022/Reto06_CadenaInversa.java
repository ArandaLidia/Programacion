package Retos2022;

import java.util.Scanner;

/*
 * Reto #6
 * INVIRTIENDO CADENAS
 * Fecha publicación enunciado: 07/02/22
 * Fecha publicación resolución: 14/02/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
public class Reto06_CadenaInversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto: ");
        String cadena = sc.nextLine();
        char reves[] = cadena.toCharArray(); //En el array de char[], se guardan los caracteres del String cadena.
        for (int i = reves.length - 1; i >= 0; i--) { //Desde i= Longitud de cadena -1, hasta i mayor o igual que 0, y --

            System.out.print(reves[i]); //Imprime el array reves[i] con cada posición de i.
        }
    }
}