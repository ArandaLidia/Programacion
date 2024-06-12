/*Desarrollar una clase entrada donde:

- Se cree una figura de cada tipo, pasando los datos necesarios para el cálculo de la base y perímetro
- Calcula cada uno de los datos mostrando el mensaje "La base del rectángulo es: XXX"*/

/*- 1 Trabajar con triángulos
    - Introduce base
    - Introduce altura
    - Que operación quieres hacer
        - Calcular área
        - Mostrar datos
    - Pulsa enter para continuar (teclado.next())
- 2 Trabajar con círculos
    - Introduce radio
    - Que operación quieres hacer
        - Calcular área
        - Calcular diámetro
        - Mostrar datos
    - Pulsa enter para continuar (teclado.next())
- 3 Trabajar con cuadrados
    - Introduce base
    - Introduce altura
    - Que operación quieres hacer
        - Calcular área
        - Calcular perímetro
        - Mostrar datos
    - Pulsa enter para continuar (teclado.next())*/

import model.Circulo;
import model.Cuadrado;
import model.Triangulo;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);
        Cuadrado cuadrado = new Cuadrado(4, 6);
        Triangulo triangulo = new Triangulo(5, 10);

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("¿Con qué figura quieres trabajar? 1-Triángulos 2-Círculos 3-Cuadrados 4-Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ha elegido trabajar con triángulos.");
                    System.out.println("Introduce la base:");
                    triangulo.setBase(scanner.nextInt());
                    System.out.println("Introduce la altura");
                    triangulo.setAltura(scanner.nextInt());

                    boolean salir1 = false;
                    do {
                        System.out.println("¿Qué operación quieres realizar? 1-Calcular área 2-Mostrar datos 3-Salir");
                        int operacion = scanner.nextInt();
                        switch (operacion) {
                            case 1:
                                triangulo.calcularArea(triangulo.getBase(), triangulo.getAltura());
                                break;
                            case 2:
                                triangulo.mostrarDatos(triangulo.getBase(), triangulo.getAltura());
                                break;
                            case 3:
                                System.out.println("Saliendo...");
                                salir1 = true;
                                break;
                            default:
                                System.out.println("Opción no contemplada");
                        }
                    } while (!salir1);
                    break;

                case 2:
                    System.out.println("Ha elegido trabajar con círculos");
                    System.out.println("Introduce el radio: ");
                    circulo.setRadio(scanner.nextInt());

                    boolean salir2 = false;
                    do {
                        System.out.println("¿Qué operación quieres realizar? 1- Calcular área 2- Calcular diámetro 3- Mostrar datos. 4-Salir");
                        int operacion1 = scanner.nextInt();
                        switch (operacion1) {
                            case 1:
                                circulo.calcularArea(circulo.getRadio());
                                break;
                            case 2:
                                circulo.calcularDiametro(circulo.getRadio());
                                break;
                            case 3:
                                circulo.mostrarDatos(circulo.getRadio());
                                break;
                            case 4:
                                System.out.println("Saliendo...");
                                salir2 = true;
                                break;
                            default:
                                System.out.println("Opción no contemplada");
                        }
                    } while (!salir2);
                    break;

                case 3:
                    System.out.println("Ha elegido trabajar con cuadrados");
                    System.out.println("Introduce la base: ");
                    cuadrado.setBase(scanner.nextInt());
                    System.out.println("Introduce la altura:");
                    cuadrado.setAltura(scanner.nextInt());

                    boolean salir3 = false;
                    do {
                        System.out.println("¿Qué operación quieres realizar? 1- Calcular área 2- Calcular perímetro 3- Mostrar datos 4- Salir");
                        int operacion2 = scanner.nextInt();
                        switch (operacion2) {
                            case 1:
                                cuadrado.calcularArea(cuadrado.getBase(), cuadrado.getAltura());
                                break;
                            case 2:
                                cuadrado.calcularPerimetro(cuadrado.getBase(), cuadrado.getAltura());
                                break;
                            case 3:
                                cuadrado.mostrarDatos(cuadrado.getBase(), cuadrado.getAltura());
                                break;
                            case 4:
                                System.out.println("Saliendo...");
                                salir3 = true;
                                break;
                            default:
                                System.out.println("Opción no contemplada.");
                        }
                    } while (!salir3);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        } while (opcion != 4);
    }
}
