package B2_CondicionalesYBucles;

import java.util.Scanner;

/*Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
 */
public class E19 {
    public static void main(String[] args) {
        int contadorAprobados = 0;
        int contadorSuspensos = 0;
        int contadorCondicionados = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Introduce la nota del alumno " + (i + 1) + ":");
            int nota = scanner.nextInt();

            switch (nota) {
                case 0:
                case 1:
                case 2:
                case 3:
                    contadorSuspensos++;
                    break;
                case 4:
                    contadorCondicionados++;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    contadorAprobados++;
                    break;
                default:
                    System.out.println("Nota introducida no válida.");

            }
        }
        System.out.printf("La cantidad de aprobados es %d, la cantidad de suspensos es %d y la cantidad de condicionados es %d", contadorAprobados, contadorSuspensos, contadorCondicionados);

    }
}
