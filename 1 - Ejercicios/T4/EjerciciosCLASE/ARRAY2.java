package EjerciciosCLASE;

import java.util.Arrays;
import java.util.Scanner;

/*2. (MayorArray) Crea una aplicación que realice lo siguiente:
    - pida por pantalla la longitud del array de enteros
    - crea el array de enteros con la longitud introducida
    - pida al usuario que introduzca todos los datos del array
    - saque por pantalla el elemento mayor y el elemento menor*/
//ordenar array de menor a mayor, imprimir posicion 0 e imprimir posición array.length.
public class ARRAY2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Imtroduce la longitud del array:");
        int[]array=new int[sc.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce los datos del array: ");
            array[i]= sc.nextInt();

        }
        System.out.println("Los valores introducidos del array son: ");
        for (int item :
                array) {
            System.out.print(item+" \t");
        }
        Arrays.sort(array);
        System.out.println(" ");
        System.out.println("EL valor menor del array es: "+array[0]);
        System.out.println("El valor mayor del array es: "+array[array.length-1]);

    }
}
