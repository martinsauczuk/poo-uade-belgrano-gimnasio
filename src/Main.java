import actividades.Actividad;
import actividades.Categoria;
import membresia.*;

public class Main {
    public static void main(String[] args) {

        // Categorias
        Categoria cardio = new Categoria("cardio");
        Categoria deportiva = new Categoria("deportiva");
        Categoria pileta = new Categoria("pileta");

        // Actividades
        Actividad natacion1 = new Actividad("natacion", "tarde", pileta);
        Actividad maquinas = new Actividad("maquinas", "noche", deportiva);
        Actividad crossfit = new Actividad("Crossfit", "noche", cardio );

        Validador validador = new Validador();

        // Membresia
        Socio fede = new SocioPrueba();
        validador.validarActividadQr(fede, crossfit);

        Socio azul = new SocioFull("3isfadeoih43");
        validador.validarActividadQr(azul, crossfit);

        System.out.println(azul.puedeAcceder(natacion1));
        System.out.println(azul.puedeAcceder(maquinas));
        System.out.println(azul.puedeAcceder(natacion1));
        azul.setHabilitado(false);
        System.out.println(azul.puedeAcceder(crossfit));


        SocioPorCantActividades agustin = new SocioPorCantActividades(5, "asdfasdf");
//        System.out.println(agustin.puedeAcceder(natacion1));
//        System.out.println(agustin.puedeAcceder(maquinas));
//        System.out.println(agustin.puedeAcceder(natacion1));
//        System.out.println(agustin.puedeAcceder(crossfit));
//        System.out.println(agustin.puedeAcceder(crossfit));
//        System.out.println(agustin.puedeAcceder(crossfit)); // false

        SocioPorCategoria jose = new SocioPorCategoria(cardio);
//        System.out.println(jose.puedeAcceder(crossfit)); // true
//        System.out.println(jose.puedeAcceder(maquinas)); // false
//        System.out.println(jose.puedeAcceder(maquinas)); // false
//        System.out.println(jose.puedeAcceder(natacion1)); // false

    }
}