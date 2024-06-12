package FOR;

import java.util.Scanner;

/*Pedir 10 sueldos. Mostrar su suma, media y cuantos hay mayores de 1000€.(Sueldos)*/
public class FOR9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nsueldos=0;
        double sumasueldos=0;
        for (int i = 1; i <=10 ; i++) {
            System.out.println("Introduce sueldo nº"+i+":");
            double sueldo= sc.nextInt();
            sumasueldos+=sueldo;
            if(sueldo>=1000){
                nsueldos+=1;
            }


        }System.out.println("La suma de los sueldos es: "+sumasueldos);
        System.out.println("La media de los sueldos es: "+sumasueldos/10);
        System.out.println("Los sueldos mayores que 1000 son: "+nsueldos);
    }
}
