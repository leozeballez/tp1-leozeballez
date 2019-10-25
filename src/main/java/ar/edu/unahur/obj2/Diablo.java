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

    public int cantidadDemonios(){ return demonios.size();}

    public boolean demonioPuedeCazarAlma(Demonio demonio, Alma alma){
        return demonio.condicionesParaCazar(alma);
    }

    public void demonioAtormentaAlma(Demonio demonio, Alma alma){
        demonio.atormentarAlma(alma);
    }

    //Parte 2 a terminar
    public void entrenarUnaAlma(Alma alma, TipoEntrenamiento entrenamiento){
        
    }


    //Parte 3 a revisar
    public List<Alma> almasCazadasPorMisDemonios(){
        return demonios.stream().flatMap(demonio ->
                demonio.getAlmasCazadas().stream())
                .collect(Collectors.toList());
    }

    public Alma almaMasValiente(){
        return almasCazadasPorMisDemonios().stream().max((alma1 ,alma2) -> alma1.getValor().compareTo(alma2.getValor())).get();
    }

    public Demonio demonioQueMasCazo(){
        return demonios.stream().max((demonio1, demonio2) -> demonio1.numeroAlmasCazadas().compareTo(demonio2.numeroAlmasCazadas() ) ).get();
    }

}