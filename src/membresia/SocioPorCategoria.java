package membresia;

import actividades.Actividad;
import categorias.Categoria;

public class SocioPorCategoria extends Socio {

    private Categoria categoriaPermitida;

    public SocioPorCategoria(Categoria categoriaPermitida, String qr) {
        super(qr);
        this.categoriaPermitida = categoriaPermitida;
    }

    public boolean puedeAcceder(Actividad actividad) {
        return actividad.getCategoria() == categoriaPermitida;
    }
}
