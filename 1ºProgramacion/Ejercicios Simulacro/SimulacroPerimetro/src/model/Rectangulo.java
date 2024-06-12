package model;

import java.util.Objects;

public class Rectangulo extends Figura2D{

    private double base, altura;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
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

    @Override
    public double calcularPerimetro() {
        double perimetro= base*altura;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangulo that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(base, that.base) == 0 && Double.compare(altura, that.altura) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), base, altura);
    }
}
