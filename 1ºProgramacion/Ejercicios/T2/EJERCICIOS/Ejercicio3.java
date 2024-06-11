package ejerciciosPROFESOR;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        /** Ejercicio 3. Hágase un programa que lea dos variables enteras y obtenga las siguientes operaciones:
         * a) Suma
         * b) Resta
         * c) Multiplicación
         * d) División entera
         * e) Resto entero */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce número 1:");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce número 2:");
        int numero2 = scanner.nextInt();
        int suma = numero1+numero2;
        int resta = numero1-numero2;
        int multiplicacion = numero1*numero2;
        int division = numero1/numero2; /* Los decimales no saldrían, solo saldría el número entero.*/
        /* Cambiar valor a int división, para que de decimales: Double division = (double) operando1/operando2 */
        double division1 = (double) numero1/numero2;


        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicación es: "+multiplicacion);
        System.out.println("El resultado de la división es: "+division1);

    }
}