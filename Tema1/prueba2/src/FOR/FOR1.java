package FOR;

import java.util.Scanner;

/*Se leerá el número de temperaturas a introducir (de ser 0 o negativo se establecerá a 10).
Obténgase la media con dos decimales de las temperaturas introducidas por consola. (TemperaturasIntroducidas)*/
public class FOR1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Cuántas temperaturas vas a introducir?");
        int ntemperaturas = sc.nextInt();
        if(ntemperaturas<=0){
            ntemperaturas=10;
        }
        double temperatura=0;
        double sumatemperatura=0;
        for (double i = 1; i <= ntemperaturas; i++) {
            System.out.println("Introduce la temperatura n= "+i);
            temperatura = sc.nextInt();
            sumatemperatura+=temperatura;

        }
        double media=sumatemperatura/ntemperaturas;
        System.out.printf("La media de temperaturas es %2f", media);
    }
}
