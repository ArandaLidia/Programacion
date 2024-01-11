package B2_CondicionalesYBucles;

import java.util.Scanner;

/* Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de
alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.
*/
public class E15 {
    public static void main(String[] args) {
        int contadorMayores=0;
        int contadorAltos=0;
        double sumaEdad=0;
        double sumaEstatura=0;
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce la altura del alumno "+(i+1)+" :");
            double altura= scanner.nextDouble();
            System.out.println("Introduce la edad del alumno "+(i+1)+" :");
            double edad= scanner.nextDouble();
            sumaEstatura+=altura;
            sumaEdad+=edad;
            if(altura>1.75){
                contadorAltos++;
            }
            if(edad>18){
                contadorMayores++;
            }

        }
        double mediaEdad=sumaEdad/5;
        double mediaEstatura=sumaEstatura/5;
        System.out.println("La media de estaturas introducidas es: "+mediaEstatura);
        System.out.println("La media de la edad introducida es: "+mediaEdad);
        System.out.println("La cantidad de alumnos mayores de 18 años es: "+contadorMayores);
        System.out.println("La cantidad de alumnos que miden más de 1.75 es: "+contadorAltos);
    }
}
