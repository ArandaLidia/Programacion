package model;

public class Caballo {
    // Atributos
    String nombre;
    String color;
    int edad;
    int carrerasGanadas;

    // Constructor por defecto
    public Caballo() {
        this.nombre = "";
        this.color = "";
        this.edad = 0;
        this.carrerasGanadas = 0;
    }

    public Caballo(String n, String c, int e, int cg) {
        this.nombre = n;
        this.color = c;
        this.edad = e;
        this.carrerasGanadas = cg;
    }


    public void cabalga() {
        System.out.println("Tocotoc tocotoc tocotoc");
    }

    public void relincha() {
        System.out.println("Hiiiiiiieeeeee");
    }

    public void rumia() {
        System.out.println("Ñam ñam ñam");
    }

    public java.lang.String getNombre() {
        return nombre;
    }
}


