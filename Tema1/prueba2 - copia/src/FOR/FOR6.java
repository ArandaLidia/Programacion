package FOR;
/*Mostrar todos los números pares comprendidos entre dos dados. (ParesEntreDosDados)*/
public class FOR6 {
    public static void main(String[] args) {
        for (int i = 1; i <=12 ; i++) {
            int resto = i%2;
            if(resto==0){
                System.out.println("Numero par = "+i);
            }

        }
    }
}
