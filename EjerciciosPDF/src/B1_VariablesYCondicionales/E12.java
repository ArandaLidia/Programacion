package B1_VariablesYCondicionales;

import java.util.Scanner;

/*. Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.*/
public class E12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //Forma 1
        System.out.println("Introduce un número entre 0 y 9.999:");
        int num= scanner.nextInt();

        int millar=num/1000;
        int resto=num%1000;
        int centena=resto/100;
        resto=resto%100;
        int decena=resto/10;
        int unidades=resto%10;

        System.out.println("El número del revés es: "+unidades+""+decena+""+centena+""+millar);
        System.out.println(        );
        System.out.println();
        //Forma 2
        int nume;
        int dm, um, c, d, u;
        // 9 9 . 9 9 9 a cada guarismo lo llamaremos:
        //dm um c d u: dm (decenas de millar), um:(unidades de millar)
        // c: (centenas), d: (decenas), u: (unidades)

        System.out.print("Introduzca un número entre 0 y 99.999: ");
        nume= scanner.nextInt();
        // unidad
        u = nume % 10;
        nume = nume / 10;
        // decenas
        d = nume % 10;
        nume = nume / 10;
        // centenas
        c = nume % 10;
        nume = nume / 10;
        // unidades de millar
        um = nume % 10;
        nume = nume / 10;
        // decenas de millar
        dm = nume;
        // lo imprimimos al revés:
        System.out.println (u + "" + d + "" + c + "" + um + "" + dm);
        // otra forma de hacerlo es
        nume = 10000*u + 1000*d + 100*c + 10*um + dm;
        System.out.println (nume);

        System.out.println();
        System.out.println();
//Forma 3

        System.out.println("Introduce un número entre 0 y 9.999:");
        int numero = scanner.nextInt();

        int reversed = 0;
        while (numero != 0) {
            reversed = reversed * 10 + numero % 10;
            numero /= 10;
        }

        System.out.println("El número al revés es: " + reversed);
    }
}
