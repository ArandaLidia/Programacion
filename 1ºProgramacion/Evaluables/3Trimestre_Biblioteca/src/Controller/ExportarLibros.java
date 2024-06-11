package Controller;

import model.Libro;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ExportarLibros {
    public static void exportarLibros(ArrayList<Libro> listaLibros, String nombre){
        ObjectOutputStream objectOutputStream=null;
        FileOutputStream fileOutputStream=null;
        File file=new File("src/utils/libros.obj");

        try {
            objectOutputStream=new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(listaLibros);
            System.out.println("El catalogo se ha exportado correctamente.");
        } catch (IOException e) {
            System.out.println("Error de permisos.");
        }finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar.");
            }catch (NullPointerException e){
                System.out.println("Error de nulo.");
            }
        }
    }

    public static void exportarLibrosCatalogoMenu(ArrayList<Libro> listaLibros, String nombre){
        ObjectOutputStream objectOutputStream=null;
        FileOutputStream fileOutputStream=null;
        File file=new File("src/utils/LibrosCatalogoMenu.obj");

        try {
            objectOutputStream=new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(listaLibros);
            System.out.println("El catalogo se ha exportado correctamente.");
        } catch (IOException e) {
            System.out.println("Error de permisos.");
        }finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar.");
            }catch (NullPointerException e){
                System.out.println("Error de nulo.");
            }
        }
    }
}
