package B4_Tablas;

import java.util.Scanner;

/* Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media
de los negativos y contar el número de ceros.
*/
public class E3_2 {
    public static void main(String[] args) {
        int contPositivos=0;
        int sumaPositivos=0;
        int contNegativos=0;
        int sumaNegativos=0;
        int contCeros=0;
        Scanner scanner=new Scanner(System.in);
        int[]num=new int[5];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce el número "+(i+1)+":");
            num[i]= scanner.nextInt();
            if(num[i]==0){
                contCeros++;
            }else if(num[i]>0){
                contPositivos++;
                sumaPositivos+=num[i];
            }else if(num[i]<0){
                contNegativos++;
                sumaNegativos+=num[i];
            }
        }

        if(contNegativos==0){
            System.out.println("No hay números negativos.");
        }else{
            int mediaNegativos=sumaNegativos/contNegativos;
            System.out.println("La media de números negativos es: "+mediaNegativos);
        }

        if(contNegativos==0){
            System.out.println("No hay números positivos.");
        }else{
            int mediaPositivos=sumaPositivos/contPositivos;
            System.out.println("La media de números positivos es: "+mediaPositivos);
        }


        System.out.println("El número de ceros es "+contCeros);
    }
}
