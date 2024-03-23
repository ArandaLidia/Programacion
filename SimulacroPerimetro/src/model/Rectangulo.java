package model;

public class Rectangulo extends Figura2D{
    private int base, altura;

    public Rectangulo() {
    }

    @Override
    public double calcularPerimetro() {
        return 2*(base+altura);
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(String nombre, int base, int altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
}
