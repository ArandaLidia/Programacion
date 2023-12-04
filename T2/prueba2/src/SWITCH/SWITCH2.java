package SWITCH;
/*
Crea un programa que permita al usuario ingresar un carácter y luego determine si es una vocal o una consonante utilizando una sentencia switch.*/

import java.util.Scanner;

public class SWITCH2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un caracter: ");
        String vocaloconsonante=sc.nextLine();

        switch(vocaloconsonante){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "U":
                System.out.println("Es vocal");
                break;
            default:
                System.out.println("Es consonante");
        }


    }
}
