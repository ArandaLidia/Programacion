package ExplicaciónBORJA;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Cadenadecaracteres {
    public static void main(String[] args) {

// Para declarar una variable compleja es necesario la palabra reservada new, excepto para String, ya que es la variable compleja más utilizada.

        Scanner sc = new Scanner(System.in);
        String palabra = new String("hola");
        palabra = "Esto es un ejemplo de frase para analizar";


//Devuelve el número de letras del String, incluyendo los espacios

        System.out.println("Imprime el número de letras que tiene el STring.");
        System.out.println(palabra.length());
        System.out.println();


//Devuelve en que posición está la letra

        System.out.println("Imprime la posición de la letra e. ");
        System.out.println(palabra.indexOf('e'));
        System.out.println();


//Devuelve en que posición está la última letra

        System.out.println("Imprime la posición de la última letra e.");
        System.out.println(palabra.lastIndexOf('e'));
        System.out.println();


//Cambiar una letra por otra

        // Toda la frase

        System.out.println(palabra.replaceAll("e", "i"));
        System.out.println("Reemplaza las letras e por letras i  y las letras a por 4.");
        System.out.println(palabra.replaceAll("e", "i").replaceAll("a", "4"));
        System.out.println(palabra.replace('e', 'i'));
        System.out.println();


        //Solo la primera letra

        System.out.println("Reemplaza la primera letra e, por i.");
        System.out.println(palabra.replaceFirst("e", "i"));
        System.out.println();


//Devuelve un conjunto de elementos para un Strig, cortados por el caracgter indicado. En este caso por cada "espacio" un elemento del String.

        System.out.println("Corta el String en el caracter < > y forma un array con todas las palabras. ");
        String[] palabras = palabra.split(" ");
        System.out.println("Imprime todas las posiciones del array");
        for (String item : palabras
        ) {
            System.out.println(item);
        }

        System.out.println();


//Devuelve un conjunto de elementos para un Strig, cortados por el caracgter indicado. En este caso devuelve un array de cada letra.

        System.out.println("Corta el String palabra en cada caracter, y lo guarda en el array palabrass");
        String[] palabrass = palabra.split("");
        System.out.println("Imprime todas las posiciones del array.");
        for (String item : palabrass
        ) {
            System.out.println(item);
        }
        System.out.println();


//Devuelve si la palabra está o no en el string.

        System.out.println("Imprime si la palabra ejemplo está dentro de la variable palabra.");
        palabra.contains("ejemplo");
        System.out.println(palabra.contains("ejemplo"));
        System.out.println();


//Devuelve los caracteres que están entre las dos posiciones, 0 y 6 en este caso, sin contar la posición 6.

        System.out.println("Imprime los caracteres que hay desde la posición 0 a la posición 6, posición 6 no incuida.");
        System.out.println(palabra.substring(0, 6));
        System.out.println();


//Devuelve los caracteres que están entre las  posiciones, en este caso desde la posición 6 incluida, hasta el final del String.

        System.out.println("Imprime cuantos caracteres hay desde la posición 6 hasta el final del String");
        System.out.println(palabra.substring(6));
        System.out.println();


//Comparar palabras teniendo en cuenta las mayusculas y minúsculas

        boolean igual = false;
        String prueba = "Ejemplo";
        System.out.println("Comparar String teniendo en cuenta mayúsculas o minúsculas.");
        if (prueba.equals("ejemplo")) {
            igual = true;
            System.out.println("La condicion es verdadera"
            );
        } else {
            System.out.println("La condición es falsa");
        }
        System.out.println();


//Comparar palabras SIN tener en cuenta las mayusculas y minúsculas

        System.out.println("Comparar String sin tener en cuenta mayusculas o minúsculas.");
        if (prueba.equalsIgnoreCase("ejemplo")) {
            System.out.println("La condición es verdadera");
        } else {
            System.out.println("La condición es falsa.");
        }
        System.out.println();
        System.out.println("Imprime el resultado de la variable boolean");
        boolean resultado = (prueba.equals("ejemplo"));
        System.out.println(resultado);
        System.out.println();


//Para pasar a mayuscula o a minúscula

        // a minuscula

        System.out.println("Cambiar la frase de la variable palabra a minúscula.");
        System.out.println(palabra.toLowerCase());
        System.out.println();
        // a mayuscula

        System.out.println("Cambiar la frase de la variable palabra a mayuscula");
        System.out.println(palabra.toUpperCase());
        System.out.println();


//Obtener char de una posición

        System.out.println("Obtener el char en la posición 5 de la palabra Ejemplo");
        System.out.println(prueba.charAt(5));
        System.out.println();


//Obtener char de la última posición

        System.out.println("Obtener el char que hay en la última posición de Ejemplo");
        System.out.println(prueba.charAt(prueba.length() - 1));
        System.out.println();


//Devuelve un String de dos String que digas

        System.out.println("String concatenando dos String");
        System.out.println(palabra.concat(prueba));
        System.out.println();


// Guarda en variable, String con banderas

        System.out.println("Hacer una variable con banderas %");
        palabra = String.format("Esto es un %s de %s formateada.", "ejemplo", "palabra");
        System.out.println(palabra);
        System.out.println();


//Sacar todas las letras de una palabra

        System.out.println("Letras de una palabra");
        for (int i = 0; i < prueba.length(); i++) {
            System.out.println(prueba.charAt(i));
        }
        System.out.println();


//Saber cuantas palabras tengo

        System.out.println("Saber el número de palabras en un String.");
        int numeroPalabras = palabra.split(" ").length;
        System.out.println("El número de palabras es " + numeroPalabras);
        System.out.println();


//Saber cuantas letras tengo

        System.out.println("Para saber las letras que tengo sin contar los espacios.");
        int contador = 0; //Contador a 0 que va contando las letras de cada palabra.
        String[] palabraSeparadas = palabra.split((" ")); //String que se forma porque la cadena de caracteres se separa en un espacio. El string contiene todas las palabras de la cadena.
        for (String item :
                palabraSeparadas) {
            contador += item.length();
        }
        //foreach para recorrer cada una de las palabras del array, y se va guardando el numero de caracteres en el contador.
        System.out.println("El número de letras es " + contador);
        System.out.println();


//Saber cuantas letras tiene un String, sin utilizar FOR

        System.out.println("Crea una variable donde reemplaza los espacios, por nada. Se crea una variable con todas las palabras sin espacios.");
        palabra = palabra.replaceAll(" ", "");
        System.out.println(palabra);
        System.out.println("Usamos la nueva variable.length, para contar el número de caracteres.");
        System.out.println(palabra.length());
        System.out.println();

//Saber cuantas oraciones tengo. -> split(".")
        System.out.println("Saber el número de oraciones y cuantas palabras tiene cada oración.");
        String frase = "Esto es un ejemplo. De una frase para poder analizar. En la clase de programación" +
                "en el ciclo de DAW";
//Partir (Split) por el <.>
        String[] oraciones = frase.split("\\.");
        System.out.println("El número de oraciones es: " + oraciones.length);
        //Cuantas palabras tiene cada oración
        int numeroPalabrasTotales=0;
        for (String item : oraciones
        ) {
            int numeroPalabrasOracion = 0;
            numeroPalabrasOracion += item.split(" ").length;
            numeroPalabrasTotales += item.split(" ").length;
            System.out.println("El numero de palabras de la oracion: "+item +", es: "+ numeroPalabrasOracion);

        }
        System.out.println("El número de palabras totales de todas las oraciones es "+numeroPalabrasTotales);
        System.out.println();

palabra="bolo";
        System.out.println(palabra.replaceAll("e", "i").replaceAll("a", "4"));
    }
}

