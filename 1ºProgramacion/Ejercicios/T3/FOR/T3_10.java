package FOR;
/*Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.(NotasTipos)*/
import java.util.Scanner;

public class T3_10 {

    public static void main(String[] args) {
        double suma=0;
        double sumaaprobados = 0;
        double sumacondicional = 0;
        double sumasuspensos = 0;
        int nota = 0;
        System.out.println("Introduce 6 notas:");
        for (int i = 0; i < 6; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce la nota  " + (i + 1) + ":");
            nota = (int) scanner.nextDouble();
            suma += nota;
            if (nota >= 5) {
                sumaaprobados++;

            } else if (nota == 4) {
                sumacondicional++;

            } else if (nota < 4) {
                sumasuspensos++;

            }
        }

        System.out.println("El número de aprobados es: " + (sumaaprobados));
        System.out.println("El número de condicionados es: " + (sumacondicional));
        System.out.println("El número de suspensos es: " + (sumasuspensos));
    }

}
