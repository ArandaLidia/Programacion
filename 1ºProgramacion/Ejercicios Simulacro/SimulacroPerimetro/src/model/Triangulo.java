package model;

public class Triangulo extends Figura2D{
    private int ladoa, ladob, ladoc;

    public Triangulo() {
    }

    public Triangulo(int ladoa, int ladob, int ladoc) {
        this.ladoa = ladoa;
        this.ladob = ladob;
        this.ladoc = ladoc;
    }

    public Triangulo(String nombre, int ladoa, int ladob, int ladoc) {
        super(nombre);
        this.ladoa = ladoa;
        this.ladob = ladob;
        this.ladoc = ladoc;
    }

    @Override
    public double calcularPerimetro() {
        return ladoa+ladob+ladoc;
    }
}
