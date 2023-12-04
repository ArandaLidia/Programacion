package ejerciciosPROFESOR;
import java.util.Scanner;
/* Ejercicio 4. Hágase un programa que convierta segundos en horas, minutos y segundos.
 (Segundos)
 ENTRADA/SALIDA
 Número de segundos: 24973
 Horas: 6
 Minutos: 56
 Segundos: 13
 24690 = segundos
 3600 segundos = 1 hora
 60 segundos = 1 minuto
 60 minutos = 1 hora */
public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número de segundos a pasar a horas, minutos y segundos");
        double segundos = scanner.nextInt();
        double horas = segundos/60;

    }

}
