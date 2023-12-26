package VariablesYCondicionales;

import java.util.Scanner;

/*Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo todos los meses de 30
días.
*/
public class E19 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Introduce la primera fecha en formato: dd/mm/aaaa");
        String fecha1= scanner.next();
        System.out.println("Introduce la segunda fecha en formato: dd/mm/aaaa");
String fecha2= scanner.next();
        String [] fechas1=fecha1.split("/");
        int dia1=Integer.parseInt(fechas1[0]);
        int mes1=Integer.parseInt(fechas1[1]);
        int anio1=Integer.parseInt(fechas1[2]);

        String [] fechas2=fecha2.split("/");
        int dia2=Integer.parseInt(fechas2[0]);
        int mes2=Integer.parseInt(fechas2[1]);
        int anio2=Integer.parseInt(fechas2[2]);

        System.out.println("Hay una diferencia de: "+((dia1-dia2)+(30*(mes2-mes1))+(385*(anio2-anio1))));
    }

}