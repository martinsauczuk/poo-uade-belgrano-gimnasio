package categorias;

import membresia.Socio;

public class Categoria {
    private String nombre;

    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    /**
     * El comportamiento por defaulta para una categoria es dejar pasar a cualquier socio,
     * si alguna clase que hereda, quiere hacer una validacion custom puede hacerla haciendo
     * un override de este metodo.
     */
    public boolean validarSocio(Socio unSocio) {
        return true;
    }
}
