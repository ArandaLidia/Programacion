package CuadradoMagico;

import java.util.Scanner;

public class CuadradoMAGICO {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de posiciones por lado que tiene el cuadrado mágico:");
        int lado = sc.nextInt();
        int[][] cuadrado = new int[lado][lado];
       int aleatorio=0;
       boolean repetido=false;

            for (int i = 0; i < cuadrado.length; i++) {
                for (int j = 0; j < cuadrado[i].length; j++) {
                    aleatorio = (int) (Math.random() * (lado * lado)) + 1;

                    do {
                        for (int k = 0; k < j; k++) {
                            if (cuadrado[i][j] == aleatorio) {
                                repetido = true;
                                break;
                            }

                        }

                    } while (repetido) ;
                    cuadrado[i][j] = aleatorio;
                }

            }

        for (int[] fila :
                cuadrado) {
            for (int item:fila  ) {
                System.out.print(item+" ");
            }
            System.out.println(" ");

        }
    }
}
