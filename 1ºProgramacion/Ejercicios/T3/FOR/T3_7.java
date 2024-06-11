package FOR;

import java.util.Scanner;

/*Simúlese el lanzamiento de un dado. Se introducirá el número de veces que se lanza el dado (de no ser positivo, se establecerá a 100). (Dado)*/
public class T3_7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce el número de veces que lanzaremos el dado: ");
        int vecesDado = scanner.nextInt();

        if(vecesDado <= 0){
            vecesDado=100;
        }
        for (int i = 0; i < vecesDado; i++) {
            int aleatorio= (int) (Math.random()*6)+1;
            System.out.println(aleatorio);
        }


        }
    }
