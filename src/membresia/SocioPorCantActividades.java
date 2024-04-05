package membresia;

import actividades.Actividad;

public class SocioPorCantActividades extends Socio {

    private int cantDisponible;

    public SocioPorCantActividades(int cantDisponible, String qr) {
        super("asdf");
        this.cantDisponible = cantDisponible;
    }

    @Override
    public boolean puedeAcceder(Actividad actividad) {
        boolean auth = false;
        if (cantDisponible > 0) {
            auth = true;
            cantDisponible = cantDisponible - 1;
        }
        return auth;
    }
}
