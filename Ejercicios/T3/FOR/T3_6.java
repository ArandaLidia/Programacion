package FOR;
/*Mostrar todos los números pares comprendidos entre dos dados. (ParesEntreDosDados)*/

public class T3_6 {
    public static void main(String[] args) {
        int numeroUno = 1;
        int numeroDos = 12;

        for (int i = numeroUno; i <= numeroDos; i++) {
            // pares
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}