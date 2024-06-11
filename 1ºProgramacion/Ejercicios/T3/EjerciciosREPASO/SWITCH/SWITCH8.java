package SWITCH;

import java.util.Scanner;

/*8. Realiza un programa que pida al usuario ingresar un carácter que represente una operación matemática (+, -, *, /)
 y dos números. Luego, utiliza una sentencia switch para realizar la operación correspondiente y mostrar el resultado.
9.*/
public class SWITCH8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce qué operación matemática deseas realizar (+, -, /, *");
        char operacion=scanner.next().charAt(0);
        System.out.println("Introduce número 1");
        int n1= scanner.nextInt();
        System.out.println("Introduce número 2");
        int n2= scanner.nextInt();

        switch (operacion){
            case '+':
                System.out.println("El resultado es "+(n1+n2));
                break;
            case '-':
                System.out.println("El resultado es "+(n1-n2));
                break;
            case '*':
                System.out.println("El resultado es "+(n1*n2));
                break;
            case '/':
                if(n2==0){
                    System.out.println("No se puede dividir entre 0");
                }else{
                    System.out.println("El resultado es "+(n1/n2));
                }
            default:
                System.out.println("Valor introducido no válido");


        }
    }
}
