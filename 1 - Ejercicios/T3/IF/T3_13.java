package IF;
/*13. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días.Sin años bisiestos.
*/
import java.util.Scanner;

public class T3_13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un día del mes:");
        int dia= scanner.nextInt();
        System.out.println("Introduce un mes:");
        int mes= scanner.nextInt();
        System.out.println("Introduce un año:");
        int anio= scanner.nextInt();

        if((mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)&&(dia>=1)&&(dia<32)){
            System.out.println("La fecha es correcta: "+dia+"/"+mes+"/"+anio);
        }else if((mes==2)&&(dia>0)&&(dia<=28)){
            System.out.println("La fecha es correcta: "+dia+"/"+mes+"/"+anio);
        }else if((mes==4||mes==6||mes==9||mes==11)&&(dia>0)&&(dia<=30)){
            System.out.println("La fecha es correcta: "+dia+"/"+mes+"/"+anio);
        }else{
            System.out.println("La fecha es incorrecta");
        }

    }
}