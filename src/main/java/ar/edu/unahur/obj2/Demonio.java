package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public abstract class Demonio implements CondicionPropia, AtormentarAlma, FuncionSegunTipoDemonio {

    private List<Alma> almasCazadas;
    private int maldad;
    private int almasAtormentadas;

    public Demonio(int maldad) {
        almasCazadas = new ArrayList<>();
        this.maldad = maldad;
        this.almasAtormentadas = 0;
    }

    public void cazar(Lugar lugar){
        lugar.getAlmas().forEach(alma -> {


            if (condicionesParaCazar(alma)) {

                almasCazadas.add(alma);


            } else {

                atormentarAlma(alma);
                maldad++;
                almasAtormentadas++;

            }

        });
        maldad += lugar.getAlmasCazadas() *2 + almasAtormentadas;
        lugar.eliminarAlmas(almasCazadas);
    }

    public int getMaldad() {
        return maldad;
    }

    public List<Alma> getAlmasCazadas() { return almasCazadas; }

    public int numeroAlmasCazadas(){ return almasCazadas.size(); }

    public boolean condicionesParaCazar(Alma alma){
        return condicionGeneral(alma) && condicionPropia(alma);
    }

    public boolean condicionGeneral(Alma alma){
        return getMaldad() > alma.getBondad();
    }

    @Override
    public void atormentarAlma(Alma alma){
        alma.esAtormentada();
        funcionSegunTipoDemonio(alma);
    }
}