package B6_Funciones;

import java.util.Scanner;

/*Realizar una función que calcule (muestre en pantalla) el área o el volumen de un cilindro, según
se especifique. Para distinguir un caso de otro se le pasará el carácter 'a' (para área) o 'v'
(para el volumen). Además hemos de pasarle a la función el radio y la altura.
*/
public class E7 {
    public static void main(String[] args) {



    }
    public static double calcular(int calcula, int radio, int altura){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce 'a' para calcular el area y 'v' para calcular el volumen de un cilindro.");
        char calcula=scanner.next().charAt(0);
        System.out.println("Introduce el radio:");
        int radio= scanner.nextInt();
        System.out.println("Introduce la altura:");
        int altura= scanner.nextInt();


        if(calcula=='a'){
            double a =  ((2*Math.PI*radio*altura)+(2*Math.PI*Math.pow(radio,2)));
            return a;
        }else if(calcula=='v'){
            double v= 2*Math.PI*altura;
            return v;
        }else{
            System.out.println("El valor introducido no es válido.");
        }

        return 0;
    }
}
