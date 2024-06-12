package model;

public class Socio extends Persona {
    private int numeroSocio;
    private int contadorSocio=0;

    public Socio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public Socio(String nombre, String apellido, String dni, int numeroSocio) {
        super(nombre, apellido, dni);
        this.numeroSocio = contadorSocio++;
    }

    public Socio() {
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }
}
