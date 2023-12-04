package IF;
/*Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente.
Suponer que todos los meses tienen 30 días excepto febrero que tiene 28.*/

import java.util.Scanner;

public class T3_14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un día del mes:");
        int dia= scanner.nextInt();
        System.out.println("Introduce un mes:");
        int mes= scanner.nextInt();
        System.out.println("Introduce un año:");
        int anio= scanner.nextInt();


        if((mes==2)&&(dia>0)&&(dia<=28)){
            System.out.println("El día siguiente es: "+((dia+1)+"/"+mes+"/"+anio));
        }else if((mes==4||mes==6||mes==9||mes==11||mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)&&(dia>0)&&(dia<=30)){
            System.out.println("El día siguiente es: "+((dia+1)+"/"+mes+"/"+anio));
        }else{
            System.out.println("La fecha es incorrecta");
        }
    }
}
