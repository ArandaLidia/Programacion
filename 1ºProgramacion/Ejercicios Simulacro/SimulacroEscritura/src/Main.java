import model.Alumnos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        Alumnos alumnos = new Alumnos("hola", "que", "tal");

        File file = new File("src/resources/alumnos.txt");
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try {
            fileWriter = new FileWriter(file);
            printWriter = new PrintWriter(fileWriter);
            printWriter.println("Estoy escribiendo un archivo");
            printWriter.println("Estoy escribiendo un archivo muy grande");
        } catch (IOException e) {
            System.out.println("Error al crear el FileWriter o PrintWriter: " + e.getMessage());
        } finally {
            try {
                if (printWriter != null) {
                    printWriter.close();
                }

            } catch (Exception e) {
                System.out.println("Error al cerrar PrintWriter: " + e.getMessage());
            }


        }
    }
}