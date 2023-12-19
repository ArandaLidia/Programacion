package Retos2022;

public class Reto05___RatioImagen {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (Primo(i)) System.out.println(i);
        }
    }

    public static boolean Primo(int numero) {
        if (numero == 2 || numero == 3 || numero == 5 || numero == 7) return true;
        if (numero == 1 || numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0 || numero % 7 == 0) return false;
        return true;
    }

 /*Otra manera de hacerlo sería:
  public static boolean Primo (int numero){
   if (numero<=1){
   return false;}
   for (int i=2; i<numero; i++){
   if (numero%i==0){
   return false;}
   }
   return true;
   }*/

}

