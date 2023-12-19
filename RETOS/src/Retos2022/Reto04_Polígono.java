package Retos2022;

import java.util.Scanner;

/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Fecha publicación enunciado: 24/01/22
 * Fecha publicación resolución: 31/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 *
 */
public class Reto04_Polígono {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Elige el polígono deseado para calcular su área: \n" +
                "1. Triangulo\n" +
                "2. Cuadrado\n" +
                "3. Rectángulo");
        int poligono=sc.nextInt();

        switch (poligono){
            case 1:
                System.out.println();
                System.out.println("Introduce la base en metros:");
                int basetriangulo= sc.nextInt();
                System.out.println("Introduce la altura en metros:");
                int alturatriangulo=sc.nextInt();

                System.out.println("El área del triángulo es: "+((basetriangulo*alturatriangulo)/2)+"m2.");
                break;
            case 2:
                System.out.println();
                System.out.println("Introduce el lado en metros:");
                int ladocuadrado= sc.nextInt();
                System.out.println("El area del cuadrado es: "+(ladocuadrado*ladocuadrado+"m2."));
                break;
            case 3:
                System.out.println();
                System.out.println("Introduce el largo en metros:");
                int largorectangulo= sc.nextInt();
                System.out.println("Introduce el ancho en metros:");
                int anchorectangulo= sc.nextInt();
                System.out.println("El area del rectángulo es: "+(largorectangulo*anchorectangulo)+"m2.");
            default:
                System.out.println("Opción no contemplada.");
        }
    }
}
