package B1_VariablesYCondicionales;

import java.util.Scanner;

/*
Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. suponer que todos
los meses tienen 30 días*/
public class E17 {
    public static void main(String[] args) {
        int dia, mes, año;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca día: ");
        dia = scanner.nextInt();
        System.out.print("Introduzca mes: ");
        mes = scanner.nextInt();
        System.out.print("Introduzca año: ");
        año = scanner.nextInt();

        if (dia < 1 || dia > 30 || mes < 1 || mes > 12 || año <= 0) {
            System.out.println("Fecha inválida.");
        } else {
            dia++;

            if (dia > 30) {
                dia = 1;
                mes++;

                if (mes > 12) {
                    mes = 1;
                    año++;
                }
            }

            System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + año);
        }
    }
}