package B6_Funciones;

import java.util.Scanner;

/*. Función que muestra en pantalla el doble del valor que se le pasa como parámetro.*/
public class E6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un número.");
        int num= scanner.nextInt();
        int a = 0;
        System.out.println("El doble del número es "+doble( a, num));
    }
    public static int doble(int a, int b){
        a=b*2;
        return a;
    }
    
}
