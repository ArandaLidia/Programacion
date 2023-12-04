package EXPLICACION;

import java.util.Scanner;

public class entornostrimestral {
    public static void main(String[] args) {
        int aleatoriotablero=0;
        boolean encontrado=false;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce el número de columnas: ");
        System.out.println("Introduce el  número de filas: ");
        int[][] tablero =new int[scanner.nextInt()][scanner.nextInt()];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j]= (int)(Math.random()*100);
            }
        }
        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt();
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (numero==tablero[i][j]){
                   encontrado=true;
                   break;
                }
            }
            if(encontrado) {
                System.out.printf("El número está en el tablero.");
            }else{
                System.out.println("El número no está en el tablero.");

        }

        }
    }
}
