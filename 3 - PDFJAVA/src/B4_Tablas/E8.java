package B4_Tablas;

import java.util.Scanner;

/*Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer mediante el teclado 8 números.
Después se debe pedir un número y una posición, insertarlo en la posición indicada, desplazando los que estén
detrás.
*/
public class E8 {
    public static void main(String[] args) {
int[]tabla=new int[10];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.println("Introduce el número "+(i+1)+" ");
            tabla[i]= scanner.nextInt();
        }
        System.out.println("Introduce un número: ");
        int num= scanner.nextInt();
        System.out.println("Introduce una posición: ");
        int posicion= scanner.nextInt();

        if(posicion==0){
            tabla[posicion]=num;
        }
    }
}
