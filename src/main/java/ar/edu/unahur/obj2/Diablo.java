package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Diablo {

    private List<Demonio> demonios;

    public Diablo() {
        this.demonios = new ArrayList<>();
    }

    public void setDemonios(List<Demonio> demonios) { this.demonios = demonios; }

    public List<Demonio> getDemonios() { return demonios;}

    //Cantidad demonios
    public int cantidadDemonios(){ return demonios.size();}


    public boolean puedeDemonioCazarAlma(Demonio demonio, Alma alma){
        return demonio.condicionesParaCazar(alma);
    }

    public void demonioAtormentaAlma(Demonio demonio, Alma alma){
        demonio.atormentarAlma(alma);
    }

    /*public Alma entrenarUnaAlma(Alma alma, TipoEntrenamiento entrenamiento){

        switch (entrenamiento){
            case LuchaDemoniaca: alma = new LuchaDemoniaca(alma); break;

            case SupervivenciaExtrema: alma = new SupervivenciaExtrema(alma); break;

            case CruzRoja: alma = new CruzRoja(alma); break;
        }

        return alma;
    }

    public List<Alma> almasCazadasPorMisDemonios(){
        return demonios.stream().flatMap(demonio ->
                demonio.getAlmasCazadas().stream())
                .collect(Collectors.toList());
    }

    public Alma almaMasValiente(){
        return almasCazadasPorMisDemonios().stream().max((alma1 ,alma2) -> alma1.getValor().compareTo(alma2.getValor())).get();
    }

    public Demonio demonioQueMasCazo(){
        return demonios.stream().max((demonio1, demonio2) -> demonio1.cantidadAlmasAtrapadas().compareTo(demonio2.cantidadAlmasAtrapadas())).get();
    }*/

}