package ar.edu.unahur.obj2;

public class DeFuego extends Demonio {

    public DeFuego(int nivelDeMaldad) {
        super(nivelDeMaldad);
    }

    @Override
    protected boolean otraCondicion(Alma alma) {
        return !alma.esFriolenta();
    }

}