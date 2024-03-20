package model;
/*Desarrollar una clase llamada Motor que:

- Tenga dos atributos private de tipo int (litros de aceite) y de tipo int (CV).
- Tenga un constructor con un parámetro de tipo int para los CV. Los litros de aceite por defecto serán 0.
- Tenga un getter para cada uno de los atributos.
- Tenga un setter para los litros.*/

public class Motor {

    private int cv;
    private int libtrosAceite;

    public Motor() {
    }
    public Motor(int cv)
    {
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }
    public void setCv(int cv) {
        this.cv = cv;
    }
    public int getLibtrosAceite() {
        return libtrosAceite;
    }
    public void setLibtrosAceite(int libtrosAceite) {
        this.libtrosAceite = libtrosAceite;
    }
}