package model;
/*Desarrollar una clase Coche que tenga las siguientes características:

- Atributo de tipo int que represente los caballos
- Atributo de tipo int que represente la velocidad
- Atributo de tipo String que represente la matricula
- Atributo de tipo String que represente el modelo
- Atributo de tipo double que represente los kilómetros recorridos
- Un constructor vacío que inicialice los cv a 0, la velocidad a 0, la matricula a 0000AAA, el modelo a "sin especificar" y los km a 0.0
- Un constructor con los siguientes parámetros: modelo, matrícula y cv. Se iniciarán los atributos a los parámetros pasados y el resto lo hará a los valores por defecto
- Un método acelerar que reciba como parámetros un argumento de tipo int, que no retorne nada y realice la siguiente funcionalidad:
    - Incrementa la velocidad en la cantidad pasada por parámetros
    - Incrementa los kilómetros en: velocidad * ((caballos)*número aleatorio entre 1 y 10)
    - La velocidad máxima del coche es 180, en el caso de superarla se pondrá el valor 180 y se mostrará un mensaje por pantalla
- Un método frenar que reciba como parámetros un argumento de tipo int, que no retorne nada y realice la siguiente funcionalidad:
    - Decrementa la velocidad en la cantidad pasada por parámetros
    - La velocidad mínima del coche es 0, en el caso de superarla se pondrá el valor 0 y se mostrará un mensaje por pantalla
- Un método parar que no recibirá nada por parámetros y que no devuelva nada. Su funcionalidad será la siguiente:- Un método parar que no recibirá nada por parámetros y que no devuelva nada. Su funcionalidad será la siguiente:
    - Pondrá la velocidad del cocha a 0
- Un método resetear que no reciba nada por parámetros y no devuelva nada. Su funcionalidad será la siguiente:
    - Pondrá la velocidad del coche a 0 y los kilómetros a 0
- Un método mostrar datos que muestre por pantalla los datos del coche con el siguiente formato:
    - Matrícula: XXX Modelo: XXX CV: XXX Velocidad: XXX Kilómetros: XXX
- Un método setter para cada uno de los atributos
- Un método getter para cada uno de los atributos

Desarrollar una clase Entrada que represente el punto de entrada de la aplicación. La funcionalidad de la aplicación será la siguiente

- Crear dos coches:
    - (CocheA) Uno con el constructor por defectoç
    - (CocheB) Uno pasando modelo, matricula y caballos
- Muestra por pantalla los datos de los dos coches
- Modifica los datos del CocheA y por
    - Modelo, Matricula y CV
- Modifica la velocidad del CocheA en un número aleatorio entre 10 y 30
- Modifica la velocidad del CocheB en un número aleatorio entre 10 y 30
- Muestra por pantalla los datos de los dos coches
- Imprime por pantalla el siguiente mensaje, teniendo en cuenta que el coche ganador será el que más km haya recorrido
    - El ganador es modelo matricula con km recorridos

*/
public class Coche {

    private int caballos, velocidad;
    private String matricula, modelo;
    private double kmRecorridos;

    public Coche() {
        this.caballos=0;
        this.matricula="0000AAA";
        this.modelo="Sin especificar";
        this.kmRecorridos=0.0;
    }

    public Coche(int caballos, String matricula, String modelo) {
        this.caballos = caballos;
        this.matricula = matricula;
        this.modelo = modelo;
    }
    public  void frenar(int b){
        velocidad=velocidad-b;
        if(velocidad<0){
            velocidad=0;
            System.out.println("Velocidad mínima 0km/h");
        }
    }
    public  void acelerar(int a){
        velocidad=velocidad+a;
        kmRecorridos=velocidad*((caballos*Math.random()*10+1));
        if (velocidad>180){
            velocidad=180;
            System.out.println("Has pasado el límite de velocidad, velocidad a :180km/h");
        }
    }
    public void parar(){
        velocidad=0;
    }
public void resetear(){
        velocidad=0;
        kmRecorridos=0;
    }
    public void mostrarDatos(){
        System.out.println("Matrícula: "+matricula);
        System.out.println("Modelo: "+modelo);
        System.out.println("CV: "+caballos);
        System.out.println("Velocidad: "+ velocidad);
        System.out.println("Kilometros: "+kmRecorridos);
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }
}
