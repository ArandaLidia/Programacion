package model;
/*2. Crear una clase llamada entrada que tenga un método main el cual:
    - Mediante un scanner pida nombre, apellido, dni edad peso y altura de una persona
    - Cree la persona asociada a los datos leídos por teclado (p1)
    - Cree una persona con un nombre y un apellido que se introduzca a mano (sin scanner)
    - Crear una persona sin datos asociados
    - Mostrar los datos de todas las personas
    - Modificar la edad de todas las personas a 20*/
public class Persona {
    private String nombre, apellido, dni;
    private int edad, altura;
    private double peso;

    public Persona(){

    }
    public Persona(String nombre, String apellido, String dni, int edad, double peso, int altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }
    public Persona(String nombre, String apellido){
this.nombre=nombre;
this.apellido=apellido;
    }

    public void mostrarDatos(){
        System.out.println("El usuario "+this.nombre+" es: "+nombre+" "+apellido+" con DNI: "+dni+" tiene "+ edad+" años "+" y pesa "+peso+" Kg y mide "+ altura+" cm.");
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
