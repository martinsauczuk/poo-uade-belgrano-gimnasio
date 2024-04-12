package actividades;

import categorias.Categoria;
import membresia.Socio;

public class Actividad {

    private String nombre;

    private String horario;

    private int cantidadActual;

    private int cantidadMaxima;


    private Categoria categoria;

    public Actividad(String nombre, String horario, Categoria categoria) {
        this.nombre = nombre;
        this.horario = horario;
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public boolean puedeSerRealizadaPor(Socio todoLoQueHeredaDeSocio) {
        // Aca debe ir la logica para ir contando las personas que ingresan en la actividad
        // y validar que no supere el maximo
        return this.categoria.validarSocio(todoLoQueHeredaDeSocio) &&
                cantidadActual <= cantidadMaxima;
    }

    @Override
    public String toString() {
        return "Soy una actividad " + nombre;
    }
}
