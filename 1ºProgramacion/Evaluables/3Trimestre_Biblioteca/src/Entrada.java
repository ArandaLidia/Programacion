import Controller.Biblioteca;
import Controller.CatalogoTodosLibros;
import Controller.ExportarLibros;
import model.*;
import utils.Trama;
import utils.catalogoLlenoException;
import utils.libroNoCatalogoException;
import utils.libroYaIncluidoException;

import javax.xml.catalog.Catalog;
import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) throws libroNoCatalogoException, catalogoLlenoException, libroYaIncluidoException {
        Scanner scanner=new Scanner(System.in);
        Comedia comedia1 = new Comedia("La ciudad y los perros", "Mario Vargas Llosa", "9788420472305", 640, "Satírico");
        Comedia comedia2 = new Comedia("Trópico de Cáncer", "Henry Miller", "9788435007174", 384, "Irreverente");
        Comedia comedia3 = new Comedia("El jilguero", "Donna Tartt", "9788408130405", 1056, "Absurdo");
        Comedia comedia4 = new Comedia("Vientos de cuaresma", "Leonardo Padura", "9788420426346", 416, "Cómico");
        Comedia comedia5 = new Comedia("La fiesta del chivo", "Mario Vargas Llosa", "9788439701397", 544, "Sátira política");

        Ensayo ensayo1 = new Ensayo("La muerte de la imaginación", "J.G. Ballard", "9788490661199", 224);
        Ensayo ensayo2 = new Ensayo("El ensayo sobre el hombre", "Alexander Pope", "9788477026185", 336);
        Ensayo ensayo3 = new Ensayo("Cómo leer y por qué", "Harold Bloom", "9788481094711", 380);
        Ensayo ensayo4 = new Ensayo("Ensayo sobre los jardines", "Denis Diderot", "9788430952693", 160);
        Ensayo ensayo5 = new Ensayo("Ensayo sobre la ceguera", "José Saramago", "9788490628727", 352);

        Policiaca policiaca1 = new Policiaca("El mal de Corcira", "Lorenzo Silva", "9788423342469", 256, new String[]{"Inspector García", "Detective Martínez"}, Trama.INTRIGA);
        Policiaca policiaca2 = new Policiaca("La habitación cerrada", "Care Santos", "9788408100156", 320, new String[]{"Investigador Rodríguez", "Agente Pérez"}, Trama.MISTERIO);
        Policiaca policiaca3 = new Policiaca("Un mal principio", "Lemony Snicket", "9788484411157", 196, new String[]{"Detective Gutierres", "Oficial López"}, Trama.INTRIGA);
        Policiaca policiaca4 = new Policiaca("La chica de ojos verdes", "Jonas Jonasson", "9788498384633", 360, new String[]{"Agente Sánchez", "Detective Fernández"}, Trama.MISTERIO);
        Policiaca policiaca5 = new Policiaca("El verano del comisario Ricciardi", "Maurizio de Giovanni", "9788415233193", 328, new String[]{"Oficial Ramírez", "Inspector González"}, Trama.INTRIGA);


        Terror terror1 = new Terror("El otro", "Thomas Tryon", "9788420661080", 512, "Sobrenatural");
        Terror terror2 = new Terror("El eco de los pasos", "Henning Mankell", "9788420420191", 528, "Psicológico");
        Terror terror3 = new Terror("La dama de negro", "Susan Hill", "9788483461617", 192, "Gótico");
        Terror terror4 = new Terror("El bazar de los malos sueños", "Stephen King", "9788401016715", 568, "Colección de relatos");
        Terror terror5 = new Terror("Necronomicón", "H.P. Lovecraft", "9788441413633", 224, "Misterioso");

        CatalogoTodosLibros catalogoTodosLibros=new CatalogoTodosLibros();
        Biblioteca biblioteca=new Biblioteca();
        biblioteca.construirCatalogo1(4);
        try {
            biblioteca.agregarLibro(comedia1);
            biblioteca.agregarLibro(ensayo2);
            biblioteca.agregarLibro(policiaca3);
            biblioteca.agregarLibro(policiaca3);
            biblioteca.agregarLibro(terror4);
            biblioteca.agregarLibro(comedia5);
        }catch (catalogoLlenoException e){
            System.out.println("Error, el catálogo está lleno.");
        }
        ExportarLibros.exportarLibros(biblioteca.getCatalogo().getListaLibros(), "libros.obj");
        biblioteca.mostrarInformacion();

        int opcion;
        do{
            System.out.println("¿Qué quieres realizar?");
            System.out.println("1- Buscar información de un libro ");
            System.out.println("2- Construir un catalogo ");
            System.out.println("3- Consultar capacidad del nuevo catálogo");
            System.out.println("4- Agregar libros al catálogo ");
            System.out.println("5- Sacar libro del catálogo ");
            System.out.println("6- Mostrar libros del catálogo");
            System.out.println("7- Mostrar todos los libros disponibles en el catálogo general.");
            System.out.println("8- Exportar libros del catálogo.");
            System.out.println("9- Salir...");
            opcion= scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1:
                    try {
                        System.out.println("Introduce el ISBN del libro que quieres buscar:");
                        String isbnBuscar= scanner.nextLine();
                        biblioteca.buscarLibro1(isbnBuscar);
                        break;
                    }catch (NullPointerException e){
                        System.out.println("Error el catalogo no ha sido construido");
                    }
                    break;
                case 2:
                    try {
                        biblioteca.construirCatalogo();
                    }catch (NullPointerException e){
                        System.out.println("Error, el catálogo no ha sido construido.");
                    }
                    break;
                case 3:
                    try{
                        biblioteca.capacidadCatalogo();
                    }catch (NullPointerException e){
                        System.out.println("Error, el catálogo no ha sido construido.");
                    }
                    break;
                case 4:
                    boolean categoriaValida=false;
                    do{
                        try {
                            System.out.println("¿De qué categoría es el libro?");
                            String categoria=scanner.nextLine();
                            if("comedia".equalsIgnoreCase(categoria)){
                                System.out.println("Introduce el título: ");
                                String titulo=scanner.nextLine();
                                System.out.println("Introduce el autor: ");
                                String autor=scanner.nextLine();
                                System.out.println("Introduce el isbn: ");
                                String isbn=scanner.nextLine();
                                System.out.println("Introduce el número de páginas del libro:");
                                int numPaginas= scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Introduce el tipo de humor:");
                                String tipoHumor=scanner.nextLine();
                                Libro nuevoLibro=new Comedia(titulo, autor, isbn, numPaginas, tipoHumor);
                                biblioteca.getCatalogo().agregarLibro(nuevoLibro);
                                categoriaValida=true;
                            } else if ("ensayo".equalsIgnoreCase(categoria)) {
                                System.out.println("Introduce el título: ");
                                String titulo=scanner.nextLine();
                                System.out.println("Introduce el autor: ");
                                String autor=scanner.nextLine();
                                System.out.println("Introduce el isbn: ");
                                String isbn=scanner.nextLine();
                                System.out.println("Introduce el número de páginas del libro:");
                                int numPaginas= scanner.nextInt();
                                scanner.nextLine();
                                Libro nuevoLibro=new Ensayo(titulo, autor, isbn,numPaginas );
                                biblioteca.getCatalogo().agregarLibro(nuevoLibro);
                                categoriaValida=true;
                            } else if ("policiaca".equalsIgnoreCase(categoria)) {
                                System.out.println("Introduce el título: ");
                                String titulo=scanner.nextLine();
                                System.out.println("Introduce el autor: ");
                                String autor=scanner.nextLine();
                                System.out.println("Introduce el isbn: ");
                                String isbn=scanner.nextLine();
                                System.out.println("Introduce el número de páginas del libro:");
                                int numPaginas= scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Introduce los personajes:");
                                String personajess=scanner.nextLine();
                                String[]personajes=personajess.split(",");
                                System.out.println("Introduce la trama:");
                                String tramaStr=scanner.nextLine().toUpperCase();
                                Trama trama=Trama.valueOf(tramaStr);
                                Libro nuevoLibro=new Policiaca(titulo, autor, isbn, numPaginas, personajes, trama);
                                biblioteca.getCatalogo().agregarLibro(nuevoLibro);
                                categoriaValida=true;
                            } else if ("terror".equalsIgnoreCase(categoria)) {
                                System.out.println("Introduce el título: ");
                                String titulo=scanner.nextLine();
                                System.out.println("Introduce el autor: ");
                                String autor=scanner.nextLine();
                                System.out.println("Introduce el isbn: ");
                                String isbn=scanner.nextLine();
                                System.out.println("Introduce el número de páginas del libro:");
                                int numPaginas= scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Introduce la calificación:");
                                String calificacion=scanner.nextLine();
                                Libro nuevoLibro=new Terror(titulo, autor, isbn, numPaginas, calificacion);
                                biblioteca.getCatalogo().agregarLibro(nuevoLibro);
                                categoriaValida=true;
                            }else{
                                System.out.println("Valor no contemplado, intentalo de nuevo:");
                            }
                        }catch (libroYaIncluidoException e){
                            System.out.println("Error libro ya incluido.");
                        }catch (catalogoLlenoException e){
                            System.out.println("Error, el catálogo está lleno.");
                        }catch(NullPointerException e){
                            System.out.println("Error, el catálogo no ha sido construido.");
                        }catch (Exception e){
                            System.out.println("Error desconocido.");
                        }
                    }while (!categoriaValida);
                    break;
                case 5:
                    try {
                        System.out.println("Introduce el isbn: ");
                        biblioteca.eliminarLibro();
                    }catch (NullPointerException e){
                        System.out.println("Error, el catálogo no ha sido construido.");
                    }
                    break;
                case 6:
                    System.out.println("Mostrando libros:");
                    biblioteca.mostrarInformacion();
                    break;
                case 7:
                    try {
                        System.out.println("Mostrando libros:");
                        catalogoTodosLibros.mostrarDatos();
                    }catch (NullPointerException e){
                        System.out.println("Error, el catálogo no ha sido construido.");
                    }
                    break;
                case 8:
                    System.out.println("Exportando libros al archivo 'LibrosCatalogoMenu.obj'");
                    ExportarLibros.exportarLibrosCatalogoMenu(biblioteca.getCatalogo().getListaLibros(), "librosCatalogoMenu.obj");
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no contemplada");
            }
        }while (opcion!=9);
        Biblioteca biblioteca1=new Biblioteca();
    }
}