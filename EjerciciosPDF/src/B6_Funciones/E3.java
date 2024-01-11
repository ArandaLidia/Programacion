package B6_Funciones;

import java.util.Scanner;

/*Ídem una versión que calcule el máximo de 3 números. */
public class E3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce el número 1: ");
        int num1= scanner.nextInt();
        System.out.println("Introduce el número 2: ");
        int num2= scanner.nextInt();
        System.out.println("Introduce el número 3: ");
        int num3= scanner.nextInt();

        System.out.println("El número máximo es : "+maximo(num2,num3,num1));
    }
    public static int maximo(int a, int b, int c){
        int max;
        if ((a>b)&&(b>c)){
            max=a;
        }else if((a>c)&&(c>b)){
            max=a;
        }else if (b>a&&a>c){
            max=b;
        }else if(b>c&&b>a){
            max=b;
        }else if(c>a&&a>b){
            max=c;
        }else{
            max=c;
        }
        return max;
    }
}
