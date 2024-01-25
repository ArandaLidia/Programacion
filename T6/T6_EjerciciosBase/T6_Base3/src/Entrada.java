import model.Persona;

/*3. En la clase creada en el ejercicio 1 crear los siguientes métodos con la funcionalidad que se indica:
    - Un método que recibe por parámetros un número e incrementa la edad de la persona en el parámetro pasado por argumentos
    - Un método que calcule y devuelva el IMC. Para calcular el imc se aplica la siguiente formula IMC = peso / (altura * altura)*/
public class Entrada {
    public static void main(String[] args) {

        Persona[]persona=new Persona[4];
        persona[0] = new Persona("Juan", "Pérez", "123456789X", 25, 70.5, 175);
        persona[0].mostrarDatos();

        persona[1] = new Persona("Ana", "Gómez", "987654321Y", 30);
        persona[1].mostrarDatos();

        persona[2] = new Persona("María", "Martínez");
        persona[2].mostrarDatos();

        persona[3] = new Persona();
        persona[3].mostrarDatos();


        System.out.println("El IMC es "+ persona[0].imc(persona[0].getPeso(),persona[0].getAltura()));
       ;
        persona[0].incrementa(persona[0].getEdad(10));
        for (Persona item : persona) {
             item.mostrarDatos();
        }
    }
}