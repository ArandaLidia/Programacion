/*1. Crea una clase llamada persona con los siguientes elementos
    - Propiedades: nombre (string) apellido (string) dni (string) edad (int) peso (double) altura (int)
    - Métodos:
        - mostrarDatos: sacará por pantalla los datos de la persona formateados
        - Métodos getters y setters asociados
        - Constructores:
            - un constructor que permita crear una persona con todos los datos
            - un constructor que permita crear una persona sin peso ni altura
            - un constructor que permita crear una persona con nombre y apellidos, el resto de datos los pondrá a 0, excepto el dni que lo pondrá a 111111111X
            - un constructor que permita crear una persona sin datos de entrada. Los inicializará todos a "datos por defecto", 1111111111X y 0 respectivamente*/

import model.Persona;


public class Entrada {
    public static void main(String[] args) {

        //El objeto persona tiene las caracteristicas: nombre, apellido, dni, edad, peso y altura.
        Persona persona1 = new Persona("Juan", "Pérez", "123456789X", 25, 70.5, 175);
        persona1.mostrarDatos();

        Persona persona2 = new Persona("Ana", "Gómez", "987654321Y", 30);
        persona2.mostrarDatos();

        Persona persona3 = new Persona("María", "Martínez");
        persona3.mostrarDatos();

        Persona persona4 = new Persona();
        persona4.mostrarDatos();


    }
}