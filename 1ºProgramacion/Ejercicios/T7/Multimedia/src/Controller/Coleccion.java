package Controller;

import model.Elemento;
import model.Video;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/*1. (ListaMultimedia)
Desarrollar una aplicación para la gestión de una colección multimedia. Todo elemento multimedia tiene 5 características; identificador, titulo, autor, tamaño, formato. Adicionalmente cada uno de los elementos tendrán:
a. Libro (ISBN, número de páginas)
b. Video (director, actores)
c. Audio (duración, soporte)
La aplicación deberá poder manejar cualquier tipo de objeto, dando la posibilidad de:
💡 El director será una persona con nombre y dni. Los actores serán un conjunto de objetos con nombre y dni
1. Añadir a la colección (preguntara que tipo de objeto y los elementos correspondientes)
a. Los datos serán pedidos por consola
b. Una vez añadido el programa mostrará una confirmación de que el elemento
está bien añadido
2. Eliminar de la colección
a. Se pedirá el identificador del elemento a eliminar
b. Una vez eliminado el programa mostrará una confirmación de que el elemento
está bien eliminado
3. Listar elementos
a. Video
b. Audio
c. Todos
4. Salir
Los listados mostrarán información completa de los elementos en cuestión.
La restricción que se pone a la colección es que no se pueden añadir elementos con el mismo id.
**(MODIFICACION)**
Dentro del menú, poner tres opciones nuevas:
1. Buscar por autor: introduciré el nombre de un autor y me dirá el título de todos los libros de tenga
2. Buscar por actor: se introducirá el nombre de un actor y se mostrará el título de todas las películas donde aparezca
3. Buscar por director: se introducirá el nombre de un director y s emostarán todas las películas que tenga*/
public class Coleccion {
    private ArrayList<Elemento>listaElementos;
    private int identificador;
    Scanner scanner=new Scanner(System.in);
    public void aniadirElementos(Elemento elemento){
        if(estaElemento(elemento.getId())==null){
            this.listaElementos.add(elemento);
            System.out.println("Agregado correctamente.");
        }else {
            System.out.println("Elemento duplicado.");
        }

    }
    public void ListarElementos(){
        for (Elemento item : listaElementos) {
            item.mostrarDatos();
        }
    }

    public Elemento estaElemento(int  id){
        for (Elemento item : listaElementos) {
            if(item.getId()==id){
                return item;
            }

        }
        return null;
    }
    public Coleccion() {
        this.listaElementos = new ArrayList<>();
    }

    public void buscarElemento(int id){
        for (Elemento item : listaElementos) {
            if(item.getIdentificador()==id){
                System.out.println("Elemento encontrado");
                item.mostrarDatos();
                break;
            }
        }
    }
    public void buscarElementoNombre(String nombre){
        for (Elemento item : listaElementos) {
            if(Objects.equals(item.getAutor().getNombre(), nombre)){
                System.out.println("Elemento encontrado");
                item.mostrarDatos();
                break;
            }
        }
    }
    public void elimimnarElemento(int id){
        for (Elemento item : listaElementos) {
            if(item.getIdentificador()==id){
                System.out.println("Elemento encontrado");
                listaElementos.remove(item);
                break;
            }
        }
    }
    public void elimimnarDirector(String nombre){
        for (Elemento item : listaElementos) {
            if(item instanceof Video){
                ((Video) item).getDirector().getNombre().equalsIgnoreCase(nombre);
                    item.mostrarDatos();
                    break;
                }
            }
        }
    }


