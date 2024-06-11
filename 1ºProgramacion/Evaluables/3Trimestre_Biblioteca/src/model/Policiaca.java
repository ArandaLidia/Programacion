package model;

import utils.Trama;

public class Policiaca extends Libro{
    private String[] Personajes;
    Trama trama;

    public Policiaca(String[] personajes, Trama trama) {
        Personajes = personajes;
        this.trama = trama;
    }

    public Policiaca(String titulo, String autor, String isbn, int numPaginas, String tipoHumor, String[] personajes, Trama trama) {
        super(titulo, autor, isbn, numPaginas, tipoHumor);
        Personajes = personajes;
        this.trama = trama;
    }

    public void setPersonajes(String[] personajes) {
        Personajes = personajes;
    }

    public Policiaca(String titulo, String autor, String isbn, int numPaginas, String[] personajes, Trama trama) {
        super(titulo, autor, isbn, numPaginas);
        Personajes = personajes;
        this.trama = trama;
    }

    public Policiaca(String personajes) {
        Personajes = new String[]{personajes};
    }

    public Policiaca(String personajes, Trama trama) {
        Personajes = new String[]{personajes};
        this.trama = trama;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("La trama es: "+trama);
        System.out.println("Los personajes son ");
        for (String item : Personajes) {
            System.out.println(item+" , ");
        }
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────");
    }

    public Policiaca(String titulo, String autor, String isbn, int numPaginas, String personajes, Trama trama) {
        super(titulo, autor, isbn, numPaginas);
        Personajes = new String[]{personajes};
        this.trama = trama;
    }

    public String[] getPersonajes() {
        return Personajes;
    }

    public void setPersonajes(String personajes) {
        Personajes = new String[]{personajes};
    }

    public Trama getTrama() {
        return trama;
    }

    public void setTrama(Trama trama) {
        this.trama = trama;
    }
}
