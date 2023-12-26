package CuadradoMagico;

import java.util.Scanner;

public class magicogpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño del cuadrado mágico (debe ser un número impar):");
        int lado = sc.nextInt();

        if (lado % 2 == 0) {
            System.out.println("El tamaño debe ser un número impar para crear un cuadrado mágico.");
            return;
        }
        int[][] cuadrado = new int[lado][lado];
        int num = 1;
        int i = 0;
        int j = lado / 2;

        while (num <= lado * lado) {
            cuadrado[i][j] = num;
            num++;
            i--;
            j++;

            if (i == -1 && j == lado) {
                i = 1;
                j = lado - 1;
            } else {
                if (i < 0) {
                    i = lado - 1;
                }
                if (j == lado) {
                    j = 0;
                }
            }

            if (cuadrado[i][j] != 0) {
                i = i + 2;
                j--;
            }
        }

        // Mostrar el cuadrado mágico
        System.out.println("El cuadrado mágico es:");
        for (int[] fila : cuadrado) {
            for (int item : fila) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}

