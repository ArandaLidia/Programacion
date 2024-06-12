import model.Alumno;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       File file =new File("src/resources/alumnos.txt");
       FileReader fileReader=null;
       BufferedReader bufferedReader=null;
        int notaMax=0;
        String nombreMax="";
        try {
            bufferedReader=new BufferedReader(new FileReader(file));
            String linea;
            while ((linea=bufferedReader.readLine())!=null){
                linea=linea.replaceAll(" ","");
                if(Integer.parseInt(linea.split(",")[3])>notaMax){
                    notaMax=Integer.parseInt(linea.split(",")[3]);
                    nombreMax=linea.split(",")[0]+" "+linea.split(",")[1];
                }

            }
            System.out.println("El alumno con la nota más alta es: "+nombreMax+" nota: "+notaMax);
        } catch (FileNotFoundException e) {
            System.out.println("Error archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("error de io");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("error de io");
            }catch (NullPointerException e){
                System.out.println("error de io");
            }
        }

    }
}