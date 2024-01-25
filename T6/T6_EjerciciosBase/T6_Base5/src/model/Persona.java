package model;
/*Modifica el ejercicio anterior para que el IMC se pueda calcular según el genero de la persona.
En este caso, para poder calcular el IMC según genero se utilizan las siguientes tablas*/
public class Persona {
    private String nombre, apellido, dni, genero;
    private int edad, altura;
    private double peso;


    public Persona(){

    }
    public Persona(String nombre, String apellido, String dni, int edad, double peso, int altura, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.genero=genero;
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
        if(genero!=null){
            if(genero.equalsIgnoreCase("Mujer")){
                if(resultadoIMC>=30){
                    System.out.println(" El usuario tiene obesidad");
                } else if (resultadoIMC>25&&resultadoIMC<=29.9) {
                    System.out.println("El usuario tiene un peso superior al  normal. ");
                } else if (resultadoIMC<=25&&resultadoIMC>20) {
                    System.out.println("El usuario tiene un IMC normal");
                } else if (resultadoIMC<=20) {
                    System.out.println("El usuario tiene un peso inferior al normal. ");
                }
            }else if(genero.equalsIgnoreCase("Hombre")){
                if(resultadoIMC>=30){
                    System.out.println(" El usuario tiene obesidad");
                } else if (resultadoIMC>27&&resultadoIMC<=29.9) {
                    System.out.println("El usuario tiene un peso superior al  normal. ");
                } else if (resultadoIMC>20&&resultadoIMC<=27) {
                    System.out.println("El usuario tiene un IMC normal");
                } else if (resultadoIMC<=20) {
                    System.out.println("El usuario tiene un peso inferior al normal. ");
                }
            }
        }else {
            System.out.println("Genero no especificado");
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
