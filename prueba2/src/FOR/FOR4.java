package FOR;

import java.util.Scanner;

/*Modificar el ejercicio anteriore para calcular la tabla de multiplicar de los numeros comprendidos en un rango de números pedidos.
Por ejemplo, las tablas de los números comprendidos entre el 3 y el 7 (3,4,5,6,7)*/
public class FOR4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce nº 1");
        int n1= sc.nextInt();
        System.out.println("Introduce nº 2");
        int n2= sc.nextInt();
        for (int i=n1; i <= n2; i++) {
            System.out.println("Tabla de multiplicar de "+i);
            for (int j = 0; j <=10 ; j++) {

                System.out.printf("\t%d*%d=%d\n",i,j,i*j);
            }

        }
    }


}
