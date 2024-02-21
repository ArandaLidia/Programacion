/* Piensa en la liga de baloncesto, ¿qué 5 clases se te ocurren para representar 5 elementos distintos que intervengan en la liga?



Jugador, Partido, Estadio, Equipo, Arbitro*/

import model.Caballo;

public class Entrada {
    public static void main(String[] args) {
        Caballo a = new Caballo("Avra", "marrón moteado", 6, 24);
        Caballo l = new Caballo("Lykos", "negro", 8, 61);
        System.out.println("Hola, me llamo " + a.getNombre());
        a.cabalga();
        a.relincha();
        System.out.println("Hola, yo soy " + l.getNombre());
        l.rumia();
        l.cabalga();

    }
}