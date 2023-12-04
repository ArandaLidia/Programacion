package FOR;

import java.util.Scanner;

/*
import java.util.Scanner;
/*Dado dos enteros entre 0 y 5 (la base y el exponente), obtener la potencia del primero elevado al segundo sin
utilizar el método “pow”. Por ejemplo, base = 3 y exponente = 5, 35=3x3x3x3x3=243. Casos particulares: 00 = Error y n0 = 1.(BaseExponente)*/
public class T3_5 {

    public static void main(String[] args) {

       Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce el número 1 (base):");
        int base = scanner.nextInt();
        System.out.println("Introduce el número 1 (exponente): ");
        int exponente = scanner.nextInt();
        int resultado1=1;

        for (int i = 0; i <exponente ; i++) {
            resultado1=resultado1*base;

        }
System.out.println("El resultado de la potencia es: "+resultado1);
        }
    }

