package IF;

import java.util.Scanner;

/*Introducir tres enteros entre -100 y 100. De cumplir los tres números la condición del rango, se obtendrá la suma de
sus inversos (1/número ). En el caso de no estar alguno de los numeros en el rango se mostrará el mensaje
“Alguno de los números no está entre -100 y 100”. No se sumará el inverso de aquellos valores que sean 0.
Por ejemplo, se introducen los enteros 20, -4 y 100, y se muestra el valor 1/20 + 1/-4 + 1/100 = -0.19000.*/
public class IF6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce número entero 1:");
        double entero1= sc.nextDouble();
        System.out.println("Introduce número entero 2:");
        double entero2= sc.nextDouble();
        System.out.println("Introduce número entero 3");
        double entero3= sc.nextDouble();
        if(entero1>100||entero1<-100) {
            System.out.println("Alguno de los número no está entre -100 y 100.");
        }else if((entero2>100||entero2<-100)){
                System.out.println("Alguno de los número no está entre -100 y 100.");
        }else if ((entero3>100||entero3<-100)) {
            System.out.println("Alguno de los número no está entre -100 y 100.");
        }else if(entero1==0||entero2==0||entero3==0){
            System.out.println("No se puede sumar el inverso de 0.");
        }else{
            System.out.println("La suma de sus inversos es "+((1/entero1)+(1/entero2)+(1/entero3)));
        }
    }
}
