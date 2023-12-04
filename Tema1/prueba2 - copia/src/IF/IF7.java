package IF;

import java.util.Scanner;

/*7. Un número de 3 cifras es un número de Armstrong si la suma de sus dígitos elevado a 3 coincide con dicho número. Por ejemplo, 153 = 1+125+27. Dado un número de 3 cifras determinar si es o no un número Armstrong. Se comprobará previamente que el número introducido tiene 3 dígitos. En la salida se mostrará uno de los siguientes mensajes:
1. “El número no tiene 3 dígitos”
2. “Es un número Armstrong”
3. “No es un número Armstrong”.*/
public class IF7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero= sc.nextInt();
        int centenas=numero/100;
        int resto=numero%100;
        int decenas=resto/10;
        int unidades=resto%10;

        int potencia1 = (int) Math.pow(unidades, 3);
        int potencia2=(int)Math.pow(centenas,3);
        int potencia3=(int)Math.pow(decenas,3);
        int sumapotencias=potencia3+potencia1+potencia2;

        if(numero>99&&numero<1000){
            if(sumapotencias==numero ){
                System.out.println("Es un número Armstrong");
            }else{
                System.out.println("No es un  número Armstrong");
            }
        }else{
            System.out.println("El número introducido no tiene 3 dígitos");
        }

    }
}
