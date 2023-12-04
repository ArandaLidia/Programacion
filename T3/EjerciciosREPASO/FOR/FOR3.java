package FOR;

import java.util.Scanner;

/*Modificar el ejercicio anterios para calcular la tabla de multiplicar de todos los números (TablaTodos)*/
public class FOR3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero= sc.nextInt();


            for (int i=0; i <= 10; i++) {

                int resultado=numero*i;
                System.out.println(numero+"*"+i+"="+resultado);
            }
        }
    }


