package SWITCH;

import java.util.Scanner;

public class EntradaMenu {
    public static void main(String[] args) {
        // 1. Realizar suma
        // 2. Realizar resta
        // 3. Realizar multiplicación
        // 4. Realizar división
        // 5. Salida
        // Introduce que opción quieres hacer
        Scanner scanner =new Scanner(System.in);
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Que opción quieres realizar");
        int opcion = scanner.nextInt();
        int operando1 = 0, operando2=0;
                double resultado = 0.0;

        if (opcion>0&&opcion<5){
            System.out.println("Introduce operando 1.");
            operando1= scanner.nextInt();
            System.out.println("Introduce operando 2");
            operando2  = scanner.nextInt();
                    }
switch (opcion){
    case 1:
        System.out.println("Vas a sumar");
        resultado= operando1+  operando2;
        break;
    case 2:
        System.out.println("Vas a restar");
        resultado=operando1-operando2;
        break;
    case 3:
        System.out.println("Vas a multiplicar");
        resultado=operando1*operando2;
        break;
    case 4:
        System.out.println("Vas a dividir");
        resultado= (double)operando1/operando2;
        break;
    case 5:
        System.out.println("Saliendo...");
        break;
}
        if (opcion > 0 && opcion < 5){
            System.out.println("El resultado obtenido es "+resultado);
        }
    }
    }
