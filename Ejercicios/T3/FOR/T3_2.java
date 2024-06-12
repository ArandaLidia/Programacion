package FOR;

import java.util.Scanner;

//*Leer un número entre 0 y 10. Se mostrará la tabla de multiplicar de dicho número con el 
// formato: 5 x 3 = 15 (desde 0 hasta 10 en líneas distintas). (TablaDeMultiplicar)
public class T3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para mostrar la tabla de multiplicar.");
        int d= sc.nextInt();

        if (d>=0 &&d<=10){
        for (int i = 0; i < 11; i++) {

            System.out.printf("%d x %d = %d \n",d,i,d*i);
        }
        }else{
            System.out.println("El número no está entre 0 y 10.");
            }


    }
}


