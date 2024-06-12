package B2_CondicionalesYBucles;

import java.util.Scanner;

/*Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y
la cantidad de ceros.*/
public class E13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double contadorPositivos=0;
        double contadorNegativos=0;
        int contadorCeros=0;
        double sumaPositivos=0;
        double sumaNegativos=0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el número "+(i+1));
            int num= scanner.nextInt();
            if(num==0){
                contadorCeros++;
            } else if (num>0) {
                contadorPositivos++;
                sumaPositivos+=num;
            } else if (num<0) {
                contadorNegativos++;
                sumaNegativos+=num;
            }
        }

        if(contadorPositivos!=0){
            double mediaPositivos=  (sumaPositivos /contadorPositivos);
            System.out.println("La media de los números positivos es: "+mediaPositivos);
        }else{
            System.out.println("No has introducido ningún número positivo.");
        }
        if(contadorNegativos!=0){
            double mediaNegativos=  (sumaNegativos /contadorNegativos);

            System.out.println("La media de los números negativos es: "+mediaNegativos);
        }else {
            System.out.println("No has introducido ningún número negativo.");
        }
if (contadorCeros!=0){
    System.out.printf("Has introducido %d ceros",contadorCeros);
}else{
    System.out.println("No has introducido ningún cero.");
}

    }

}
