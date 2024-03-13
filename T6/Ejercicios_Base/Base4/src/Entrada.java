/*En la clase entrada creada en el ejercicio 2 crear los siguiente
La persona que tiene todos los datos (p1) muestra por pantalla su IMC
Según el IMC mostrado por pantalla, también se tendrá que mostrar por consola el estado físico de la persona. Para ello hay que tener en cuenta lo siguiente
- Peso inferior al normal		Menos de 18.5
- Normal		18.5 – 24.9
- Peso superior al normal		25.0 – 29.9
- Obesidad		Más de 30.0
*/

import model.Persona;

public class Entrada {
    public static void main(String[] args) {
        Persona persona=new Persona();
        Persona persona1=new Persona("Nombre", "Apellido", "DNI");
        Persona persona2=new Persona("nombre", "apellido", "dni", 35, 165, 55.5);

        persona.mostrarDatos();
        System.out.println();
        persona1.mostrarDatos();
        System.out.println();
        persona2.mostrarDatos();
        System.out.println();

        persona2.aumentarEdad(10);
        System.out.println();
        persona2.mostrarDatos();
        System.out.println();
        persona2.imc();
    }
}