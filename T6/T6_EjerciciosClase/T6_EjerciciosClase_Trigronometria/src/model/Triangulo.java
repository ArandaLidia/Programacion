package model;

public class Triangulo {

    private double base, altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return (this.base * this.altura) / 2;
    }

    public double getBase() {
        return base;
    }
    public void mostrarDatos(){
        System.out.println("El triángulo con base "+base+" y altura "+altura+" tiene un area de "+area());
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
