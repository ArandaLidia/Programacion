package IF;

import java.util.Scanner;

//*Introducir tres enteros entre -100 y 100. De cumplir los tres números la condición del rango, se obtendrá
// la suma de sus inversos (1/número ). En el caso de no estar alguno de los numeros en el rango se mostrará el mensaje
// “Alguno de los números no está entre -100 y 100”. No se sumará el inverso de aquellos valores que sean 0.
// Por ejemplo, se introducen los enteros 20, -4 y 100, y se muestra el valor 1/20 + 1/-4 + 1/100 = -0.19000.*/
public class T3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 1 número entero");
        double n1 = scanner.nextDouble();

        System.out.println("Introduce 1 número entero");
        double n2 = scanner.nextDouble();

        System.out.println("Introduce 1 número entero");
        double n3 = scanner.nextDouble();
        double suma = 1.0 / n1 + 1.0 / n2 + 1.0 / n3;
        boolean rango = (n1 >= -100 && n1 <=100 )&& (n2 >= -100 && n2 <= 100 )&& (n3 >= -100 && n3<= 100);
        if (rango) {
            if(n1==0||n2==0||n3==0){
            System.out.println("No se suman los inversos de 0.");
            }else{
            System.out.println("la suma de sus inversos es " + suma);
            }
        }else{
            System.out.println("Alguno de los números no está entre -100 y 100");


        }
    }
}

