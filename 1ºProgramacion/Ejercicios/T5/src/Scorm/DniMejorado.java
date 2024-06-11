package Scorm;

import java.util.Scanner;
/*Le pasaremos un número de DNI y una letra, y nos devolverá el resultado true si la letra es correcta o false si no lo es. */
public class DniMejorado {
    public static char letraDNI(int numeroDNI) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
                'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int indiceBusqueda = numeroDNI % 23;
        return letras[indiceBusqueda];
    }
    public static boolean correcto(char letra, int indice){
        if
        return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un DNI: ");
        int dni = teclado.nextInt();
        System.out.println("Introduce la letra:");
        char letra=teclado.nextLine().charAt(0);

        char tuLetra = letraDNI(dni);
        System.out.println("La letra del DNI es la " + tuLetra);
    }
}
