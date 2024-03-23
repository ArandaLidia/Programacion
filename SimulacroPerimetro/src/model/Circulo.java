package model;

public class Circulo extends Figura2D {
    private int radio;

    public Circulo() {
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    public Circulo(String nombre, int radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2+Math.PI*radio;
    }
}