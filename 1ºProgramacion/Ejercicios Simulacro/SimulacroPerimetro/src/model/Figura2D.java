package model;

import utils.FiguraGeometrica;

import java.util.Objects;

public abstract class Figura2D implements FiguraGeometrica {

    private String nombre;

    @Override
    public String toString() {
        return "Figura2D{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Figura2D figura2D)) return false;
        return Objects.equals(nombre, figura2D.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public Figura2D(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public abstract double calcularPerimetro();
}
