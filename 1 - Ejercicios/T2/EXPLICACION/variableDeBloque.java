package EXPLICACION;

import java.util.Scanner;

//Variable de bloque, de declara dentro de método main, fuera de los bloques,
// y se puede utilizar en los distintos bloques
public class variableDeBloque {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero1= scanner.nextInt();

        if (numero1 == 6){
            System.out.println("El numero vale 6");
    }else{
            System.out.println("El número es distinto a seis");
        }

    }
    }