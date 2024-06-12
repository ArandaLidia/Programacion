package Controller;

import model.*;
import utils.Trama;

import java.util.ArrayList;

public class CatalogoTodosLibros {
    private ArrayList<Libro> listaLibros;

    public CatalogoTodosLibros() {
        listaLibros = new ArrayList<>();
        agregarTodosLosLibros();
    }
public void mostrarDatos(){
        for (Libro libro : listaLibros) {
            libro.mostrarDatos();

        }
}
    private void agregarTodosLosLibros() {
        // Agregar todos los libros disponibles al catálogo
        // Libros de comedia
        listaLibros.add(new Comedia("Maldito karma", "David Safier", "9788432228582", 320, "Simpático, rápido"));
        listaLibros.add(new Comedia("El antropólogo inocente", "Nigel Barley", "8433925180", 240, "Divertido"));
        listaLibros.add(new Comedia("Me vestiré de medianoche", "Terry Pratchett", "8490627290", 416, "Ficción"));
        listaLibros.add(new Comedia("El diario de Bridget Jones", "Helen Fielding", "9788497592604", 320, "Comedia romántica"));
        listaLibros.add(new Comedia("El leñador", "Mitchal Witkowski", "9788415539346", 440, "Humor"));

        // Agregar libros de ensayo
        listaLibros.add(new Ensayo("El ensayo sobre la ceguera", "José Saramago", "9788490628727", 352));
        listaLibros.add(new Ensayo("Ensayos escogidos", "Michel de Montaigne", "9788497940797", 448));
        listaLibros.add(new Ensayo("Breve historia del tiempo", "Stephen Hawking", "9788498924503", 256));
        listaLibros.add(new Ensayo("Ensayo sobre la lucidez", "José Saramago", "9788483465813", 416));
        listaLibros.add(new Ensayo("Ensayo sobre la ceguera", "José Saramago", "9788490628727", 352));

        // Agregar libros policiacos
        listaLibros.add(new Policiaca("El misterio de la cripta embrujada", "Eduardo Mendoza", "9788466317708", 208, "Detective, cómico, intrigante", Trama.MISTERIO));
        listaLibros.add(new Policiaca("La sombra del viento", "Carlos Ruiz Zafón", "9788408043644", 576, "Daniel Sempere, Julián Carax", Trama.INTRIGA));
        listaLibros.add(new Policiaca("La chica del tren", "Paula Hawkins", "9788408141173", 496, "Rachel Watson, Megan Hipwell", Trama.MISTERIO));
        listaLibros.add(new Policiaca("El guardián invisible", "Dolores Redondo", "9788423349857", 448, "Amaia Salazar, Javier Markina", Trama.INTRIGA));
        listaLibros.add(new Policiaca("El silencio de la ciudad blanca", "Eva García Sáenz de Urturi", "9788408003471", 544, "Unai López de Ayala, Estíbaliz Ruiz de Gauna", Trama.MISTERIO));

        // Agregar libros de terror
        listaLibros.add(new Terror("El resplandor", "Stephen King", "9788401354870", 512, "Alto"));
        listaLibros.add(new Terror("El exorcista", "William Peter Blatty", "9788497595353", 448, "Muy alto"));
        listaLibros.add(new Terror("Frankenstein o el moderno Prometeo", "Mary Shelley", "9788491051290", 256, "Moderado"));
        listaLibros.add(new Terror("Drácula", "Bram Stoker", "9788499895367", 624, "Alto"));
        listaLibros.add(new Terror("It", "Stephen King", "9788401342259", 1392, "Muy alto"));
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }
}
