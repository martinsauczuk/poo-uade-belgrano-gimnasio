package membresia;

import actividades.Actividad;

public class MembresiaPorHorario extends Socio{
    public MembresiaPorHorario(String qr) {
        super(qr);
    }

    @Override
    public boolean puedeAcceder(Actividad actividad) {
        return false;
    }
}
