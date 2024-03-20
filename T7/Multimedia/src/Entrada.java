import Controller.Coleccion;

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
public class Entrada {
    public static void main(String[] args) {

        Coleccion coleccion=new Coleccion();
        Scanner scanner=new Scanner(System.in);
        int opcion=0;
        do{
            System.out.println("¿Qué operación quieres realizar?");
            System.out.println("1 - Añadir a la colección");
            System.out.println("2 - Eliminar de la colección");
            System.out.println("3 - Listar elementos");
            System.out.println("4 - Buscar por autor");
            System.out.println("5 - Buscar por actor");
            System.out.println("6 - Buscar por director");
            System.out.println("7 - Salir");
            opcion= scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("¿Qué tipo de elemento quieres añadir? Audio, video o libro.");
                    boolean error=true;
                    coleccion.agregarColeccion(scanner.nextInt());

                case    2:
                    System.out.println("Introduce el identificador del elemento que quieres eliminar:");

                    break;
                case 3:
                    System.out.println("¿Que elementos quieres listar? 1- Audio 2 - Video 3 - Libro");
                    break;
                case 4:
                    System.out.println("Introduce un autor:");
                    break;
                case    5:
                    System.out.println("Introduce un actor: ");
                    break;
                case 6:
                    System.out.println("Introduce un director: ");
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no contemplada.");

            }
        }while(opcion!=7);
        }




    }
