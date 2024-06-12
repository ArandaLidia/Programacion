import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce una palabra sin acentos:");
        String palabra= scanner.next();
        System.out.println(palabra);
        if (palabra.length()<4){
            String palabraMayus= palabra.toUpperCase();
            System.out.println(palabraMayus);
        } else if ((palabra.length()<8)) {
            String palabraMinuscula=palabra.toLowerCase();
            System.out.println(palabraMinuscula);
        }else if (palabra.length()<11){
            String palabraAcentuada=palabra.replaceAll("a","á").replaceAll("e","é").replaceAll("i","í").replaceAll("o","ó").replaceAll("u","ú");
            System.out.println(palabraAcentuada);
        }else{
            String palabraTransform="";
            for (int i =palabra.length()-1; i >=0 ; i--) {
                palabraTransform+=palabra.charAt(i);
            }
            System.out.println(palabraTransform);
        }


    }
}