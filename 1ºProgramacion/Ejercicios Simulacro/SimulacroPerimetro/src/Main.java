import model.Circulo;
import model.Figura2D;
import model.Rectangulo;
import model.Triangulo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Figura2D> listaFiguras = new ArrayList<>();
        Circulo circulo = new Circulo("circulo", 5);
        Rectangulo rectangulo = new Rectangulo("rectangulo", 2, 4);
        Triangulo triangulo = new Triangulo("triangulo", 2, 4, 6);

        listaFiguras.add(circulo);
        listaFiguras.add(rectangulo);
        listaFiguras.add(triangulo);

        for (Figura2D item : listaFiguras) {
            System.out.println("El perimetro de la figura " + item.getNombre() + " es: " + item.calcularPerimetro());
            System.out.println(item.toString());


        }


    }
}