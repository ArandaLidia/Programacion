package IF;
/*
Se leen tres enteros y se comprobará si son o no consecutivos. Se mostrará en la salida
“Son consecutivos” o “No son consecutivos”.
 */

import java.util.Scanner;

public class T3_9 {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("introduce número 1:");
        int numero1= scanner.nextInt();
        System.out.println("Introduce número 2:");
        int numero2 = scanner.nextInt();
        System.out.println("Introduce número 3:");
        int numero3 = scanner.nextInt();


        if(numero1+1==numero2 && numero2+1==numero3){
            System.out.println("Son consecutivos");
        }else{
            System.out.println("No son consecutivos");
        }

    }
}
