package WHILE_DOWHILE;

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

/*Modifica el ejercicio anterior para hacer una calculadora. Nada más ejecutar se mostrarán las opciones disponibles
- Bienvenido a la aplicación de calculos - Introduce operando uno: - Introduce operando dos: - 1. Sumar - 2. Restar
- 3. Multiplicar - 4. Dividir - 5. Módulo - 6. Salir - Selecciona la operacion que quieres realizar.
Al seleccionar una de las opciones el sistema realizará la operación correspondiente y mostrará el resultado por pantalla de la siguiente forma
"El resultado de la operación es:". Una vez terminada la operación volverá a mostrar el menú y pedir dos números nuevos. (MenuCalculo)*/
public class WHILE8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        int n1 = 0;
        int n2 = 0;
        while (opcion != 6) {
            System.out.println("- Bienvenido a la aplicación de calculos \n- 1. Sumar \n- 2. Restar \n- 3. Multiplicar \n- 4. Dividir  \n- 5. Módulo \n- 6. Salir\n- Introduce la opción seleccionada:");
            opcion = sc.nextByte();
            System.out.println("Introduce nº1: ");
            n1= sc.nextInt();
            System.out.println("Introduce nº2: ");
            n2= sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El resultado de la suma es: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicación es: " + (n1 * n2));
                    break;
                case 4:
                    System.out.println("El resultado de la división es: " + (n1 / n2));
                    break;
                case 5:
                    System.out.println("El resultado del módulo es: " + (n1 % n2));
                    break;
                case 6:
                    System.out.println("La opción seleccionada es 6. \n SALIR");
                    break;
                default:
                    System.out.println("Opción no contemplada.");
            }

        }
    }
}