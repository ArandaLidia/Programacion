package ejerciciosPROFESOR;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        final String nombre = scanner.nextLine();
        System.out.print("Ingresa la calle: ");
        final String calle = scanner.nextLine();
        System.out.print("Ingresa el número: ");
        final String numero = scanner.nextLine();
        System.out.print("Ingresa el piso: ");
        final String piso = scanner.nextLine();
        System.out.print("Ingresa la letra del piso: ");
        final String letra = scanner.nextLine();
        System.out.print("Ingresa la localidad: ");
        final String localidad = scanner.nextLine();
        System.out.print("Ingresa el código postal: ");
        final String codigoPostal = scanner.nextLine();
        System.out.print("Ingresa la provincia: ");
        final String provincia = scanner.nextLine();
        System.out.print("Ingresa el país ");
        final String pais = scanner.nextLine();

        System.out.println("Enviar la carta a la dirección: ");

        System.out.println(nombre);

        System.out.println(calle + " Nº" + numero + ", "+ piso + "º" + letra);

        System.out.println(localidad + " (" + provincia + ") CP:" + codigoPostal);

        System.out.println(pais);
    }

}
