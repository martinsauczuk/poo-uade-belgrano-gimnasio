package categorias;

import categorias.Categoria;
import membresia.Socio;

public class Pileta extends Categoria {
    public Pileta(String nombre) {
        super(nombre);
    }

    @Override
    public boolean validarSocio(Socio unSocio) {
        return unSocio.revisionMedicaOk();
    }
}
