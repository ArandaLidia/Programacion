package CondicionalesYBucles;

import java.util.Scanner;

/*. Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.*/
public class E22 {
    public static void main(String[] args) {
        boolean suspenso=false;
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <5; i++) {
            System.out.println("Introduce la califiación "+(i+1)+":");
            int califiacion= scanner.nextInt();
            if(califiacion<5){
                suspenso=true;
                break;
            }
        }
        if(suspenso){
            System.out.println("Hay algún alumno suspenso.");
        }else {
            System.out.println("No hay  ningún alumno suspenso.");
        }
    }
}
