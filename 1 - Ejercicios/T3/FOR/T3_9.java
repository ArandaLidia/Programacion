package FOR;

/*Pedir 10 sueldos. Mostrar su suma, media y cuantos hay mayores de 1000€.(Sueldos)*/

import java.util.Scanner;

public class T3_9 {
    public static void main(String[] args) {
int sueldo=0;
int sumasueldos=0;
int contadorsueldo1000=0;
int contadorsueldos=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 10 sueldos");
        for (int i = 0; i < 10; i++) {
            System.out.println("Sueldo " + (i + 1) + ":");
            sueldo=scanner.nextInt();
            sumasueldos+=sueldo;
            contadorsueldos++;
            if(sueldo>1000){
                contadorsueldo1000++;
            }

        }
        System.out.println("La suma de los sueldos es "+sumasueldos);
        System.out.println("La media de los sueldos es "+sumasueldos/contadorsueldos);
        System.out.println("Hay "+contadorsueldo1000+" sueldos mayores de 1000€");
    }
}