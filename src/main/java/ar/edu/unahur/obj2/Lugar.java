package ar.edu.unahur.obj2;

import java.util.List;

public class Lugar {

    private String nombre;
    private List<Alma> almas;

    public Lugar(String nombre, List<Alma> almas) {
        this.nombre = nombre;
        this.almas = almas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Alma> getAlmas() {
        return almas;
    }

    public void setAlmas(List<Alma> almas) {
        this.almas = almas;
    }

    public void eliminarAlmas(List<Alma> almasAgarradas) {
        almas.forEach( alma -> almas.remove(alma));
    }
}
