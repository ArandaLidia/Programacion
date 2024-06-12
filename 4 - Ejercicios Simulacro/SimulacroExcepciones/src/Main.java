import util.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;
        String nombre = null, apellido = null, dni = null, email = null;
        boolean salir = false;

        do {
            System.out.println("Que opción quieres realizar= 1-Mostrar nombre, 2-Rellenar apellidos 3-Rellenar DNI 4-Rellenar E-mail 5-Finalizar:");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el nombre");
                    nombre = scanner.next();
                    for (int i = 0; i < nombre.length(); i++) {
                        boolean isDigit = Character.isDigit(nombre.charAt(i));
                        if (isDigit) {
                            try {
                                throw new TipoDatoIncorrectoException("Tipo de dato incorrecto");
                            } catch (TipoDatoIncorrectoException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                    }


                    break;
                case 2:
                    System.out.println("Introduce el apellido");
                    apellido = scanner.next();
                    for (int i = 0; i < apellido.length(); i++) {
                        boolean isDigit = Character.isDigit(apellido.charAt(i));
                        if (isDigit) {
                            try {
                                throw new TipoDatoIncorrectoException("Tipo de dato incorrecto.");
                            } catch (TipoDatoIncorrectoException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Introduce el dni");
                    dni = scanner.next();
                    int longitud = dni.length();

                    try {
                        if (dni.length() != 9) {
                            throw new LongitudDNINoValidaException("Longitud de DNI no válida.");
                        }

                        for (int i = 0; i < dni.length() - 1; i++) {
                            if (!Character.isDigit(dni.charAt(i))) {
                                throw new NumeracionContieneLetrasException("Ha introducido un caracter no permitido.");
                            }
                        }
                        if (!Character.isLetter(dni.charAt(dni.length() - 1))) {
                            throw new UltimoDigitoNoLetraException("El último dígito no es una letra.");
                        }
                        System.out.println("El DNI ingresado es válido.");
                    } catch (LongitudDNINoValidaException e) {
                        System.out.println(e.getMessage());
                    } catch (NumeracionContieneLetrasException e) {
                        System.out.println("Ha introducido una letra en la numeración del DNI");
                    } catch (UltimoDigitoNoLetraException e) {
                        System.out.println("El ultimo digito no es una letra.");
                    }
                    break;
                case 4:
                    System.out.println("Introduce el e-mail: ");
                    email = scanner.next();
                    boolean correcto=false;
                    if(!email.contains("@")||!email.contains(".")){
                        try {
                            throw new EmailIncorrectoException("Email incorrecto.");
                        } catch (EmailIncorrectoException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Finalizando");
                    if (nombre != null && apellido != null && dni != null && email != null) {
                        salir = true;

                    }
                    break;
                default:
                    System.out.println("Opción no contemplada");
            }

        } while (opcion != 5 || !salir) ;
    }
}
