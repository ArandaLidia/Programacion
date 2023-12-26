package VariablesYCondicionales;

import java.util.Scanner;

/*Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de
30 días.
*/
public class E15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce el día:");
        int dia= scanner.nextInt();
        System.out.println("Introduce el mes: ");
        int mes = scanner.nextInt();
        System.out.println("Introduce el año: ");
        int year= scanner.nextInt();

        if(dia>0&&dia<=30){
            if(mes>0&&mes<=12){
                if (year!=0){
            System.out.println("La fecha es correcta.");
                }else{
                    System.out.println("Año incorrecto");
                }
            }else{
                System.out.println("Mes incorrecto");
            }
        }else{
            System.out.println("Día incorrecto.");
        }
    }
}
