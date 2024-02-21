package model;

public class Circulo {
    private double radio, diametro, area;

    public Circulo(double radio) {
        this.radio = radio;
    }
    public Circulo(){

    }
    public double area(double radio) {
        return area= Math.PI * Math.pow(radio, 2);
    }
    public double calculaDiametro(double radio){
        return diametro=2*radio;
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
    public void mostrarDatos(){
        System.out.println("El circulo con radio de "+radio+", tiene un area de "+area(radio)+" y un diámetro de "+diametro);
    }
}
