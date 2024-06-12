package model;

import java.util.Objects;

public class Triangulo extends Figura2D{
    private double ladoA, ladoB, ladoC;

    public Triangulo(String nombre, double ladoA, double ladoB, double ladoC) {
        super(nombre);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro=ladoA+ladoB+ladoC;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "ladoA=" + ladoA +
                ", ladoB=" + ladoB +
                ", ladoC=" + ladoC +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangulo triangulo)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(ladoA, triangulo.ladoA) == 0 && Double.compare(ladoB, triangulo.ladoB) == 0 && Double.compare(ladoC, triangulo.ladoC) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ladoA, ladoB, ladoC);
    }
}
