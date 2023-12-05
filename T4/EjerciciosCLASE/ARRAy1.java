package EjerciciosCLASE;

import java.util.Arrays;
import java.util.Scanner;

/*1. (MultiplicarArray) Crear un array de 5 posiciones:
    - se le pedirá al usuario que introduzca cada unos de los elementos del array
    - Multiplica cada elemento del array * 2 y vuelve a guardar su valor
    - Saca por consola la suma de todos los números
    - Saca la media de todos los elementos*/
public class ARRAy1 {
    public static void main(String[] args) {
        int[]array=new int[5];
        int numeronumeros=0;
        Scanner sc=new Scanner(System.in);
        int suma=0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce un número:");
            array[i]= sc.nextInt();
            suma+=array[i];
            numeronumeros++;
        }
        System.out.println(" ");
        System.out.println("Los numeros introducidos en el array son:");

        for (int item :
                array) {
            System.out.print(item+" \t");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Los números multiplicado por 2 son: ");
        for (int item :
                array) {
            item*=2;
            System.out.print(item+" \t");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("La suma de todos los números es: "+suma);
        System.out.println(" ");
        System.out.println("La media es "+(suma/numeronumeros));

    }
}
