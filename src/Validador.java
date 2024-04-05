import actividades.Actividad;
import membresia.Socio;

public class Validador {

    public boolean validarActividadQr(Socio membresia, Actividad actividad) {
        System.out.println("Validando actividad:" + actividad);

        // Validar QR
        System.out.println( membresia.getQr() );

        if( membresia.puedeAcceder(actividad) ) {
            System.out.println("Actividad ok");
            return true;
        } else {
            System.out.println("Actividad no permitida");
            return false;
        }
    }


}
