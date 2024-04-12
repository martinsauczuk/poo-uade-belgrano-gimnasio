package categorias;

import categorias.Categoria;
import membresia.Socio;

public class AltoRendimiento extends Categoria {


    public AltoRendimiento(String nombre) {
        super(nombre);
    }

    @Override
    public boolean validarSocio(Socio unSocio) {
        /* En este punto la clase AltoRendimiento podria pedirle lo que necesita
         para validar al socio como por ejemplo el electrocardiograma, para esto tenemos
         que garantizar que todos los socios (y sus hijos) devuelvan si tienen (o no) su
         electrocardiograma al dia. Pero para hacer esto tenemos la clase abstracta Socio
         */
        return true;
    }
}
