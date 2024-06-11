package ExplicaciónNOTION;
/*Realizar un menú con 4 posibilidades, donde cada vez que se pulse una opción aparezca el mensaje "Pulsada la opción 1".
Tras mostrar el mensaje se volverá a mostrar el menú con su correspondiente ejecución. La 4 posibilidad parará la ejecución con el mensaje "saliendo ...".
 En el caso de introducir un número que no esté entre 1 y 4 aparecerá el mensaje "número no contemplado"*/

import java.sql.SQLOutput;
import java.util.Random;

public class Repeticion3 {
    public static void main(String[] args) {
        int numero=123;
        String cadena=Integer.toString(numero);
        System.out.println(cadena+cadena);
        int numero1=Integer.parseInt(cadena);
        System.out.println(numero1+numero1);

        Random semillaAleatorio=new Random();
        System.out.println(semillaAleatorio);
        int numeroAleatorio= semillaAleatorio.nextInt();
        System.out.println(numeroAleatorio);
        int cuadrado = (int) Math.pow(3,4);
        System.out.println(cuadrado);
    }

}
