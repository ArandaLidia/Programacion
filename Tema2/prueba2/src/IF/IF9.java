package IF;

import java.util.Scanner;

/*Se leen tres enteros y se comprobará si son o no consecutivos. Se mostrará en la salida
        “Son consecutivos” o “No son consecutivos”.*/
public class IF9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el número 1:");
        int n1= sc.nextInt();
        System.out.println("Introduce el número 2");
        int n2= sc.nextInt();
        System.out.println("Introduce el número 3");
        int n3= sc.nextInt();

        if (n1+1==n2&&n2+1==n3) {
            System.out.println("Son consecutivos "+n1+" "+n2+" "+n3+".");
        } else if (n1+1==n3&&n3+1==n2) {
            System.out.println("Son consecutivos "+n1+" "+n3+" "+n2+".");
        }else if (n2+1==n1&&n1+1==n3) {
            System.out.println("Son consecutivos "+n2+" "+n1+" "+n3+".");
        }else if (n2+1==n3&&n3+1==n1) {
            System.out.println("Son consecutivos "+n2+" "+n3+" "+n1+".");
        }else if (n3+1==n1&&n1+1==n2) {
            System.out.println("Son consecutivos "+n3+" "+n1+" "+n2+".");
        }else if (n3+1==n2&&n2+1==n1) {
            System.out.println("Son consecutivos "+n3+" "+n2+" "+n1+".");
        }else{
            System.out.println("No son consecutivos.");
        }
    }
}
