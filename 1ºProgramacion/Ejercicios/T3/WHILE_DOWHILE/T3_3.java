package WHILE_DOWHILE;
/*Generar números enteros aleatorios entre 0 y 100 hasta obtener el 0. El programa mostrará cada uno de los datos generados
 y obtendrá el mayor de los números generados.
 */
public class T3_3 {
    public static void main(String[] args) {
        int aleatorio=0;
        int generar = 1;
        boolean generados=false;

        do{
            for (int i = 0; i < generar; i++) {
                aleatorio = (int) (Math.random() * 100);
                generar++;


            }
            if (aleatorio==0){
                generados=true;
                System.out.println("Los números aleatorios generados son: "+ aleatorio);
                break;
            }



        }while(!generados);

    }

}
