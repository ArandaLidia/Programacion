import java.util.Arrays;
import java.util.Scanner;
/*Realizar una aplicación que simule el funcionamiento de un bingo. Para ello el
programa nada más arrancar realizará las siguientes acciones:
1. Creará un cartón de bingo, el cual está formado por 10 números aleatorios (no
repetidos entre el 1-99)
2. Pedirá una cantidad que servirá como aputesta del jugador
3. Pedirá la cantidad de números que se prevé que en la que se acertará el bingo
4. Una vez creado el cartón, el sistema irá sacando números aleatorio entre el 1-99
(no repetidos) hasta que se cante bingo (todos los números han sido acertados)
Una vez el cartón cante bingo se deberá mostrar la siguiente información
- Cuantos números han tenido que salir para cantar bingo (acertar todos los
números del cartón)
- Cuando números han tenido que salir para cantar línea (acertar 5 números)
- Si el bingo se ha acertado en el número indicando al principio, deberá mostrarse
el premio obtenido (apuesta introducida por 10).
Se valorará el uso de métodos
*/

public class Bingo {
    static Scanner scanner = new Scanner(System.in);
    static int[] carton = new int[10];
    static int apuesta;
    static int aleatoriocarton;
    static boolean repetido = false;
    static int[] bingo = new int[99];
    static int aciertoLinea = 0;
    static int aciertoBingo = 0;
    static int numeroLinea;
    static int numeroBingo;
    static int premio = 0;
    static int numAcierto;

    public static void main(String[] args) {
        System.out.println("¡¡¡Bienvenido al BINGO!!!");
        System.out.println();
        System.out.println("Realizando sorteo....");
        System.out.println();
        System.out.println("¡SORTEO REALIZADO!");
        System.out.println();
        crearCarton();
        System.out.println();
        apuesta();
        acierto();
        juegobingo();

        System.out.println("¡¡¡BINGO!!!");
        System.out.println();
        System.out.println("Para cantar linea has necesitado: " + numeroLinea + " intentos.");
        System.out.println();
        System.out.println("Para cantar BINGO has necesitado: " + numeroBingo + " intentos.");

        if (numAcierto == numeroBingo) {
            premio = apuesta * 10;
            System.out.println("Has acertado la apuesta, has ganado un premio de: " + premio+" €.");
        } else {
            System.out.println("Lo sentimos, apuesta no premiada, sigue jugando.");
        }
    }


    public static void crearCarton() {
        for (int i = 0; i < carton.length; i++) {
            do {
                aleatoriocarton = (int) (Math.random() * 99) + 1;
                repetido = false;
                for (int j = 0; j < i; j++) {
                    if (carton[j] == aleatoriocarton) {
                        repetido = true;
                        break;
                    }
                }

            } while (repetido);
            carton[i] = aleatoriocarton;
        }

        Arrays.sort(carton);
        System.out.println("Tu cartón de BINGO es: ");
        for (int numero : carton) {
            System.out.print(numero + "\t");

        }
    }

    public static void apuesta() {
        System.out.println("¿Cuántos € quieres apostar?" +": ");
        apuesta = scanner.nextInt();
    }


    public static void acierto() {
        System.out.println("Introduce el números de intentos que necesitarás para acertar BINGO");
        numAcierto = scanner.nextInt();
    }

    public static void juegobingo() {
        for (int i = 0; i < bingo.length&&numeroBingo<carton.length; i++) {
            int aleatorioBingo;
            boolean repetido;
            do {
                aleatorioBingo = (int) (Math.random() * 99) + 1;
                repetido = false;
                for (int j = 0; j < i; j++) {
                    if (bingo[j] == aleatorioBingo) {
                        repetido = true;
                        break;
                    }

                }
            } while (repetido);
            bingo[i] = aleatorioBingo;
            for (int j = 0; j < carton.length; j++) {
                if (carton[j] == aleatorioBingo) {
                    aciertoLinea++;
                    if (aciertoLinea == 5) {
                        numeroLinea = i+1;
                        System.out.println("¡¡¡Con la siguiente bola, han cantado LINEA!!!");

                    }
                    aciertoBingo++;
                    if (aciertoBingo == 10) {
                        numeroBingo = i+1;


                    }
                }
            }
            System.out.println("Bola número " + (i+1)+" :"+bingo[i]);
        }
    }
}


