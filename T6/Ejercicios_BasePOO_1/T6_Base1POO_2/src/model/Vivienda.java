package model;
/*2. ¿Cuáles serían los atributos de la clase Vivienda? ¿Qué subclases se te ocurren?

Solución:

Atributos de Vivienda: metrosCuadrados, numeroDeHabitaciones, tieneGaraje, orientacion

Subclases de Vivienda: Piso, Dúplex, Adosado, Casa*/

public class Vivienda {
    private int metrosCuadrados, numeroDeHabitaciones;
    private boolean tieneGaraje;
    private char orientacion;

    public class Piso extends Vivienda{

    }
    public class Duplex extends Vivienda{

    }
    public class Adosado extends Vivienda{

    }
    public class Casa extends Vivienda{

    }



}
