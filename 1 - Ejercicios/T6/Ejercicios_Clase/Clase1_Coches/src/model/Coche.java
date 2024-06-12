package model;
/*Desarrollar una clase llamada Coche que:

- Tenga un atributo private de tipo Motor, un atributo de tipo String (marca), otro de tipo String (modelo)
 y otro de tipo double con el precio acumulado con las averías.
- Tenga un constructor con dos parámetros de tipo String que inicialice la marca y el modelo.
- Tenga un getter para cada uno de los atributos.
- Un método acumularAveria que incrementará el importe gastado en averías.*/



    public class Coche {

        private Motor motor;
        private String marca, modelo;
        private double precioAverias;

        public Coche() {
        }

        public Coche(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }

        public Coche(Motor motor, String marca, String modelo) {
            this.motor = motor;
            this.marca = marca;
            this.modelo = modelo;
        }

        public void acumularAveria(double precioAveria){
            this.precioAverias += precioAveria;
        }

        public void mostrarDatos(){
            System.out.println("Marca "+marca);
            System.out.println("Modelo "+modelo);
            System.out.println("Averias "+precioAverias);
            System.out.println("Datos del motor");
            System.out.println("CV "+motor.getCv());
            System.out.println("Litros aceite "+motor.getLibtrosAceite());
        }

        public Motor getMotor() {
            return motor;
        }

        public void setMotor(Motor motor) {
            this.motor = motor;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public double getPrecioAveria() {
            return precioAverias;
        }

        public void setPrecioAveria(double precioAveria) {
            this.precioAverias = precioAveria;
        }
    }