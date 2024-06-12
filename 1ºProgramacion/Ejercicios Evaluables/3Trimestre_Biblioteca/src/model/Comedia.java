package model;

public class Comedia extends Libro {
    private String tipoHumor;

    public Comedia() {
    }

    public Comedia(String tipoHumor) {
        this.tipoHumor = tipoHumor;
    }

    public Comedia(String titulo, String autor, String isbn, int numPaginas, String tipoHumor) {
        super(titulo, autor, isbn, numPaginas);
        this.tipoHumor = tipoHumor;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("El tipo de humor es: "+tipoHumor);
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────");
    }

    public String getTipoHumor() {
        return tipoHumor;
    }

    public void setTipoHumor(String tipoHumor) {
        this.tipoHumor = tipoHumor;
    }
}
