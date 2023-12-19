package Retos2022;
/*
 * Reto #8
 * DECIMAL A BINARIO
 * Fecha publicación enunciado: 18/02/22
 * Fecha publicación resolución: 02/03/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa se encargue de transformar un número decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

import java.util.Scanner;

public class Reto08_Binario {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el número que quieres pasar de sistema decimal a sistema binario: ");
        int numero= sc.nextInt();
        String numBinario=""; //String donde se guardará el número binario
        while(numero>0) { //El bucle while se repite mientras numero sea mayor que 0
            int resto=numero%2; //Se calcula el resto de dividir el número entre 2
            numBinario=resto+numBinario; //En el String numBinario, se guarda el resto
            numero/=2; //Devide el número decimal entre 2, para la siguiente vuelta del bucle, cuando este número llega a 0, sale del while y ejecuta el print.
        }
        System.out.println("El número decimal pasado a número binario es: "+numBinario);
    }
}
