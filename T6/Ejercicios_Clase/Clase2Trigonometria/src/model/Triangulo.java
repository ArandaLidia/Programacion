package model;
/*Desarrollar una clase Triangulo que:

- Tenga un constructor vacío y un constructor con base y altura
- Tenga dos atributos tipo int, base y altura
- Tenga un método que calcule su área (A=(b*al)/2)*/
public class Triangulo {
    private  int altura, base;
 private double area;
    public Triangulo() {
    }

    public Triangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }
    public void calcularArea(int base,int altura){
         area= (double) (base * altura) /2;
        System.out.println("El area del triangulo es: "+area);
    }
    public int getAltura() {
        return altura;
    }
    public void mostrarDatos(double base, double altura){
        System.out.println("La base del triangulo es: "+base);
        System.out.println("La altura del triangulo es: "+altura);
        calcularArea((int) base, (int) altura);
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
}
