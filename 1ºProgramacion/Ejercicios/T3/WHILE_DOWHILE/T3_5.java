package WHILE_DOWHILE;
/*Crea un programa que genere un número aleatorio (entre 0 y 20) de entrada y lo guarde en una variable. El sistema irá
pidiendo números al usuario hasta que coincida con el aleatorio generado (en caso de no coincidir mostrará el mensaje
"Lo siento, intentalo de nuevo").
Cuando coincida el sistema deberá mostar el mensaje "Enhorabuena, has acertado el número en 5 intentos" (Adivina)*/

import java.util.Map;
import java.util.Scanner;

public class T3_5 {
    public static void main(String[] args) {

        int intentos = 0;
        int numerousuario=0;

        Scanner scanner = new Scanner(System.in);
        int aleatorio = (int) (Math.random() * 20);
        do{
            System.out.println("Introduce un número: ");
            numerousuario = scanner.nextInt();
            if (numerousuario != aleatorio) {
                intentos++;
                System.out.println("Lo siento, intentalo de nuevo");
            }
        }while(numerousuario!=aleatorio);
        System.out.println("Enhorabuena, has acertado el número en "+intentos+" intentos.");
    }
}



