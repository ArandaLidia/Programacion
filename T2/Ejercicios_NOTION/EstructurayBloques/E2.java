import java.util.Scanner;
//Crea un método que se llame saludarPerso el cual admita un parámetro de tipo string y muestre por consola el mensaje "Hola NombreIntroducido".
public class E2 {


    public static void saludarPerso(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un nombre:");
        String nombre = scanner.next();
        System.out.println("Hola "+ nombre);
    }
    public static void main(String[] args) {
        saludarPerso();

    }
}
