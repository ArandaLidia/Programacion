import utils.CorreoNocontieneException;
import utils.TipoDatoIncorrectoException;
import utils.longitudDniNoValidaException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String nombre=null, apellidos=null, dni=null, correo=null;
        int opcion = 0;
        do {
            System.out.println("Que quieres realizar: 1.Rellenar nombre, 2. Rellenar apellido, 3-Rellenar dni, 4-Rellenar e-mail, 5-Salir: ");
            opcion= scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Introduce el nombre");
                    nombre=scanner.next();
                    scanner.nextLine();
                    for (int i = 0; i < nombre.length(); i++) {
                        boolean isDigit=Character.isDigit(nombre.charAt(i));
                        if (isDigit){
                            try {
                                throw new TipoDatoIncorrectoException("error");
                            } catch (TipoDatoIncorrectoException e) {
                                System.out.println("Tipo de dato incorrecto. nombre contiene digitos.");
                            }
                        }
                    }

                    break;
                case 2:
                    System.out.println("Introduce los apellidos:");
                    apellidos=scanner.nextLine();
                    for (int i = 0; i < apellidos.length(); i++) {
                        boolean isDigit=Character.isDigit(apellidos.charAt(i));
                        if (isDigit){
                            try {
                                throw new TipoDatoIncorrectoException("error");
                            } catch (TipoDatoIncorrectoException e) {
                                System.out.println("Tipo de dato incorrecto. nombre contiene digitos.");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Introduce el dni:");
                    dni= scanner.next();
                    int longitud=dni.length();
                    if (longitud<9){
                        try {
                            throw new longitudDniNoValidaException("longitud no valida");
                        } catch (longitudDniNoValidaException e) {
                            System.out.println("El dni debe tener una longitud de 9 digitos.");
                        }
                    }
                    for (int i = 0; i < dni.length()-1; i++) {
                        boolean isDitit=Character.isDigit(dni.charAt(i));
                        if (!isDitit){
                            try {
                                throw new TipoDatoIncorrectoException("incorrecto");

                            } catch (TipoDatoIncorrectoException e) {
                                System.out.println("Tipo dato incorrecto");
                            }
                        }
                    }
                    boolean isDigit=Character.isDigit(dni.charAt(dni.length()-1));
                    if (isDigit){
                        try {
                            throw new TipoDatoIncorrectoException("tipo dato incorrecto");
                        } catch (TipoDatoIncorrectoException e) {
                            System.out.println("Tipo de dato incorrecto ultima posicion dni");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Introduce el correo:");
                    correo= scanner.next();
                    if(!correo.contains("@")||!correo.contains(".")){
                        try {
                            throw new CorreoNocontieneException("Correo no contiene @ y .");
                        } catch (CorreoNocontieneException e) {
                            System.out.println("El e-mail debe contener @ y . ");
                        }
                    }
                    break;
                case 5:
                    if (nombre==null||apellidos==null||dni==null||correo==null){
                        System.out.println("Saliendo...");
                    }

                    break;
                default:
                    System.out.println("Introduce una opcion correcta.");
            }
        }while (opcion!=5||nombre==null||apellidos==null||dni==null||correo==null);

        System.out.println("El nombre es: "+nombre+", los apellidos: "+apellidos+" el dni es: "+dni+" y el e-mail: "+correo);
    }
}