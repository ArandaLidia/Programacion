package SWITCH;


import java.util.Scanner;

/*Realiza un programa que pida al usuario ingresar un carácter que represente una operación matemática (+, -, *, /)
y dos números. Luego, utiliza una sentencia switch para realizar la operación correspondiente y mostrar el resultado.*/
public class T3_8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduzca un simbolo de operación matemática");
        char caracter = scanner.next().charAt(0);
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Introduzca un número");
        int n1 = scanner1.nextInt();
        Scanner scanner2=new Scanner(System.in);
        System.out.println("Introduzca un número");
        int n2 = scanner2.nextInt();

        switch (caracter){
            case '+':
                System.out.println(n1+n2);
                break;
            case  '-':
                System.out.println(n1-n2);
                break;
            case  '*':
                System.out.println(n1*n2);
                break;
            case  '/':
                System.out.println(n1/n2);
                break;
        }
    }
}