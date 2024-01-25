package model;
/*En la clase entrada creada en el ejercicio 2 crear los siguiente
La persona que tiene todos los datos (p1) muestra por pantalla su IMC
Según el IMC mostrado por pantalla, también se tendrá que mostrar por consola el estado físico de la persona. Para ello hay que tener en cuenta lo siguiente
- Peso inferior al normal		Menos de 18.5
- Normal		18.5 – 24.9
- Peso superior al normal		25.0 – 29.9
- Obesidad		Más de 30.0
*/


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

    public double imc(double peso, int altura){

        if(peso==0||altura==0){
            return 0;
        }else{
            double alturaCM= (double) this.altura /100;
            double imc=this.peso/Math.pow(alturaCM,2);
            return imc;
        }
    }

    public void estadoFisico(){
        double resultadoIMC=imc(this.getPeso(),this.getAltura());
        if(resultadoIMC>=30){
            System.out.println(" El usuario tiene obesidad");
        } else if (resultadoIMC>=25||resultadoIMC>=29.9) {
            System.out.println("El usuario tiene un peso superior al  normal. ");
        } else if (resultadoIMC<24.9||resultadoIMC>=18.5) {
            System.out.println("El usuario tiene un IMC normal");
        } else if (resultadoIMC<=18.4) {
            System.out.println("El usuario tiene un peso inferior al normal. ");
        }
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
