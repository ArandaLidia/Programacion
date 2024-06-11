package EjerciciosBASE;

/*4. Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo. Carga el array numero con
 valores aleatorios entre 0 y 100.
    - En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero.
    - En el array cubo se deben almacenar los cubos de los valores que hay en numero.*/

public class Array4 {
    public static void main(String[] args) {
        int []numero=new int[20];
        int []cuadrado=new int[20];
        int []cubo=new int[20];

        for (int i = 0; i < numero.length; i++) {
            numero[i]= (int) (Math.random()*101);
        }
        for(int item :numero){
        System.out.print(item+" ");
        }
            for (int i = 0; i < 20; i++) {


            }


    }
}
