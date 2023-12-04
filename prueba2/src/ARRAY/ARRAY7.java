package ARRAY;

import java.util.Random;
import java.util.Scanner;

/*1. Crea un programa que pida 10 palabras por consola y las guarde en un array de String. Una vez hecho esto saldrá un menú que me dará las siguientes opciones:
    - Ver todas las palabras: mostrarla todas las palabras del array
    - Obtener una palabra al azar: mostrará una palabra de las que existen en el array
    - Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras
    - Ver media de letras: mostrará el número medio de letras entre todas las palabas
    - Ver palabra con más letras
    - Ver palabra con menos letras*/
public class ARRAY7 {
    public static void main(String[] args) {
        String[] palabras=new String[10];
        Scanner sc=new Scanner(System.in);
        int aleatorio=0;
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduce una palabra");
            palabras[i]=sc.nextLine();
        }
        System.out.println("Las palabras introducidas son: ");
        for (String item :
                palabras) {
            System.out.print(item+"\t");
        }
        System.out.println(" ");
            aleatorio= (int) (Math.random()* palabras.length);
            System.out.println("La palabra aleatoria es :"+palabras[aleatorio]);

        Random r =new Random();
        String palabra = palabras[r.nextInt(palabras.length)];
        System.out.println(palabra);



    }
}
