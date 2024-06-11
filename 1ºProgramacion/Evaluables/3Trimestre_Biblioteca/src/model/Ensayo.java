package model;

public class Ensayo extends Libro {
    public Ensayo() {
    }

    public Ensayo(String titulo, String autor, String isbn, int numPaginas) {
        super(titulo, autor, isbn, numPaginas);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────");
    }
}
