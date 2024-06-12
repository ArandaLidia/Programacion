package model;

public class Coche {

    private String marca, modelo, matricula;
    private int cv, cc, velocidad, kmRecorridos;

    public Coche() {
    }
    public Coche(String marca, String modelo, String matricula, int cv, int cc) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        this.cc = cc;

    }
    public void mostrarDatos() {
        System.out.printf(" 🏎️ El coche %s %s, con matrícula %s, tiene %d cv y %d cc.", marca, modelo, matricula, cv, cc);
    }
    public void acelerar(int velocidadIndicada, int cv) {

        if (cv <= 100) {
            this.velocidad += (int) ((Math.random() * velocidadIndicada));
            if (velocidad < 10) {
                velocidad = 10;
            }
            kmRecorridos += (int) (velocidad * 0.5);
        } else {
            velocidad += (int) ((Math.random() * velocidadIndicada) + 10);
            kmRecorridos += (int) (velocidad * 0.5);
        }
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getCv() {
        return cv;
    }
    public void setCv(int cv) {
        this.cv = cv;
    }
    public int getCc() {
        return cc;
    }
    public void setCc(int cc) {
        this.cc = cc;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public int getKmRecorridos() {
        return kmRecorridos;
    }
    public void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }
}
