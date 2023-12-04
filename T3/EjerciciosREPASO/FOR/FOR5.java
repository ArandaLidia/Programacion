package FOR;

import java.lang.management.MemoryManagerMXBean;
import java.util.Scanner;

/*Dado dos enteros entre 0 y 5 (la base y el exponente), obtener la potencia del primero elevado al segundo sin
utilizar el método “pow”. Por ejemplo, base = 3 y exponente = 5, 35=3x3x3x3x3=243. Casos particulares: 00 = Error y n0 = 1.(BaseExponente)*/
public class FOR5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce base:");
        int base= sc.nextInt();
        System.out.println("Introduce exponente: ");
        int exponente= sc.nextInt();
        int resultado=1; //inicializar en 1, para que al multiplicar 1*la base, no de error.
        if(base==0&&exponente==0){
            System.out.println("La operación da error.");
        }else if(exponente==0){
            System.out.println("La operación es igual a 1");
        }else{
            for (int i = 1; i <= exponente; i++) {
                resultado*=base;

            }
            System.out.println("EL resultado de la operación es: "+resultado);

        }

    }
}
