package ar.edu.unahur.obj2;

public class Alma {

    private int bondad;
    private int valor;
    private boolean esFriolenta;

    public Alma(int bondad, int valor, boolean esFriolenta) {
        this.bondad = bondad;
        this.valor = valor;
        this.esFriolenta = esFriolenta;
    }

    public int getBondad() {
        return bondad;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean esFriolenta() {
        return esFriolenta;
    }

    public void setEsFriolenta(boolean esFriolenta) {
        this.esFriolenta = esFriolenta;
    }

    public void esAtormentada() {
        this.bondad -= 5;
    }
}
