package Scorm;

import java.util.Scanner;

public class DoWhileRadio {
    public static void main(String[] args) {
        System.out.println("El perimetro de la circuferencia es= "+perimetroCirculo());
    }

    public static double perimetroCirculo() {
        Scanner teclado = new Scanner(System.in);
        double radio;
        do {
            System.out.println("Teclee el valor del radio > 0: "); //asegura de ejecutar al menos una vez las instrucciones.
            radio = teclado.nextDouble();
        } while (radio <= 0); // si es menor
        return 2 * Math.PI * radio;

    }
}
