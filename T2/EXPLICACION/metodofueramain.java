package EXPLICACION;

public class metodofueramain {
//Para poder declarar un método fuera del método main, debe de ser estático (hasta la unidad5)
    // Se declara fuera del metodo main
    // metodoAdicional() {
    //y luego se llama dentro del metodo main.
    public static void metodoAdicional(){
        System.out.println("Este es un metodo adicional");
    }
    public static void main(String[] args) {
        metodoAdicional();
        System.out.println("Estoy llamando al método adicional");

    }
}
