package FOR;

import java.util.Scanner;

/*Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros (NumerosTipos)*/
public class FOR8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double positivos=0;
        double npositivos=0;
        double negativos=0;
        double nnegativos=0;
        int ceros=0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce número "+i+":");
            int n1= sc.nextInt();
            if (n1>0){
                positivos+=n1;
                npositivos++;
            }else if(n1==0){
                ceros++;
            }else if(n1<0){
                negativos+=n1;
                nnegativos++;

            }
        }
        System.out.println("La media de los números positivos es: "+(positivos/npositivos));
        System.out.println("La media de los números negativos es "+(negativos/nnegativos));
        System.out.println("La cantidad de 0 es :"+ceros);







    }
}
