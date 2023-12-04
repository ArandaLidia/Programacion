package FOR;

import java.util.Scanner;

//Se leerá el número de temperaturas a introducir (de ser 0 o negativo se establecerá a 10).
// Obténgase la media con dos decimales de las temperaturas introducidas por consola. (TemperaturasIntroducidas)
public class T3_1 {
    static double temperatura = 0;
static double sumatemperatura=0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántas temperaturas quieres introducir?");
        int vecestemperatura = scanner.nextInt();

        if (vecestemperatura <= 0) {
            vecestemperatura = 10;
        }
        for (int i = 0; i < vecestemperatura; i++) {
            System.out.println("Introduce la temperatura");
            temperatura = scanner.nextDouble();
            sumatemperatura+=temperatura;

        }
        double media = sumatemperatura / vecestemperatura;
        System.out.println("La media de las temperaturas es: " + (media));
    }

}

