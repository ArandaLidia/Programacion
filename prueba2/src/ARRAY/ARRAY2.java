package ARRAY;
/*2. Crear un programa que genere 30 números aleatorios entre 0 - 10 y los guarde en un array. Una vez metidos, se deberá mostrar:
    - Numero de puntos obtenidos
    - Media de puntos obtenidos*/

import javax.management.MBeanAttributeInfo;

public class ARRAY2 {
    public static void main(String[] args) {
        int aleatorios=0;
        int []naleatorios=new int[30];
        int puntos=0;
        int media=0;

        for (int i = 0; i < naleatorios.length; i++) {
            aleatorios=(int)(Math.random()*10);
            naleatorios[i]=aleatorios;
            media++;
            puntos+=aleatorios;
            System.out.println(naleatorios[i]);
        }
        System.out.println("La suma de los puntos es "+puntos);
        System.out.println("La media de los puntos es "+(puntos/media));
        System.out.println(media);
    }
}
