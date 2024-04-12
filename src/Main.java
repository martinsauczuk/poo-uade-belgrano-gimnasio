import actividades.Actividad;
import categorias.Categoria;
import categorias.Pileta;
import membresia.*;

public class Main {
    public static void main(String[] args) {

        // Categorias
        Categoria cardio = new Categoria("cardio");
        Categoria deportiva = new Categoria("deportiva");
        Categoria pileta = new Pileta("pileta");

        // Actividades
        Actividad natacion1 = new Actividad("natacion", "tarde", pileta);
        Actividad maquinas = new Actividad("maquinas", "noche", deportiva);
        Actividad crossfit = new Actividad("Crossfit", "noche", cardio );


        SocioFull azul = new SocioFull("21sdfw34");
        boolean autorizacion = azul.puedeAcceder(maquinas);
        System.out.println(autorizacion);

        azul.setRevisionOk(true);
        boolean authPileta = azul.puedeAcceder(natacion1);
        System.out.println(authPileta);

    }
}