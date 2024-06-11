package FOR;

import java.util.Scanner;

public class For_E15 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int random= (int) (Math.random()*31);
        int suma=1, contador=10;

        for(int i=0; i<suma; i++) {
            System.out.println("Introduzca un número, dispone de " + contador-- + " intentos para lograrlo");
            int intento=teclado.nextInt();
            if(intento==random) {
                System.out.printf("Enhorabuena lo has adivinado con tan solo %d intentos", suma);
                suma=0;
            }else if(suma<=10) {
                suma++;
            }else {
                System.out.println("Lo siento, has agotado los intentos" + random);
            }
        }
    }
}