package EXPLICACION;

public class variableDeClase {
    //una variable de clase, se declara fuera de los métodos.
    // dentro de public class nombredeclase { y se declara statica,
    // luego se puede llamar dentro de los métodos y cambiarle el valor.
    //Si llamas al metodo alternativo, dentro del metodo main, e imprimes la variable número, la variable ahora vale lo que valía en el metodoalternativo

    static int numero=1;
    public static void main(String[] args) {
       metodoAlternativo();
       System.out.println(numero);
    }
    public static void metodoAlternativo (){
     numero=4;

    }
}
