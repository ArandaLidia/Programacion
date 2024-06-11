package model;
/*Desarrollar una clase Cuadrado

- Tenga un constructor vacío y un constructor con base y altura
- Tenga dos atributos int base y altura
- Tenga dos atributos de tipo double área y perímetro
- Tenga un método que calcule su área (A=b*a)
- Tenga un método que calcule su perímetro (2*a+2*b)*/

public class Cuadrado {
    private int base, altura;
    private double area, perimetro;

    public Cuadrado() {
    }

    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public void calcularArea(int base, int altura){
        area=base*altura;
        System.out.println("El area del cuadrado es: "+area);
    }
    public void calcularPerimetro(int base, int altura){
        perimetro=(2*altura+2*base);
        System.out.println("El perímetro del cuadrado es: "+perimetro);
    }
    public void mostrarDatos(int base, int altura){
        System.out.println("La base del cuadrado es: "+base);
        System.out.println("El altura del cuadrado es: "+altura);
        calcularArea(base, altura);
        calcularPerimetro(base, altura);

    }
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
