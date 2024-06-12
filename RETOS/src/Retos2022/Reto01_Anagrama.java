package Retos2022;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 */
public class Reto01_Anagrama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la palabra 1: ");
        String palabra1 = sc.next().toLowerCase(); // escaner y pasa toda la palabra a minuscula
        System.out.println("Introduce la palabra 2: ");
        String palabra2 = sc.next().toLowerCase();
        char[] letras1=new char[palabra1.length()]; //inicializa el array con el número de posiciones que tiene la palabra.
        char[] letras2=new char[palabra2.length()];
        if (palabra1.length() == palabra2.length()) { //compara la longitud de la palabra 1 y la palabra 2
            letras1 = palabra1.toCharArray(); //pasa de un strig a  un array de char
            letras2 = palabra2.toCharArray();
        }
        Arrays.sort(letras1); //ordena el array por orden alfabético
        Arrays.sort(letras2);
boolean anagramas = Arrays.equals(letras1,letras2); // un boolean que compara los dos arrays.
        if(anagramas){ // if que dice que hacer si el boolean sale false o true
            System.out.println("Las palabras "+palabra1+" y "+palabra2+" son anagramas.");
        }else{
            System.out.println("No son anagramas.");
        }

    }
}
