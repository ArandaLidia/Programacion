package B2_CondicionalesYBucles;

import java.util.Scanner;

/* Pedir números hasta que se introduzca uno negativo, y calcular la media.*/
public class E7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double num;
        double sumaNum=0;
        int contador=0;
        do {
            System.out.println("Introduce un número para calcular la media. Introduce un número negativo para finalizar.");
            num = scanner.nextInt();
            if (num>=0){
                sumaNum+=num;
                contador++;
            }else{
                System.out.println("Ha introducido un número negativo, programa terminado.");

            }
        }while (num>=0);
        double media=sumaNum/contador;
        System.out.println("La media de los números introducidos es: "+media);
    }
}
