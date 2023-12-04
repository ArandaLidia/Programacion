package IF;

import java.util.Scanner;

/*Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. Sin años bisiestos.*/
public class IF13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un día:");
        int dia = sc.nextInt();
        System.out.println("Introduce un mes:");
        int mes = sc.nextInt();
        System.out.println("Introduce un año:");
        int anio = sc.nextInt();
        if (anio < 2031) {
            if (dia <= 28 && mes == 2) {
                System.out.println("La fecha es correcta " + dia + "/" + mes + "/" + anio);
            } else if(dia<=31&&mes==1||dia<=31&&mes==3||dia<=31&&mes==5||dia<=31&&mes==7||dia<=31&&mes==8||dia<=31&&mes==10||dia<=31&&mes==12) {
                System.out.println("La fecha es correcta " + dia + "/" + mes + "/" + anio);
            }else if(dia<=30&&mes==4||dia<=30&&mes==6||dia<=30&&mes==9||dia<=30&&mes==11){
                System.out.println("La fecha es correcta " + dia + "/" + mes + "/" + anio);
        }else{
                System.out.println("La fecha no es correcta");
            }
        }else{
            System.out.println("La fecha no es correcta");
        }
    }
}