package FOR;

import java.util.Scanner;

/*Simúlese el lanzamiento de un dado. Se introducirá el número de veces que se lanza el dado (de no ser positivo, se establecerá a 100). (Dado)*/
public class FOR7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de veces que vas a lanzar el dado:");
        int vecesdado= sc.nextInt();
        if (vecesdado<0){
            vecesdado=100;
        }
        for (int i = 1; i <= vecesdado; i++) {
            int aleatorio= (int) (Math.random()*6)+1;
            System.out.println("Numero en el dado "+aleatorio);
        }
    }
}
