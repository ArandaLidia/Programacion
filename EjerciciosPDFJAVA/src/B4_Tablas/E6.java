package B4_Tablas;

import java.util.Scanner;

/*Leer los datos correspondiente a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la
forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.
*/
public class E6 {
    public static void main(String[] args) {
int[]tabla1=new int[12];
int[]tabla2=new int[12];
int[]tabla3=new int[24];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < tabla1.length; i++) {
            System.out.println("Introduce el número "+(i+1)+":");
            tabla1[i]= scanner.nextInt();
        }
        for (int i = 0; i < tabla2.length; i++) {
            System.out.println("Introduce el número "+(i+1)+":");
            tabla2[i]= scanner.nextInt();
        }

       int j=0;
       int i=0;

        while (i<12)
        {
            // copiamos 3 de tabla1
            for (int k=0;k<3; k++)
            {
                tabla3[j]=tabla1[i+k];
                j++;
            }
            // copiamos 3 de tabla2
            for (int k=0;k<3;k++)
            {
                tabla3[j]=tabla2[i+k];
                j++;
            }
            // como hemos copiado 3 de tabla1 y tabla2, incrementamos la i en 3.
            i+=3;
            // la j se incrementa cada vez que se añade un elemento a la tabla 3.
        }
        System.out.println("La tabla c queda: ");
        for (j=0;j<24;j++) // seguimos utilizando j, para la tabla 3. Aunque se podría utilizar i.
            System.out.print(tabla3[j]+" ");

        System.out.println("");


        }

    }

