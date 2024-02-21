package model;

public class Cuadrado {
    private int base, altura;
    private double area, perimetro;

    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Cuadrado (){

    }
    public double calculaArea(int base, int altura){
        double area= base*altura;
        return area;
    }
    public double calculaPerimetro(int base, int altura) {
        perimetro = 2 * (base + altura);
        return perimetro;
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

    public void mostrarDatos(){
        System.out.println("El cuadrado con una base de "+base+" y una altura de "+altura+" tiene un area de "+area+" y un perímetro de "+perimetro);
    }


}
