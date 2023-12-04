package PROFESOR;

public class Circuferencia
{
    public static void main(String[] args) {
        Double radio = 3.0;
        Double perímetro = (2*Math.PI)*radio;
        Double area = (2*Math.PI*radio*radio);
        System.out.println("El perímetro de la circuferencia es "+perímetro);
        System.out.println("El área de la circuferencia es " + area);
    }
}

