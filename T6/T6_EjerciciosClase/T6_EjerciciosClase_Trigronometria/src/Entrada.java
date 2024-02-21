import model.Circulo;
import model.Cuadrado;
import model.Triangulo;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Triangulo triangulo=new Triangulo(15.9,20.1);
        Circulo circulo=new Circulo(10.4);
        Cuadrado cuadrado=new Cuadrado(14,5);

        System.out.println("La base del triángulo es "+triangulo.getBase()+" y la altura del triángulo es "+triangulo.getAltura());
        System.out.println("El área del triángulo es " + triangulo.area());
        System.out.println("El radio del círculo es "+circulo.getRadio());
        System.out.println("El área del circulo es "+circulo.area(circulo.getRadio())+" el diámetro del circulo es "+circulo.getRadio());
        System.out.println("La base del cuadrado es "+cuadrado.getBase()+" y la altura es "+cuadrado.getAltura());
        System.out.println("El área del cuadrado es "+cuadrado.calculaArea(cuadrado.getBase(), cuadrado.getAltura())+" y el perímetro es "+cuadrado.calculaPerimetro(cuadrado.getBase(),cuadrado.getAltura()));
        circulo.mostrarDatos();
        cuadrado.mostrarDatos();
        triangulo.mostrarDatos();

        Scanner scanner=new Scanner(System.in);
        System.out.println("¿Con qué quieres trabajar? 1- Triángulos 2- Círculos 3- Cuadrados");
        int opcion= scanner.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Introduce la base:");
                triangulo.setBase(scanner.nextInt());
                System.out.println("Introduce la altura");
                triangulo.setAltura(scanner.nextInt());
                System.out.println("¿Qué operación quieres realizar? Calcular area= area, mostrar datos= datos");
                String operacion= scanner.next();
                if(operacion.equalsIgnoreCase("area")){
                    System.out.println("El area del triángulo es "+triangulo.area());
                }else if(operacion.equalsIgnoreCase("datos")) {
                    System.out.println("La altura del triángulo es " + triangulo.getAltura() + " y la base " + triangulo.getBase());
                }
                System.out.println("Introduzca <enter> para continuar");
                char enter=scanner.next().charAt(0);
                break;
            case 2:
                System.out.println("Introduce el radio:");
                circulo.setRadio(scanner.nextInt());
                System.out.println("¿Qué operación quieres realizar? Calcular area (area), calcular diámetro (diámetro) o mostrar datos (datos)");
                String operacionCirculos= scanner.next();
                if(circulo.getRadio()<=0){
                    System.out.println("Radio no válido.");
                }else {
                    if(operacionCirculos.equalsIgnoreCase("area")){
                        System.out.println("El area del círculo es "+circulo.getArea());
                    }else if(operacionCirculos.equalsIgnoreCase("diametro")) {
                        System.out.println("El diámetro del circulo es "+circulo.getDiametro());
                    } else if(operacionCirculos.equalsIgnoreCase("datos")) {
                        System.out.println("La altura del triángulo es " + triangulo.getAltura() + " y la base " + triangulo.getBase());
                    }else {
                        System.out.println("Operación no contemplada.");
                    }
                }

                System.out.println("Introduzca <enter> para continuar");
                char enter=scanner.next().charAt(0);
                break;
            case 3:
                break;

            default:

        }
    }
}