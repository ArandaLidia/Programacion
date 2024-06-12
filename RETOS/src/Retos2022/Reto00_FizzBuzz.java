package Retos2022;
/*
* * Reto #0
 * EL FAMOSO "FIZZ BUZZ"
 * Fecha publicación enunciado: 27/12/21
 * Fecha publicación resolución: 03/01/22
 * Dificultad: FÁCIL
 * Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 *
 * */
public class Reto00_FizzBuzz {
    public static void main(String[] args) {
int multiplo3=0;
int multiplo5=0;
int multiplo5y3=0;
        for (int i = 0; i <=100 ; i++) {
            System.out.println();
            if((i%5==0) &&(i%3==0)){
                System.out.println("fizz buzz");

            }else if(i%5==0){
                System.out.println("buzz");

            }else if(i%3==0){
                System.out.println("fizz");
            }else{
                System.out.println(i);
            }
        }
    }
}
