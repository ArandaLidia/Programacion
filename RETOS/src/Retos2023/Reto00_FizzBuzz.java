package Retos2023;
public class Reto00_FizzBuzz {
    public static void main(String[] args) {
        int multiplo3=0;
        int multiplo5=0;
        int multiplo5y3=0;
        for (int i = 0; i <=100 ; i++) {
            System.out.println();
            if((i%5==0) &&(i%3==0)){
                System.out.println("fizz buzz");

            }else if(i%5==0){
                System.out.println("buzz");

            }else if(i%3==0){
                System.out.println("fizz");
            }else{
                System.out.println(i);
            }
        }
    }
}
