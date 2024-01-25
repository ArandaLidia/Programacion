/* En la clase entrada creada en el ejercicio 2 crear los siguiente
La persona que tiene todos los datos (p1) muestra por pantalla su IMC
Según el IMC mostrado por pantalla, también se tendrá que mostrar por consola el estado físico de la persona. Para ello hay que tener en cuenta lo siguiente
- Peso inferior al normal		Menos de 18.5
- Normal		18.5 – 24.9
- Peso superior al normal		25.0 – 29.9
- Obesidad		Más de 30.0
*/
import model.Persona;

import java.util.Scanner;

        public class Entrada {
            public static void main(String[] args) {
                Scanner scanner=new Scanner(System.in);
                Persona[]persona=new Persona[3];
                System.out.println("Introduce nombre, apellidos, dni, edad, peso y altura:");
                persona[0]=new Persona();
                persona[1]=new Persona(scanner.next(),scanner.next(), scanner.next(),scanner.nextInt(), scanner.nextDouble(),  scanner.nextInt());
                persona[2]=new Persona("Lidia","Aranda");


                persona[1].mostrarDatos();
                System.out.println("El indice de masa corporal de "+persona[1].getNombre()+" es: "+persona[1].imc(persona[1].getPeso(),persona[1].getAltura()));
                persona[1].estadoFisico();
    }
}