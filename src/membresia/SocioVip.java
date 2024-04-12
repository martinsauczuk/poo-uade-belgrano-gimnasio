package membresia;

import actividades.Actividad;

public class SocioVip extends Socio {


    public SocioVip(String qr) {
        super(qr);
    }

    @Override
    public boolean puedeAcceder(Actividad actividad) {
        // implementar logica propia para el socio VIP
        return false;
    }
}
