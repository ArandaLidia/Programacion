/*Crea una función con la siguiente cabecera:
public String convierteEnPalabras(int n)
Esta función convierte los dígitos del número n en las correspondientes palabras y lo devuelve todo en una
cadena de caracteres. Por ejemplo, el 470213 convertido a palabras sería:
cuatro, siete, cero, dos, uno, tres
Utiliza esta función en un programa para comprobar que funciona bien. Desde la función no se debe
mostrar nada por pantalla, solo se debe usar print desde el programa principal. Fíjate que hay una coma
detrás de cada palabra salvo al final.*/

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero= sc.nextInt();



    }
    public static String convierteEnPalabras(int n){
        String palabra=String.valueOf(n);
        String[] letras=palabra.split("");
        for (int i = 0; i < letras.length; i++) {


        }
        return palabra;
    }

}
