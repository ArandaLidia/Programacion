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


    public void aumentarEdad(int incrementar){
        edad+=incrementar;
    }

    public void imc(){
        double imc=(peso/(altura*altura))*10000;
        System.out.println("El imc de "+getNombre()+" es "+imc);
        if(imc<18.5){
            System.out.println("Peso inferior al normal.");
        } else if (imc>=18.5&&imc<=24.9) {
            System.out.println("Peso normal.");
        } else if (imc>=25&&imc<=29.9) {
            System.out.println("Peso superior al normal.");
        }else{
            System.out.println("Obesidad");
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
