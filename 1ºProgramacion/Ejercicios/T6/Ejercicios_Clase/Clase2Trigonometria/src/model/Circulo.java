package model;
/*Desarrollar una clase Círculo

- Tenga un constructor vacío y un constructor con radio
- Tenga tres atributo de tipo double radio, diámetro y área
- Tenga un método donde se calcule el área (A=Pi*r2)
- Tenga un método donde se calcule el diámetro (D = 2*r)*/
public class Circulo {

    private double radio, diametro, area;

    public Circulo() {
    }

    public Circulo(double radio, double diametro, double area) {
        this.radio = radio;
        this.diametro = diametro;
        this.area = area;
    }
public void mostrarDatos(double radio){
    System.out.println("El radio del circulo es: "+radio);
    calcularDiametro(radio);

    calcularArea(radio);

}
    public Circulo(double radio) {
        this.radio = radio;
    }

    public void calcularArea(double radio){
    area=Math.PI*Math.pow(radio,2);
        System.out.println("El área del círculo es: "+area);
    }
    public void calcularDiametro(double radio){
        diametro=2*radio;
        System.out.println("El diámetro del círculo es: "+diametro);

    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
