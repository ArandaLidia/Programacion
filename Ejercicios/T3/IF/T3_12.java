package IF;
/*12. Leer un número entero, se realizarán las siguientes acciones:
    - incrementará en 2 unidades si es par
    - en 3 unidades si es múltiplo de 3
    - en 5 unidades si es múltiplo de 5
    - en el caso de no cumplirse ninguna de las anteiores, se incrementará en una unidad.*/

import java.util.Scanner;

public class T3_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        int numeroEntero = scanner.nextInt();
        int resto1 = numeroEntero % 2;
        int resto2 = numeroEntero % 3;
        int resto3 = numeroEntero % 5;
        if (resto1 == 0) {
            System.out.println("El número entero ahora vale " + (numeroEntero + 2));
        }else if (resto2 == 0) {
                System.out.println("El número entero ahora vale " + (numeroEntero + 3));
        }else if (resto3== 0) {
                    System.out.println("El número entero ahora vale " + (numeroEntero + 5));
        } else {
            System.out.println("El número entero ahora vale " + (numeroEntero + 1));
        }
    }
}
