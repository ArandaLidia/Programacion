package ExplicaciónBORJA;

import java.util.Random;
import java.util.Scanner;

public class hola {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Random r = new Random();
    boolean encontrado = false;
    int[][] array;
    System.out.println("Introduce número");
    array = new int[s.nextInt()][s.nextInt()];
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            array[i][j] = r.nextInt(100); // Pongo el aleatorio de 0 a 100 para que sea más facil de averiguar pero
            // dejandolo en r.nextInt(); me saldían todos los enteros aleatorios
        }
    }

    System.out.println("Por favor, introduzca otro número");
    int nuevoN = s.nextInt();

    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            if (nuevoN == array[i][j]) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            break;
        }
    }
    if (encontrado) {
        System.out.println("El número se encuentra en el tablero");
    } else {
        System.out.println("El número no se encuentra en el tablero");
    }

}

}
