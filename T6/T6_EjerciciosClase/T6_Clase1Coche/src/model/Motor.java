package model;
/*Desarrollar una clase llamada Motor que:

- Tenga dos atributos private de tipo int (litros de aceite) y de tipo int (CV).
- Tenga un constructor con un parámetro de tipo int para los CV. Los litros de aceite por defecto serán 0.
- Tenga un getter para cada uno de los atributos.
- Tenga un setter para los litros.*/
public class Motor {
    private int litrosAceite, cV;

    public Motor(int cV) {
        this.cV = cV;
    }

    public int getLitrosAceite() {
        return litrosAceite;
    }

    public void setLitrosAceite(int litrosAceite) {
        this.litrosAceite = litrosAceite;
    }

    public int getcV() {
        return cV;
    }

}
