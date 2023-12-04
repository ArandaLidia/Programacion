package WHILE_DOWHILE;

import java.util.Scanner;

/*Crea un programa que genere un número aleatorio (entre 0 y 20) de entrada y lo guarde en una variable.
El sistema irá pidiendo números al usuario hasta que coincida con el aleatorio generado (en caso de no coincidir mostrará el mensaje "Lo siento,
 intentalo de nuevo").
Cuando coincida el sistema deberá mostar el mensaje "Enhorabuena, has acertado el número en 5 intentos" (Adivina*/
public class WHILE5 {
    public static void main(String[] args) {
        int aleatorio= (int) (Math.random()*20);
        Scanner sc=new Scanner(System.in);
        int intentos=0;
        int numero=0;
        do{
            System.out.println("Introduce un número");
            numero= sc.nextInt();
            intentos++;
            if(numero==aleatorio){
                System.out.println("Enhorabuena, has acertado el número en "+intentos+" intentos.");
            }else{
                System.out.println("Lo siento, intentalo de nuevo.");
            }

        }while(aleatorio!=numero);

    }
}
