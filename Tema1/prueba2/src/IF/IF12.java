package IF;/*12. Leer un número entero, se realizarán las siguientes acciones:
    - incrementará en 2 unidades si es par
    - en 3 unidades si es múltiplo de 3
    - en 5 unidades si es múltiplo de 5
    - en el caso de no cumplirse ninguna de las anteiores, se incrementará en una unidad.*/

import java.util.Scanner;

public class IF12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int numero= sc.nextInt();
        int par=numero%2;
        int multi3=numero%3;
        int multi5=numero%5;

        if (par == 0) {
            System.out.println(" El número es par, el nuevo valor es "+(numero+2));
        }else if(multi3==0){
            System.out.println("El número es multiplo de 3, el nuevo valor es "+(numero+3));
        }else if(multi5==0){
            System.out.println("El número es multiplo de 5, el nuevo valor es "+(numero+5));
        }else{
            System.out.println("No se cumple ninguna condición, el nuevo valor es "+ (++numero));
        }
    }
}
