package actividades;

public class Actividad {

    private String nombre;

    private String horario;

    private Categoria categoria;

    public Actividad(String nombre, String horario, Categoria categoria) {
        this.nombre = nombre;
        this.horario = horario;
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Soy una actividad " + nombre;
    }
}
