package FOR;

import java.util.Scanner;

//*Modificar el ejercicio anteriore para calcular la tabla de multiplicar de los numeros comprendidos en un
// rango de números pedidos. Por ejemplo, las tablas de los números comprendidos entre el 3 y el 7 (3,4,5,6,7)


public class T3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número 1: ");
        int numero1= sc.nextInt();
        Scanner sc1= new Scanner(System.in);
        System.out.println("Introduce el número 2:");
        int numero2= sc1.nextInt();

        int tablas=numero1;
        for (tablas = numero1; tablas <= numero2; tablas++) {

            System.out.println( "Tabla de multipliccar" + tablas +":");
        }
          for (int i = 0; i< 11; i++) {
                    System.out.printf("%d x %d = %d \n",tablas,i,tablas*i);

                }
        }
    }


