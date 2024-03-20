package model;

import java.util.ArrayList;

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
public class Video extends Elemento{
    private Persona director;
    private ArrayList<Persona> actores;

    public Video() {
    }

    public Video(Persona director) {
        this.director = director;
    }

    public Video(int identificador, int tamanio, String titulo, String autor, String formato, Persona director, ArrayList<Persona> actores) {
        super(identificador, tamanio, titulo, autor, formato);
        this.director = director;
        this.actores=new ArrayList<>();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        director.mostrarDatos();
        for (Persona item:actores){
            item.mostrarDatos();
        }
    }

    public Persona getDirector() {
        return director;
    }

    public void setDirector(Persona director) {
        this.director = director;
    }

    public ArrayList<Persona> getActores() {
        return actores;
    }

    public void setActores(ArrayList<Persona> actores) {
        this.actores = actores;
    }
}
