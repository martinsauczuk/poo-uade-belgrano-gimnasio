package membresia;

import actividades.Actividad;

/**
 * Este es un ejemplo de clase que extiende de una clase que no es abstract
 */
public class SocioRestringido extends SocioFull {

    private int maximo;

    public SocioRestringido(String qr, int max) {
        super(qr);
        this.maximo = max;
    }

    @Override
    public boolean puedeAcceder(Actividad actividad) {
        // Implementar logica para restringir al SocioRestringido
        return (maximo < 100);
    }
}
