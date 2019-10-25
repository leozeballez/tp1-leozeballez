package ar.edu.unahur.obj2;

import java.util.List;

public class Lugar {

    private String nombre;
    private List<Alma> almas;
    private int almasCazadas;


    public Lugar(String nombre, List<Alma> almas) {
        this.nombre = nombre;
        this.almas = almas;
        this.almasCazadas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAlmasCazadas() {
        return almasCazadas;
    }

    public void setAlmasCazadas(int almasCazadas) {
        this.almasCazadas = almasCazadas;
    }

    public List<Alma> getAlmas() {
        return almas;
    }

    public void eliminarAlmas(List<Alma> almasAgarradas) {
        almas.forEach( alma -> {
            almas.remove(alma);
            almasCazadas++;
        });
    }
}
