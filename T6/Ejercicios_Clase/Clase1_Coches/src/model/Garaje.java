package model;
/*Desarrollar una clase llamada Garaje que:

- Tendrá tres atributos, un coche, un String con la avería asociada y el número de coches que ha ido atendiendo.
- El garaje solo podrá atender a un coche en cada momento. Controlar esta premisa.
- Tenga un método aceptarCoche que recibe un parámetro de tipo Coche y la avería asociada. El garaje solo podrá atender a un coche en cada momento. Si ya está atendiendo uno, que devuelva un false.
- Tenga un método devolverCoche que dejara al garaje en estado de aceptar un nuevo coche.*/

public class Garaje {

    private int numeroCoches;
    private String averia;
    private double caja;
    private Coche cocheTratado;
    private double precioReparacion;

    public Garaje() {
    }

    public boolean aceptarCoche(Coche coche, String averia){

        if (cocheTratado==null){
            cocheTratado = coche;
            if (averia.equalsIgnoreCase("aceite")){
                cocheTratado.getMotor().setLibtrosAceite(
                        cocheTratado.getMotor().getLibtrosAceite()+10);

            }
            precioReparacion = Math.random()*300;
            cocheTratado.acumularAveria(precioReparacion);
            numeroCoches++;
            return true;
        }

        return false;
    }

    public void devolverCoche(){
        // cobrar averia
        caja+=precioReparacion;
        // vaciar el sitio del garaje
        this.cocheTratado = null;
    }

    public int getNumeroCoche() {
        return numeroCoches;
    }

    public void setNumeroCoche(int numeroCoche) {
        this.numeroCoches = numeroCoche;
    }

    public String getAveria() {
        return averia;
    }

    public void setAveria(String averia) {
        this.averia = averia;
    }

    public double getCaja() {
        return caja;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }

    public Coche getCocheTratado() {
        return cocheTratado;
    }

    public void setCocheTratado(Coche cocheTratado) {
        this.cocheTratado = cocheTratado;
    }
}