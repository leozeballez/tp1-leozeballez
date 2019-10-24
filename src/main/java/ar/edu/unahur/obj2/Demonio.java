package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public abstract class Demonio {

    private List<Alma> almasCazadas;
    private int maldad;

    public Demonio(int maldad) {
        almasCazadas = new ArrayList<>();
        this.maldad = maldad;
    }

    public void salirDeCaza(Lugar lugar){
        List<Alma> almasAgarradas = new ArrayList<>();
        lugar.getAlmas().forEach(alma -> {

            if (condicionesParaCazar(alma)) {

                almasAgarradas.add(alma);
                maldad += 2;

            } else {

                atormentarAlma(alma);
                maldad++;

            }
        });

        cazarAlmas(almasAgarradas);
        lugar.eliminarAlmas(almasAgarradas);
    }

    protected abstract boolean otraCondicion(Alma alma);

    public int getMaldad() {
        return maldad;
    }

    public List<Alma> getAlmasCazadas() { return almasCazadas; }

    public int numeroAlmasCazadas(){ return almasCazadas.size(); }

    public boolean condicionesParaCazar(Alma alma){
        return condicionGeneral(alma) && otraCondicion(alma);
    }

    //Condicion para todos los demonios
    public boolean condicionGeneral(Alma alma){
        return getMaldad() > alma.getBondad();
    }

    //Atormentar almas
    public void atormentarAlma(Alma alma){
        alma.esAtormentada();
    }

    public void cazarAlmas(List<Alma> almas){
        almasCazadas.addAll(almas);
    }}