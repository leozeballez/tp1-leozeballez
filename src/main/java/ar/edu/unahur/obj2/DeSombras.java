package ar.edu.unahur.obj2;


public class DeSombras extends Demonio{


    public DeSombras(int nivelDeMaldad) {
        super(nivelDeMaldad);
    }

    @Override
    public boolean condicionPropia(Alma alma) {
        return alma.getValor() < 50;
    }

    @Override
    public void funcionSegunTipoDemonio(Alma alma) {
        alma.setValor(alma.getValor() / 2);
    }
}