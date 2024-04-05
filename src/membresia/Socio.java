package membresia;

import actividades.Actividad;

public abstract class Socio {

    protected boolean habilitado;

    public Socio(String qr) {
        this.qr = qr;
        this.habilitado = true;
    }

    public String getQr() {
        return qr;
    }

    protected String qr;

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public abstract boolean puedeAcceder(Actividad actividad);


}
