package FOR;

import java.util.Scanner;
/*Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros (NumerosTipos)*/
public class T3_8 {
    public static void main(String[] args) {
        double opcion = 0;
        double sumapositivos = 0;
        double sumanegativos=0;
        int contadorpositivos=0;
        int contadornegativos=0;
        int cero=0;
        System.out.println("Introduce 10 números");
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce número "+(i+1)+":" );
            opcion = sc.nextInt();
            if (opcion >0) {
                sumapositivos +=opcion;
                contadorpositivos++;

            }else if (opcion<0){
                sumanegativos += opcion;
                contadornegativos++;

            }else{
                cero++;
            }
        }

        System.out.println("La media de los números positivos es " + (sumapositivos /contadorpositivos));
        System.out.println("La media de los números negativos es "+ (sumanegativos/contadornegativos));
        System.out.println("El número de 0 introducidos es "+cero);
    }
}
