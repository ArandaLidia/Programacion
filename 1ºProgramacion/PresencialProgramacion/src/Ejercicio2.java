import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Introduce la hora");
        int hora=scanner.nextInt();
        /* Calendar calendar=Calendar.getInstance(); //Coger hora de sistema.
        saludo(calendar.get(Calendar.HOUR_OF_DAY));
        */
        if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos días");
        }else if (hora>=13&&hora<=20){
            System.out.println("Buenas tardes");
        }else if (hora>24){
            System.out.println("Hora no correcta");
        }else {
            System.out.println("Buenas noches");
        }
    }
}
