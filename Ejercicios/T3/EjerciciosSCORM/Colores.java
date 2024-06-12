package Scorm;
//color en caracteres ANSI
public class Colores {
    public static void main(String[] args) {
        String ansiNegro="\033[30m";
        String ansiRojo="\033[31m";
        String ansiVerde="\033[32m";
        String ansiAmarillo="\033[33m";
        String ansiAzul="\033[34m";
        String ansiMagenta="\033[35m";
        String ansiCian="\033[36m";
        String ansiBlanco="\033[37m";
        String ansiReset="\u001B[0m";


        System.out.println(ansiNegro+"negro "+ansiRojo+" y rojo"+ansiVerde+" y verde"+ansiAmarillo+" y amarillo"+ansiAzul+" y azul"+ansiMagenta+" y magenta"+ansiCian+" y cian "+ansiBlanco+"y blanco "+ansiReset+" y Hola Mundo");
    }
}
