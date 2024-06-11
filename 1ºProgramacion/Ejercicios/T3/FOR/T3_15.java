package FOR;

import java.util.Scanner;

/*Crear un programa que permita realizar un juego de adivinación. Para ello el sistema nada más empezar generará un número
aleatorio entre 1 y 30. Tras la generación de este número el usuario contará con 10 intentos para poder adivinarlo.
Para lo cual se irá pidiendo un números y en el caso de aceptarlo terminará el proceso con el mensaje "Has adivinado el número en X intentos".
En el caso de agotar los intentos aparecerá el menaje "Lo siento, has agotado todos los intentos”*/
public class T3_15 {
    public static void main(String[] args) {
        int numeroacierto=0;
        int suerte= 0;
        boolean acierto=false;
        int aleatorio=(int)(Math.random()*30)+1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Tienes 10 intentos para adivinar el número aleatorio.");
        for (int i = 0; i < 10; i++) {
           System.out.println("Intento número "+ (i+1) + ", introduce un número: ");
            suerte=scanner.nextInt();
            numeroacierto++;
            if(suerte==aleatorio){
                acierto=true;
                break;
            }else{
                System.out.println("Incorrecto, intenta de nuevo");
            }
        }
        if(acierto) {
            System.out.println("El número aleatorio era "+aleatorio);
            System.out.println("Has adivinado el número en " + (numeroacierto) + " intentos.");
        }else{
            System.out.println("El número aleatorio era "+aleatorio);
            System.out.println("Lo siento, has agotado todos los intentos.");
        }
    }
}
