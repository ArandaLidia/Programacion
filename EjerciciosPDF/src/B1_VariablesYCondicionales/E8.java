package B1_VariablesYCondicionales;
/*Pedir dos números y decir cual es el mayor o si son iguales.
*/
import javax.swing.*;
import java.util.Scanner;

/*Pedir dos números y decir cual es el mayor.*/
public class E8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce el número 1 a comparar: ");
        int num1= scanner.nextInt();
        System.out.println("Introduce el número 2 a comparar: ");
        int num2= scanner.nextInt();

        if(num1>num2){
            System.out.println("El número "+num1+" es mayor que "+num2);
        }else if(num1==num2){
            System.out.println("Los números son iguales.");
        }else{
            System.out.println(" El número "+num1+" es menor que "+num2);
        }

        //Para que salga cuadro de dialogo
        JOptionPane JOptionPane = null;
        int a=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        int b=Integer.parseInt(JOptionPane.showInputDialog("Introduce otro número"));

        if(a==b) System.out.println("Son iguales");
        else if(a>b) System.out.printf("%d es mayor que %d",a,b);
        else  System.out.printf("%d es mayor que %d",b,a);
    }


}
