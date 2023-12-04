package ejerciciosPROFESOR;

import java.util.Scanner;

public class Ejercicio2 {
    /*Ejercicio 2. Hágase un programa que lea 5 variables enteras y haga lo siguiente:

    a) Las muestre en una línea separadas por un espacio.

            b) Rote los valores hacia la izquierda (la primera variable tome el valor de la segunda; la segunda, la de la tercera; la tercera, la de la cuarta; la cuarta, la de la quinta; y la quinta, la de la primera.

    c) Se muestren de nuevo el valor de las cinco variables de la misma forma que en el apartado a). */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = scanner.next();
        System.out.println("Introduce número 1:");
        int n1 = scanner.nextInt();
        System.out.println("Introduce número 2:");
        int n2 = scanner.nextInt();
        System.out.println("Introduce número 3:");
        int n3 = scanner.nextInt();
        System.out.println("Introduce número 4:");
        int n4 = scanner.nextInt();
        System.out.println("Introduce número 5:");
        int n5 = scanner.nextInt();
        System.out.println("Me has dicho que te llamas" + nombre);
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5);

        int aux = n1;
        n1 = n2;
        n2 = n3;
        n3 = n4;
        n4 = n5;
        n5 = aux;

        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5);

        aux=n5;
        n5=n4;
        n4=n3;
        n3=n2;
        n2=n1;
        n1=aux;
        System.out.println(n1+ " "+n2+" "+n3+" "+n4+ " "+n5);


    }
}
