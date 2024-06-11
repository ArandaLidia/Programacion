package FOR;

import java.util.Scanner;

/*Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.(NotasTipos)*/
public class FOR10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nota=0;
        int aprobados=0;
        int condicionados=0;
        int suspensos=0;
        for (int i = 1; i <=6; i++) {
            System.out.println("Introduce la nota "+i+":");
            nota= sc.nextInt();
            if (nota>=5){
                aprobados+=1;
            }else if(nota==4){
                condicionados+=1;
            } else if (nota<4) {
                suspensos+=1;
            }else if(nota<0||nota>10){
                System.out.println("Nota no válida");
            }
        }

        System.out.println("EL numero de aprobados es "+aprobados);
        System.out.println("El numero de suspensos es "+suspensos);
        System.out.println("El número de condicionados es " + condicionados);
    }
}
