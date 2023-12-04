package IF;
/*Leer tres enteros y mostrarlos ordenados.*/

import java.util.Scanner;
// numero1, numero2, numero3
// numero1, numero3, numero2
// numero2, numero1, numero3
// numero2, numero3, numero1
// numero3, numero1, numero2
// numero3, numero2, numero1
public class T3_8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("introduce número 1:");
        int numero1= scanner.nextInt();
        System.out.println("Introduce número 2:");
        int numero2 = scanner.nextInt();
        System.out.println("Introduce número 3");
        int numero3 = scanner.nextInt();

        if(numero1>numero2 && numero1>numero3){
            if(numero2>numero3){
                System.out.println(numero1+" "+numero2+" "+numero3);
            } else {
                System.out.println(numero1+" "+numero3+" "+numero2);
            }
        } else if (numero2>numero1 && numero1>numero3){
            if (numero1>numero3){
                System.out.println(numero2+ " "+numero1 + " " +numero3);
            }else{
                System.out.println(numero2+" "+numero3+ " "+numero1);
            }
        } else if (numero3>numero2 && numero3>numero1){
        if (numero1>numero2){
            System.out.println(numero3+ " "+numero1 + " " +numero2);
        }else{
            System.out.println(numero3+" "+numero2+ " "+numero1);
        }
}
    }
}