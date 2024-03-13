package model;
/*Modifica el ejercicio anterior para que el IMC se pueda calcular según el genero de la persona. En este caso,
para poder calcular el IMC según genero se utilizan las siguientes tablas*/
public class Persona {
    private String nombre, apellido, dni;
    private int edad, altura;
    private double peso;

    private String genero;

    public Persona(String nombre, String apellido, String dni, int edad, int altura, double peso, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.genero = "";
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void aumentarEdad(int incrementar){
        edad+=incrementar;
    }

    public void imc(){
        double imc=(peso/(altura*altura))*10000;
        System.out.println("El imc de "+getNombre()+" es "+imc);
        if(genero.equalsIgnoreCase("mujer")){
            if(imc<19.9){
                System.out.println("Bajo peso.");
            } else if (imc>=20&&imc<=24.9) {
                System.out.println("Normopeso.");
            } else if (imc>=25&&imc<=29.9) {
                System.out.println("Sobrepeso");
            } else if (imc>=30&&imc<=39.9) {
                System.out.println("Obesidad");
            }else{
                System.out.println("Obesidad mórbida.");
            }
        } else if (genero.equalsIgnoreCase("hombre")) {
            if(imc<19.9){
                System.out.println("Bajo peso");
            } else if (imc>=20&&imc<=26.9) {
                System.out.println("Normopeso.");
            } else if (imc>=27&&imc<=29.9) {
                System.out.println("Sobrepeso");
            } else if (imc>=30&&imc<=39.9) {
                System.out.println("Obesidad");
            }else{
                System.out.println("Obesidad mórbida.");
            }
        }else {
            System.out.println("Genero no contemplado.");
        }

    }
    public Persona(String nombre, String apellido, String dni, int edad, int altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }
    public Persona() {
        this.nombre = "Datos por defecto";
        this.apellido = "Datos por defecto";
        this.dni = "111111111X";
        this.edad = 0;
        this.altura = 0;
        this.peso = 0.0;
    }

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = "111111111X";
    }

    public Persona(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }


    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("El apellido es: "+apellido);
        System.out.println("El DNI es: "+dni);
        System.out.println("La edad es: "+edad);
        System.out.println("La altura es: "+altura);
        System.out.println("El peso es: "+peso);
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
