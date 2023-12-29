package CondicionalesYBucles;

import java.util.Scanner;

/*. Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
 */
public class E14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sumaSueldos=0;
        int contadorMayores=0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el sueldo nº "+(i+1));
            int sueldo= scanner.nextInt();
            sumaSueldos+=sueldo;
            if(sueldo>1000){
                contadorMayores++;
            }
        }
        System.out.println("La suma de sueldos es: "+sumaSueldos);
        System.out.println("La cantidad de sueldos que superan los 1000€ son : "+contadorMayores);
    }
}
