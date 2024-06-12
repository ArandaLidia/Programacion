/*Desarrollar una clase llamada Aplicacion que en su método main:

- Cree un garaje.
- Cree 2 coches.
- El garaje irá cogiendo los coches y devolviéndolos, acumulando un importe aleatorio (Math.random()) de la avería tratada.
- Si la avería del coche es “aceite” incrementar en 10 los litros de aceite.
- Los coches entrarán al menos 2 veces en el garaje.
- Mostrar la información de los coches al final del main.*/

import model.Coche;
import model.Garaje;
import model.Motor;

public class Aplicacion {


    public static void main(String[] args) {
        Coche coche1 = new Coche(new Motor(150),"Marca1","Modelo1");
        Coche coche2 = new Coche(new Motor(150),"Marca2","Modelo2");
        Garaje garaje = new Garaje();
        garaje.aceptarCoche(coche1,"aceite");
        garaje.devolverCoche();
        garaje.aceptarCoche(coche2,"motor");
        garaje.devolverCoche();
        garaje.aceptarCoche(coche1,"aceite");
        garaje.devolverCoche();
        garaje.aceptarCoche(coche2,"aceite");
        coche1.m();
        coche2.mostrarDatos();
    }
}