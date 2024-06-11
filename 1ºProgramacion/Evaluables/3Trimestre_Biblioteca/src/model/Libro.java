package model;

import java.io.Serializable;
import java.util.Stack;

public class Libro implements Serializable {
    private static final long serialVersionUID= 654968765165654L;
    private String titulo, autor, isbn;
    private int numPaginas;

    public Libro() {
    }

    public Libro(String titulo, String autor, String isbn, int numPaginas, String tipoHumor) {
        this.titulo=titulo;
    }

    public void mostrarDatos(){
        System.out.println("El título es: "+getTitulo());
        System.out.println("El autor es: "+getAutor());
        System.out.println("El isbn es: "+getIsbn());
    }
    public Libro(String titulo, String autor, String isbn, int numPaginas) {
        this.titulo=titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numPaginas = numPaginas;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
}
