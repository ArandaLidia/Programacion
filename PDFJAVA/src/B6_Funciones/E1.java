package B6_Funciones;

import java.util.Scanner;

/*Realizar una función, a la que se le pase como parámetro un número N, y muestre por pantalla N
veces, el mensaje: “Módulo ejecutándose”*/
public class E1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num= scanner.nextInt(); //crea una variable num
        mostrar(num);
    }
    static void mostrar(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("Módulo ejecutándose");
        }
    }
}
