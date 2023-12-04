package FOR;

import java.util.Scanner;

//Modificar el ejercicio anterios para calcular la tabla de multiplicar de todos los números (TablaTodos)
public class T3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número.");
        int tablatodos= sc.nextInt();

            for (int i = 0; i < 11; i++) {

                System.out.printf("%d x %d = %d \n",tablatodos,i,tablatodos*i);
            }
    }
}
