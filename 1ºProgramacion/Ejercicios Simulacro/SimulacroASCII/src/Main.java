import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file    =new File("src/resources/ejercicio.txt");
        FileReader fileReader=null;


        try {
            int codigo=-1;
            while ((codigo= fileReader.read())!=-1){
                System.out.println(codigo);
                System.out.println((char)codigo);
            }
            fileReader=new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Error archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error io.");
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (NullPointerException e ){
                System.out.println("Error nulo.");
            }
        }
    }
}

//File file =new File("src/resources/ejercicio.txt");
//        FileReader fileReader=null;
//
//        try {
//            fileReader=new FileReader(file);
//            int codigo=-1;
//            while ((codigo= fileReader.read())!=-1){
//                System.out.println(codigo);
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("Error, archivo no encontrado");
//        } catch (IOException e) {
//            System.out.println("Error al leer el archivo.");
//        } finally {
//            try {
//                if (fileReader != null) {
//                    fileReader.close();
//                }
//            } catch (IOException e) {
//                System.out.println("Error al cerrar el archivo.");
//            }
//        }