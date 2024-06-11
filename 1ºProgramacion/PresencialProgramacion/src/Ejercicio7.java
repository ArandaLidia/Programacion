import java.util.Arrays;
import java.util.Scanner;

/*Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos
entre 0 y 500 (ambos incluidos).
A continuación el programa mostrará el array y preguntará si el usuario
quiere destacar el máximo o el mínimo.
 Seguidamente se volverá a mostrar el array escribiendo el número
destacado entre dobles asteriscos.
Nota: para generar los números aleatorios podemos utilizar n = (int)(Math.random() * 501);*/
public class Ejercicio7 {
    public static void main(String[] args) {
        int[]array=new int[100];
        int aleatorio=0;
        boolean repetido=false;
        for (int i = 0; i < array.length; i++) {

            do {
                aleatorio = (int)(Math.random() * 501);
                for (int j = 0; j < array.length; j++) {
                    if(aleatorio==array[j]){
                        repetido=true;
                    }else {
                        repetido=false;
                    }
                }
            }while (repetido);
            array[i]=aleatorio;
        }

        for(int item:array){

            System.out.print(item+" ");
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Cual quieres destacar? 1) Máximo, 2) Mínimo");
        int opcion= sc.nextInt();
        int maximo=0;
        int minimo=600;
        switch (opcion){
            case 1:
                for (int i = 0; i < array.length; i++) {
                    if(array[i]>maximo){
                        maximo=array[i];
                    }

                }
                for (int i = 0; i < array.length; i++) {
                    if(array[i]==maximo){
                        System.out.println("**"+array[i]+"**");
                    }else{
                        System.out.println(array[i]);
                    }
                }
                break;
            case 2:
                for (int i = 0; i < array.length; i++) {
                    if (array[i] < minimo) {
                        minimo = array[i];
                    }
                }
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == minimo) {
                        System.out.println("**" + array[i] + "**");
                    } else {
                        System.out.println(array[i]);
                    }
                }
                break;
            default:
                System.out.println("Opción no contemplada.");
                break;
        }
    }
}
