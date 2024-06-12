package ExplicaciónBORJA;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[]numerosElementos=new int[]{12,35,15,62,12};
        System.out.println("Imprime "+ numerosElementos[0]); //imprime la primera posicion
        System.out.println("El tamaño del array es "+numerosElementos.length);
        System.out.println("El numero en la ultima posicion es "+numerosElementos[numerosElementos.length-1]); //Imprime el  número en la última posición

        for (int i = 0; i < numerosElementos.length; i++) {
            System.out.println("En número en la posicion " +i+" es "+numerosElementos[i]); //Imprime el número y la posición
        }
for(int i=0;i<numerosElementos.length;i++){
    System.out.printf("El número en la posición %d es %d\n",i, numerosElementos[i]); //Imprime el número y la posición
}
for (int item:numerosElementos){ //Imprime cada elemento en salto de línea.
    System.out.println(item);
}
    }
}