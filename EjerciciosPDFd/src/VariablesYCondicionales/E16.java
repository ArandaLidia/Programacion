package VariablesYCondicionales;

import java.util.Scanner;

/*Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días.
Sin años bisiestos.
*/
public class E16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un día:");
        int day= scanner.nextInt();
        System.out.println("Introduce un mes:");
        int month= scanner.nextInt();
        System.out.println("Introduce un año");
        int year=scanner.nextInt();

        if((day>0&&day<=31)&&(month==1||month==3||month==5||month==7||month==8||month==10||month==12)&&(year!=0)){
            System.out.println("La fecha es correcta.");
        } else if ((day>0&&day<=30)&&(month==4||month==6||month==9||month==11)&&(year!=0)) {
            System.out.println("La fecha es correcta.");
        } else if ((day>0&&day<29)&&month==2&&year!=0) {
            System.out.println("La fecha es correcta");
        }else{
            System.out.println("La fecha es incorrecta.");
        }
    }
}
