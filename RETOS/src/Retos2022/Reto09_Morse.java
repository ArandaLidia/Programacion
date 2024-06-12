package Retos2022;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.SortedMap;

/*
 * Reto #9
 * CÓDIGO MORSE
 * Fecha publicación enunciado: 02/03/22
 * Fecha publicación resolución: 07/03/22
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que sea capaz de transformar texto natural a código morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en https://es.wikipedia.org/wiki/Código_morse.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
public class Reto09_Morse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el texto a traducir de texto morse a natural y viceversa.");
        String texto = sc.nextLine().toLowerCase();



        String morse=texto.replaceAll("a", "· —").replaceAll("b", "— · · ·").replaceAll("c", "— · — ·").replaceAll("ch", "— — — —").replaceAll("d", "— · ·").replaceAll("e", "·").replaceAll("f", "· · — ·").replaceAll("g", "— — ·").replaceAll("h", ".... ").replaceAll("i", ".. ").replaceAll("j", ".--- ").replaceAll("k", "-.- ").replaceAll("l", ".-.. ").replaceAll("m", "-- ").replaceAll("n", "-. ").replaceAll("o", "--- ").replaceAll("p", ".--. ").replaceAll("q", "--.- ").replaceAll("r", ".-. ").replaceAll("s", "... ").replaceAll("t", "- ").replaceAll("u", "..-").replaceAll("v", "...-").replaceAll("w", ".-- ").replaceAll("x", "-..- ").replaceAll("y", "-.-- ").replaceAll("z", "--.. ").replaceAll("1", ".---- ").replaceAll("2", "..--- ").replaceAll("3", "...-- ").replaceAll("4", "....-").replaceAll("5", "..... ").replaceAll("6", "-.... ").replaceAll("7", "--... ").replaceAll("8", "---.. ").replaceAll("9", "----. ").replaceAll("0", "-----");
        System.out.println(morse);

    }
}
//falta pasar de morse a natural.