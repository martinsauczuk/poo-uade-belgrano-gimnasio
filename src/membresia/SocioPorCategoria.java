package membresia;

import actividades.Actividad;
import actividades.Categoria;

public class SocioPorCategoria extends Socio {

    private Categoria categoriaPermitida;

    public SocioPorCategoria(Categoria categoriaPermitida) {
        this.categoriaPermitida = categoriaPermitida;
    }

    public boolean puedeAcceder(Actividad actividad) {
        return actividad.getCategoria() == categoriaPermitida;
    }
}
