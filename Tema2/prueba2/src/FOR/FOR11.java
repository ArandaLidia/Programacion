package FOR;

import java.util.Scanner;

/*Dibujar por consola un Cuadrado de + . Para ello se pedirá por consola el tamaño del lado
y se imprimirá el cuadrado con el siguiente formato (CuadradoFor)*/
public class FOR11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el tamaño del cuadrado:");
        int lado= sc.nextInt();
        for (int i = 0; i < lado; i++) {

            for (int j = 0; j < lado; j++) {

                System.out.print("+\t");
            }
            System.out.println(""); //aquí no hay que poner +
        }

    }
}
