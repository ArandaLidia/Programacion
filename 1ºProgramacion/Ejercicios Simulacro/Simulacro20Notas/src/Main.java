import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        ArrayList<Double>listaNotas=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            System.out.println("Introduce la nota "+(i+1)+" :");
            listaNotas.add(scanner.nextDouble());
        }
        double notaMasAlta= Collections.max(listaNotas);
        double notaMasBaja=Collections.min(listaNotas);
        int aprobados = 0;
        int suspensos = 0;
        double sumaNotas = 0;

        for (Double item : listaNotas) {
            if (item>=5){
                aprobados++;

            }else{
                suspensos++;
            }
            sumaNotas+=item;
        }
        double notamedia=sumaNotas/20;
        System.out.println("Las notas son:");
        for (Double item : listaNotas) {
            System.out.println(item);
        }
        System.out.println("La nota más alta es: "+notaMasAlta);
        System.out.println("La nota más baja es: "+notaMasBaja);
        System.out.println("La cantidad de aprobados es: "+aprobados);
        System.out.println("La cantidad de suspensos es: "+suspensos);
        System.out.println("La media de las notas es: "+notamedia);
    }
}