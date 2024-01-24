import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        final String[] tiradas= new String[]{"Piedra", "Papel", "Tijera"};

        System.out.printf("Indica cual es tu tirada");
        for(String item: tiradas){
            System.out.println(item);
        }

        Scanner scanner=new Scanner(System.in);
        System.out.println("Cual es la tirada del J1");
        String tiradaJ1=scanner.nextLine();
        System.out.println("Cual es la tirada del J2");
        String tiradaJ2= scanner.nextLine();

        if(tiradaJ1.equalsIgnoreCase(tiradaJ2)){
            System.out.println("Empate");
        }else if(tiradaJ1.equalsIgnoreCase("Tijera") && tiradaJ2.equalsIgnoreCase("piedra")){
            System.out.println("Gana el jugador 2, Piedra gana a Tijera.");
        }else if(tiradaJ2.equalsIgnoreCase("Tijera") && tiradaJ1.equalsIgnoreCase("piedra")){
            System.out.println("Gana el jugador 1, Piedra gana a Tijera.");
        } else if (tiradaJ1.equalsIgnoreCase("papel")&&tiradaJ2.equalsIgnoreCase("tijera")) {
            System.out.println("Gana el jugador 2, Tijera gana a Papel");
        }else if (tiradaJ2.equalsIgnoreCase("papel")&&tiradaJ1.equalsIgnoreCase("tijera")) {
            System.out.println("Gana el jugador 1, Tijera gana a Papel");
        }else if (tiradaJ2.equalsIgnoreCase("piedra")&&tiradaJ1.equalsIgnoreCase("papel")) {
            System.out.println("Gana el jugador 2, Piedra gana a Papel");
        }else if (tiradaJ1.equalsIgnoreCase("piedra")&&tiradaJ2.equalsIgnoreCase("papel")) {
            System.out.println("Gana el jugador 1, Piedra gana a Papel");
        }else{
            System.out.println("Opción no contemplada.");
        }
    }
}
