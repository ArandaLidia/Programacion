package model;
/*3. En la clase creada en el ejercicio 1 crear los siguientes métodos con la funcionalidad que se indica:
    - Un método que recibe por parámetros un número e incrementa la edad de la persona en el parámetro pasado por argumentos
    - Un método que calcule y devuelva el IMC. Para calcular el imc se aplica la siguiente formula IMC = peso / (altura * altura)*/
public class Persona {
        private String nombre, apellido, dni;
        private int edad, altura;
        private double peso;

        public Persona(){
            this.dni = "111111111X";
        }

        public Persona(String nombre, String apellido, String dni, int edad, double peso, int altura) {

            this.nombre = nombre;
            this.apellido = apellido;
            this.dni=dni;
            this.edad=edad;
            this.peso=peso;
            this.altura=altura;
        }
        public Persona(String nombre, String apellido, String dni, int edad) {

            this.nombre = nombre;
            this.apellido = apellido;
            this.dni=dni;
            this.edad=edad;

        }



        public Persona(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = "111111111X";

        }

        public int incrementa(int num){
            this.edad=this.edad+num;
            return this.edad;
        }
        public double imc(double peso, int altura){
            if(this.altura==0){
                return 0;
            }else {
                double alturaMetros=(double) this.altura/100;
                double imc=(double)((this.peso)/(alturaMetros*alturaMetros));
                return imc;
            }

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

        public int getEdad(int i) {
            return edad;
        }

        public void setEdad(int i) {
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
        public void mostrarDatos() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("DNI: " + dni);
            System.out.println("Edad: " + edad);
            System.out.println("Peso: " + peso);
            System.out.println("Altura: " + altura);
        }

    }

