package membresia;

import actividades.Actividad;

public class SocioPrueba extends Socio {

    private boolean actividadDisponible;

    public SocioPrueba(String qr) {
        super(qr);
        actividadDisponible = true;
    }

    @Override
    public boolean puedeAcceder(Actividad actividad) {
        if (actividadDisponible) {
            actividadDisponible = false;
            return true;
        } else {
            return false;
        }
    }
}
