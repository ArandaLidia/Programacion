import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    String nombre, apellido;
    int edad;
    double estatura, peso;
    char sexo;

        Scanner scanner =new Scanner(System.in);
        System.out.println("Introduce el nombre:");
        nombre= scanner.next();
        scanner.nextLine();
        System.out.println("Introduce los apellidos: ");
        apellido=scanner.nextLine();
        System.out.println("Introduce la edad: ");
        edad= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce la estatura en metros:");
        estatura=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Introduce el peso en kg:");
        peso=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Introduce el sexo M/F");
        sexo=scanner.next().charAt(0);

        double imc;
        imc=calculoIMC(peso,estatura);

        System.out.println("Hola "+nombre+", tu IMC teniendo en cuenta tu altura de "+estatura+"  m y tu peso de "+peso+" kg, tiene un valor de: "+imc+".");
    }

    public static double calculoIMC(double pesoKG, double alturaM){
        double imc=pesoKG/(alturaM*alturaM);
        return imc;
    }
}