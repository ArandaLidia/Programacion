package controller;

import model.Ingredientes;

import java.util.ArrayList;

public class Pizza {
    private String nombrePizza;
    private double precioPizza;
    ArrayList<Ingredientes>listaIngredientes;


    public void mostrarDatos(){
        System.out.println("El nombre de la pizza es: "+nombrePizza+" y su precio es: "+precioPizza+" €.");
        for (Ingredientes item : listaIngredientes) {
            item.mostrarDatos();
        }
    }
    public void agregarIngrediente(Ingredientes ingredientes){
        listaIngredientes.add(ingredientes);
    }

    public double calcularPrecio(){
        for (Ingredientes item : listaIngredientes) {
            precioPizza= (precioPizza+item.getPrecio());
        }
        return precioPizza;
    }
    public Pizza() {
        this.listaIngredientes =new ArrayList<>();
    }

    public Pizza(String nombrePizza, double precioPizza, ArrayList<Ingredientes> listaIngredientes) {
        this.nombrePizza = nombrePizza;
        this.precioPizza = precioPizza;
        this.listaIngredientes =new ArrayList<>();
    }

    public Pizza(String nombrePizza, double precioPizza) {
        this.nombrePizza = nombrePizza;
        this.precioPizza = precioPizza;
        this.listaIngredientes =new ArrayList<>();
    }

    public String getNombrePizza() {
        return nombrePizza;
    }

    public void setNombrePizza(String nombrePizza) {
        this.nombrePizza = nombrePizza;
    }

    public double getPrecioPizza() {
        return precioPizza;
    }

    public void setPrecioPizza(double precioPizza) {
        this.precioPizza = precioPizza;
    }

    public ArrayList<Ingredientes> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(ArrayList<Ingredientes> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }
}
