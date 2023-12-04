package WHILE_DOWHILE;

import java.util.Scanner;

/*Modifica el ejercicio anterior para hacer una calculadora. Nada más ejecutar se mostrarán las opciones disponibles
- Bienvenido a la aplicación de calculos - Introduce operando uno: - Introduce operando dos:
- 1. Sumar - 2. Restar - 3. Multiplicar - 4. Dividir - 5. Módulo - 6. Salir - Selecciona la operacion que quieres realizar.
Al seleccionar una de las opciones el sistema realizará la operación correspondiente y mostrará el resultado por
pantalla de la siguiente forma "El resultado de la operación es:". Una vez terminada la operación volverá a mostrar el menú y pedir dos números nuevos.*/
public class T3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la aplicación de calculos.");
        System.out.println("Introduce operando 1: ");
        int operando1= scanner.nextInt();
        System.out.println("Introduce operando 2: ");
        int operando2= scanner.nextInt();
        System.out.print(" 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir \n 5. Modulo \n 6. Salir. \n");
        System.out.println("Selecciona la operación que quieres realizar:");

        boolean salir = false;
        int opcion = 0;
        while(opcion != 6) {
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La opción seleccionada es 1.");
                    System.out.println("El resultado es "+(operando1+operando2));
                    break;
                case 2:
                    System.out.println("La opción seleccionada es 2.");
                    System.out.println("El resultado es "+(operando1-operando2));
                    break;
                case 3:
                    System.out.println("La opción seleccionada es 3.");
                    System.out.println("El resultado es "+(operando1*operando2));
                    break;
                case 4:
                    System.out.println("La opción seleccionada es 4.");
                    System.out.println("El resultado es "+(operando1/operando2));
                    break;
                case 5:
                    System.out.println("La opción seleccionada es 5.");
                    System.out.println("El resultado es "+(operando1%operando2));
                    break;
                case 6:
                    System.out.println("Salir.");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no contemplada:");
            }
        }
    }
}
