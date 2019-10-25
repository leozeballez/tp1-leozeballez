package ar.edu.unahur.obj2;


public class DeHielo extends Demonio {

    public DeHielo(int nivelDeMaldad) {
        super(nivelDeMaldad);
    }

    @Override
    public boolean condicionPropia(Alma alma) {
        return alma.esFriolenta();
    }

    @Override
    public void funcionSegunTipoDemonio(Alma alma) {
        alma.setEsFriolenta(true);
    }
}