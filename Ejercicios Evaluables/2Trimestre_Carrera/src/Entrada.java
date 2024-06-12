import model.Carrera;
import model.Coche;
public class Entrada {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Hyundai", "Tucson", "9876MFJ", 150, 1500);
        Coche coche2 = new Coche("Opel", "Corsa", "5432GCF", 90, 1600);
        Carrera carrera = new Carrera(coche1, coche2);
        carrera.iniciarCarrera();
    }
}