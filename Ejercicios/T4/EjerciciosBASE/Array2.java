package EjerciciosBASE;

/*2. Crear un programa que genere 30 números aleatorios entre 0 - 10 y los guarde en un array.
    Una vez metidos, se deberá mostrar:
    - Numero de puntos obtenidos
    - Media de puntos obtenidos*/


public class Array2 {
    public static void main(String[] args) {
        int suma=0;
         int []numeros =new int [30];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=(int) (Math.random()*11);
            suma+=numeros[i];
        }
            double media =(double) suma/numeros.length;
                for (int item : numeros)
                    System.out.println(item+" ");
            System.out.println("La suma de los puntos obtenidos es: "+suma);
            System.out.println("La media de los puntos es "+media);
        }

    }

