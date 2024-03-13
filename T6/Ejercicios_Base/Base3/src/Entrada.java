import model.Persona;
/* 3. En la clase creada en el ejercicio 1 crear los siguientes métodos con la funcionalidad que se indica:
    - Un método que recibe por parámetros un número e incrementa la edad de la persona en el parámetro pasado por argumentos
    - Un método que calcule y devuelva el IMC. Para calcular el imc se aplica la siguiente formula IMC = peso / (altura * altura)
*/
public class Entrada {
    public static void main(String[] args) {
        Persona persona=new Persona();
        Persona persona1=new Persona("Nombre", "Apellido", "DNI");
        Persona persona2=new Persona("nombre", "apellido", "dni", 35, 170, 55.5);

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