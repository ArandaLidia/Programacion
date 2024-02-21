package model;
/* ¿Cuáles serían los atributos de la clase PilotoDeFormula1? ¿Se te ocurren algunas instancias de esta clase?

Solución:

• Atributos de la clase PilotoDeFormula1: nombre, edad, campeonatosGanados, numeroDeCarrerasOficiales, mediaDePuntosPorTemporada

• Instancias de la clase PilotoDeFormula1: fernandoAlonso, felipeMassa, kimiRaik- konen*/


public class PilotoDeFormula1 {

    private  String nombre;
    private int edad, campeonatosGanados, numeroDeCarrerasOficioales;
    private double mediaDePuntosPorTemporada;

    public PilotoDeFormula1(String nombre, int edad, int campeonatosGanados, int numeroDeCarrerasOficioales, double mediaDePuntosPorTemporada) {
        this.nombre = nombre;
        this.edad = edad;
        this.campeonatosGanados = campeonatosGanados;
        this.numeroDeCarrerasOficioales = numeroDeCarrerasOficioales;
        this.mediaDePuntosPorTemporada = mediaDePuntosPorTemporada;
    }
public void mostrarDatos(){
    System.out.println("El piloto "+this.nombre+" tiene "+this.edad+" años, ha ganado "+this.getCampeonatosGanados()+" campeonatos, ha corrido "+this.numeroDeCarrerasOficioales+" carreras oficiales y tiene una media de puntos esta temporada de : "+this.mediaDePuntosPorTemporada);
}
    public PilotoDeFormula1() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCampeonatosGanados() {
        return campeonatosGanados;
    }

    public void setCampeonatosGanados(int campeonatosGanados) {
        this.campeonatosGanados = campeonatosGanados;
    }

    public int getNumeroDeCarrerasOficioales() {
        return numeroDeCarrerasOficioales;
    }

    public void setNumeroDeCarrerasOficioales(int numeroDeCarrerasOficioales) {
        this.numeroDeCarrerasOficioales = numeroDeCarrerasOficioales;
    }

    public double getMediaDePuntosPorTemporada() {
        return mediaDePuntosPorTemporada;
    }

    public void setMediaDePuntosPorTemporada(double mediaDePuntosPorTemporada) {
        this.mediaDePuntosPorTemporada = mediaDePuntosPorTemporada;
    }
}
