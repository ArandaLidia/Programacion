package B4_Tablas;

import java.util.Scanner;

/*Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma: el 1º de A, el 1º
de B, el 2º de A, el 2º de B, etc.
*/
public class E5 {
    public static <object> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tabla1 = new int[10];
        int[] tabla2 = new int[10];
        int[] tabla3 = new int[20];
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el número :" + (i + 1) + ":");
            tabla1[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el número " + (i + 1) + ":");
            tabla2[i] = scanner.nextInt();
        }
        int j=0;
        for (int i = 0; i < 10; i++) {
            tabla3[j]=tabla1[i];
            j++;
            tabla3[j]=tabla2[i];
            j++;
            }
        for (int k = 0; k <tabla3.length ; k++) {
            System.out.print(tabla3[k]+" ");
        }

        }


    }
