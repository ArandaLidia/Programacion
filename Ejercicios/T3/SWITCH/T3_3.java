package SWITCH;


import java.util.Scanner;

//*Desarrolla un programa que reciba un número entero y, utilizando una sentencia switch,
// determine si es par o impar*/
public class T3_3 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int n1= scanner.nextInt();
        int resto=n1%2;
        switch (resto){
            case 0:
                System.out.println("El número es par");
                break;
            case 1:
                System.out.println("El número es impar");
        }
    }
}