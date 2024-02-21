/* ¿Cuáles serían los atributos de la clase PilotoDeFormula1? ¿Se te ocurren algunas instancias de esta clase?

Solución:

• Atributos de la clase PilotoDeFormula1: nombre, edad, campeonatosGanados, numeroDeCarrerasOficiales, mediaDePuntosPorTemporada

• Instancias de la clase PilotoDeFormula1: fernandoAlonso, felipeMassa, kimiRaik- konen*/

import model.PilotoDeFormula1;

public class Entrada {
    public static void main(String[] args) {

        PilotoDeFormula1 pilotoDeFormula1=new PilotoDeFormula1();
        PilotoDeFormula1 fernandoAlonso= new PilotoDeFormula1();
        fernandoAlonso.setNombre("Fernando Alonso");
        fernandoAlonso.setEdad(39);
        fernandoAlonso.setCampeonatosGanados(2);
        fernandoAlonso.setNumeroDeCarrerasOficioales(323);
        fernandoAlonso.setMediaDePuntosPorTemporada(8.0);

        PilotoDeFormula1 felipeMassa=new PilotoDeFormula1("Felipe Massa", 36,  8,29,12.8);
        PilotoDeFormula1 kimiRaik_konen=new PilotoDeFormula1();

        fernandoAlonso.mostrarDatos();
        felipeMassa.mostrarDatos();
    }
}