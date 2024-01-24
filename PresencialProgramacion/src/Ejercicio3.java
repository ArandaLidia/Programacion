import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la nota del primer examen: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Introduce la nota que quieres sacar en el trimestre: ");
        double notafinal = scanner.nextDouble();

        double medianota1 = nota1 * 0.4;

        double nota2 = (notafinal - medianota1) /0.6;

        System.out.printf("Deberías sacar: %.2f en el segundo examen.",nota2);

        // 0.4*7+0.6*X=8.5
        //2.8+0.6*X=8.5
        //x=(8.5-2.8)/0.6
    }
}
