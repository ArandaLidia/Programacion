package Controller;

import model.Libro;
import utils.catalogoLlenoException;
import utils.libroNoCatalogoException;
import utils.libroYaIncluidoException;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    private String nombre, director;
    private Catalogo catalogo;

    public Biblioteca() {
    }



    Scanner scanner = new Scanner(System.in);

    public void construirCatalogo(int numlibros) {
        System.out.println("¿Cuantos libros quieres guardar?");
        int cantLibros = scanner.nextInt();
        catalogo = new Catalogo(cantLibros);
    }
    public void construirCatalogo1(int numlibros) {
        catalogo = new Catalogo(numlibros);
    }

    public void construirCatalogo() {
        System.out.println("¿Cuantos libros quieres guardar?");
        int cantLibros = scanner.nextInt();
        catalogo = new Catalogo(cantLibros);
    }


    public void agregarLibro(Libro libro) throws catalogoLlenoException, libroYaIncluidoException {
        catalogo.agregarLibro(libro);
    }

    public void eliminarLibro() {
        catalogo.eliminarLibro(scanner.next());
    }

    public void buscarLibro(String isbn) {
        for (Libro item : catalogo.listaLibros) {
       mostrarInformacion();
        }

    }

    public void buscarLibro1(String isbn) {
        for (Libro item : catalogo.listaLibros) {
            mostrarInformacion1(isbn);
            break;
        }

    }
public void capacidadCatalogo(){
    System.out.println("La capacidad del catálogo es: "+catalogo.capacidad);
}
    public void mostrarInformacion() {
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────");

        System.out.println("Mostrando datos: ");
        for (Libro item : catalogo.listaLibros) {

            item.mostrarDatos();
        }
    }

    public void mostrarInformacion1(String isbn) {
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("Mostrando datos para el ISBN "+isbn);
        boolean encotnrado=false;

        for (Libro item : catalogo.listaLibros) {
            if (item.getIsbn().equalsIgnoreCase(isbn)){
                item.mostrarDatos();
                encotnrado=true;
                break;
            }

        }
        if (!encotnrado){
            System.out.println("No se encontró ningún libro con ese ISBN");
        }
    }

    public Biblioteca(String nombre, String director, Catalogo catalogo) {
        this.nombre = nombre;
        this.director = director;
        this.catalogo = catalogo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }


    public class Catalogo {
        public ArrayList<Libro> listaLibros;
        private int capacidad;

        public Catalogo(int capacidad) {
            listaLibros = new ArrayList<>(capacidad);
            this.capacidad = capacidad;
        }

        public ArrayList<Libro> getListaLibros() {
            return listaLibros;
        }

        public void setListaLibros(ArrayList<Libro> listaLibros) {
            this.listaLibros = listaLibros;
        }

        public int getCapacidad() {
            return capacidad;
        }

        public void setCapacidad(int capacidad) {
            this.capacidad = capacidad;
        }

        public void eliminarLibro(String isbn) {
            boolean encontrado = false;
            for (Libro item : listaLibros) {
                try {
                    if (item.getIsbn().equalsIgnoreCase(isbn)) {
                        listaLibros.remove(item);
                        System.out.println("El libro:" + item.getTitulo() + " eliminado correctamente");
                        encontrado = true;
                        break;
                    }
                } catch (NullPointerException e) {
                    System.out.println("Error: El ISBN del libro es nulo");
                }
            }
            if (!encontrado) {
                System.out.println("Error: El libro no está en el catálogo.");
            }
        }

        public void agregarLibro(Libro libro) throws libroYaIncluidoException, catalogoLlenoException {
            try {
                if (listaLibros.size() < capacidad) {
                    if (!listaLibros.contains(libro)) {
                        listaLibros.add(libro);
                        System.out.println("Libro añadido al catalogo: " + libro.getTitulo());
                        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────");
                    } else {
                        throw new libroYaIncluidoException("Libro ya incluido.");
                    }
                } else {
                    throw new catalogoLlenoException("El catálogo está lleno.");
                }
            } catch (libroYaIncluidoException e) {
                System.out.println("Error, libro ya incluido.");
            } catch (catalogoLlenoException e) {
                System.out.println("Error, el catálogo está lleno.");
            }
        }



    }

}
