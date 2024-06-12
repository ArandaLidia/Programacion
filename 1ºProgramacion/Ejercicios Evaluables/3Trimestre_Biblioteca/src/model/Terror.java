package model;

import model.Libro;

public class Terror extends Libro {
    private String calificacion;

    public Terror() {
    }

    public Terror(String calificacion) {
        this.calificacion = calificacion;
    }

    public Terror(String titulo, String autor, String isbn, int numPaginas, String calificacion) {
        super(titulo, autor, isbn, numPaginas);
        this.calificacion = calificacion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("La calificación es: "+calificacion);
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────");
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
}
