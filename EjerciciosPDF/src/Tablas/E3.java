package Tablas;

import java.util.Scanner;

/* Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media
de los negativos y contar el número de ceros.
*/
public class E3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double[]tabla=new double[5];
        int contadorCeros=0;
        double totalPositivos=0;
        double totalNegativos=0;
        double contadorPositivos=0;
        double contadorNegativos=0;


        for (int i = 0; i < 5; i++) {

            System.out.println("Introduce el número "+(i+1)+":");
            tabla[i]= scanner.nextDouble();
        }
        for (double item :
                tabla) {
            if (item == 0) {
                contadorCeros++;
            } else if (item>0) {
                contadorPositivos++;
                totalPositivos+=item;
            } else if (item<0) {
                contadorNegativos++;
                totalNegativos+=item;
            }
        }


        if(contadorNegativos==0){

            System.out.println("No se ha introducido ningún número negativo.");
        }else{
            double mediaNegativos=totalNegativos/contadorNegativos;
            System.out.println("La media de números negativos es: "+mediaNegativos);
        }
        if(contadorPositivos==0){
            System.out.println("No se ha introducido ningún número positivo.");
        }else {
            double mediaPositivos=totalPositivos/contadorPositivos;
            System.out.println("La media de números positivos es: "+mediaPositivos);
        }

        System.out.printf("El número de ceros introducido es: "+contadorCeros);
    }
}
