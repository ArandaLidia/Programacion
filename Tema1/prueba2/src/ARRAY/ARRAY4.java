package ARRAY;

/*4. Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100.
    - En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero.
    - En el array cubo se deben almacenar los cubos de los valores que hay en numero.*/
public class ARRAY4 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
        int aleatorio = 0;
        for (int i = 0; i < numeros.length - 1; i++) {
            aleatorio = (int) (Math.random() * 100);
            numeros[i] = aleatorio;
            cuadrado[i]= (int) Math.pow(aleatorio,2);
            cubo[i]= (int) Math.pow(aleatorio,3);
              System.out.print(numeros[i]+"\t");
            System.out.print(cuadrado[i]+"\t");
            System.out.println(cubo[i]+"\t");


        }
    }
}
