package FOR;

import java.util.Scanner;

/*Leer un número entre 0 y 10. Se mostrará la tabla de multiplicar de dicho número con el formato: 5 x 3 = 15
(desde 0 hasta 10 en líneas distintas). (TablaDeMultiplicar)*/
public class FOR2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número entre 0 y 10");
        int numero= sc.nextInt();

        if (numero<0&&numero>10){
            System.out.println("Valor introducido no valido");
        }else{
            for (int i=0; i <= 10; i++) {

                int resultado=numero*i;
                System.out.println(numero+"*"+i+"="+resultado);
            }
        }
    }
}
