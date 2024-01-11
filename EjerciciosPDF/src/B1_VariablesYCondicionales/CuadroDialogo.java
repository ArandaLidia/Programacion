package B1_VariablesYCondicionales;
import javax.swing.JOptionPane;

public class CuadroDialogo {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro número"));

        if (a == b) {
            JOptionPane.showMessageDialog(null, "Los números "+a+" y "+b+" son iguales");
        } else if (a > b) {
            JOptionPane.showMessageDialog(null, "El número "+ a + " es mayor que " + b);
        } else {
            JOptionPane.showMessageDialog(null, "El número "+b + " es mayor que " + a);
        }
    }
}