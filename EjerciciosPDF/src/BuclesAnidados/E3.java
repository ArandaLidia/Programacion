package BuclesAnidados;
/*Diseña una aplicación que muestre las tablas de multiplicar del 1 al 10.
*/
public class E3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i + ":");
            for (int j = 0; j <= 10; j++) {
                System.out.println((i)+"*"+j+"="+i*j);
            }
            System.out.println();
        }
    }
}
