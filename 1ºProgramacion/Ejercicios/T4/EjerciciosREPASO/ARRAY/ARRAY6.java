package ARRAY;
/*2. Escribe un programa que rellene un array de 20 números aleatorios entre el 0 y el 30. Una vez hecho esto realizará las siguientes operaciones:
    - modificar todos los 6 por 8
    - modificar todos los 7 por 15
    - modificar todos los 20 por 10*/
public class ARRAY6 {
    public static void main(String[] args) {
        int[]numeros= new int[20];
        int aleatorio=0;
        int modificaciones1=0;
        int modificaciones2=0;
        int modificaciones3=0;
        for (int i = 0; i <numeros.length; i++) {
            aleatorio= (int) (Math.random()*31);
            numeros[i]=aleatorio;
            System.out.print(numeros[i]+"\t ");
            if(numeros[i]==6){
                numeros[i]=8;
                modificaciones1++;
            }else if(numeros[i]==7){
                numeros[i]=15;
                modificaciones2++;
            }else if(numeros[i]==20){
                numeros[i]=10;
                modificaciones3++;
            }


        }
        System.out.println("");
        for (int item :numeros) {
            System.out.print(item+"\t ");

        }

        System.out.println("\nNumero de modificaciones: "+(modificaciones1+modificaciones2+modificaciones3));
    }
}
