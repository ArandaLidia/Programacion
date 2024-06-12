import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
    int numeroAleatorio= (int) ((Math.random()*4001)+1000);
        System.out.println("La combinacion de la caja fuerte es: "+numeroAleatorio);

        int intentos=1;
        int intentosRestantes=5;
        for (int i = 0; i<5; i++) {
            System.out.println("Introduce un número entre 1000 y 5000:");
            int numeroUsuario=scanner.nextInt();
            if (numeroUsuario<1000||numeroUsuario>5000){
                System.out.println("Introduce un número válido");
            }else {
                if (numeroAleatorio==numeroUsuario){
                    System.out.println("Enhorabuena, has abierto la caja en con el intento: "+intentos);
                    break;
                }else {
                    intentosRestantes--;
                    intentos++;
                    System.out.println("Lo siento, el número es incorrecto. Te quedan "+intentosRestantes+" intentos.");
                    if (intentosRestantes==0){
                        System.out.println("Lo siento has bloqueado la caja, has perdido la oportunidad.");
                    }
                }
            }

        }
    }
}