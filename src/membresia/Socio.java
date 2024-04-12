package membresia;

import actividades.Actividad;

/**
 * Esta es una clase abstracta, por lo tanto "obliga" a sus hijos a implementar los metodos que contengan
 * el modificador abstract, la clase abstracta
 *
 * */
public abstract class Socio {

    protected boolean habilitado;

    private boolean revisionOk = false;

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

    public void setRevisionOk(boolean revisionOk) {
        this.revisionOk = revisionOk;
    }

    public boolean revisionMedicaOk(){
        return revisionOk;
    }

    public abstract boolean puedeAcceder(Actividad actividad);


}
