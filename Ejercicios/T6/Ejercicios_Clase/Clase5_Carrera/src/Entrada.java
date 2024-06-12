import model.Coche;

public class Entrada {
    public static void main(String[] args) {

        Coche cocheA=new Coche();
        Coche cocheB=new Coche(150, "4354ABC","Tucson" );

        cocheA.mostrarDatos();
        cocheB.mostrarDatos();

        cocheA.setCaballos(200);
        cocheA.setMatricula("1234BBB");
        cocheA.setModelo("Panda");
        cocheA.setVelocidad((int) ((Math.random()*20)+11));
        cocheB.setVelocidad((int) ((Math.random()*20)+11));
        cocheA.mostrarDatos();
        cocheB.mostrarDatos();
        cocheA.acelerar(15);
        cocheB.acelerar(15);
        if(cocheA.getVelocidad()> cocheB.getVelocidad()){
            System.out.println("El ganador es el coche A: "+cocheA.getModelo()+" con matrícula: "+ cocheA.getMatricula());
        }else {
            System.out.println("El ganador es el coche B: "+cocheB.getModelo()+ " con matrícula: "+cocheB.getMatricula());
        }
    }
}