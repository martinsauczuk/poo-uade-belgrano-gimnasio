package membresia;

import actividades.Actividad;

public class SocioFull extends Socio {


    public SocioFull(String qr) {
        super(qr);
    }

    @Override
    public boolean puedeAcceder(Actividad actividad) {
        return isHabilitado() && actividad.puedeSerRealizadaPor(this);
    }
}
