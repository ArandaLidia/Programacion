package WHILE_DOWHILE;
/*Generar números enteros aleatorios entre 0 y 100 hasta obtener el 0. El programa mostrará cada uno de los datos
 generados y obtendrá el mayor de los números generados. */
public class WHILE3 {
    public static void main(String[] args) {
        int aleatorio=1;
        int generados=0;
        do{
            for (int i = 0; i < aleatorio; i++) {
                aleatorio= (int) (Math.random()*99);
                System.out.println("Numero generado"+i+" "+aleatorio);
                if(aleatorio>generados){
                    generados=aleatorio;

                }
            }

        }while(aleatorio!=0);
        System.out.println("El número generado mayor es: "+generados);
    }
}
