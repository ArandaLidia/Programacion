package FOR;

import java.util.Scanner;

/*Pedir una palabra por teclado y mostrar su contraria. Por ejemplo se introducirá la palabra programacion
y se mostrará por consola la palara noicamargorp (InversaPalabra)*/
public class FOR13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra= sc.next();
        String reves="";
        for (int i = 1; i <=palabra.length() ; i++) {
            reves+=palabra.charAt(palabra.length()-i);
            }
        System.out.println(reves);
        }
    }
