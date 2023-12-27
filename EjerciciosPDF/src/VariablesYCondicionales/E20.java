import java.util.Scanner;

public class E20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una hora en el formato: hh:mm:ss");
        String hora = scanner.next();

        String[] arrayHora = hora.split(":");
        int horas = Integer.parseInt(arrayHora[0]);
        int minutos = Integer.parseInt(arrayHora[1]);
        int segundos = Integer.parseInt(arrayHora[2]);

        if (horas < 0 || horas >= 24 || minutos < 0 || minutos >= 60 || segundos < 0 || segundos >= 60) {
            System.out.println("Hora incorrecta");
        } else {
            segundos++; // Incrementar los segundos en uno

            if (segundos == 60) {
                segundos = 0;
                minutos++;

                if (minutos == 60) {
                    minutos = 0;
                    horas++;

                    if (horas == 24) {
                        horas = 0;
                    }
                }
            }

            // Mostrar la hora incrementada
            System.out.printf("La hora siguiente es: %02d:%02d:%02d%n", horas, minutos, segundos);
        }
    }
}
