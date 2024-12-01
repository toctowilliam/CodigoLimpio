package programacion_limpia.controlador;

import programacion_limpia.modelo.Webinar;
import repositorios.RepositorioGenerico;
import programacion_limpia.vista.WebinarView;

public class WebinarController {

    private RepositorioGenerico<Webinar> repositorio = new RepositorioGenerico<>();

    // Método para agregar un webinar
    public void agregarWebinar(String titulo, int duracion, String genero,  String fecha, String ponente, String tematica) {
        // Crear el webinar con los datos proporcionados
        Webinar webinar = new Webinar(titulo, duracion, genero, fecha, ponente, tematica);
        // Agregar el webinar al repositorio
        repositorio.agregar(webinar);
        // Mostrar los detalles del webinar
        mostrarDetallesWebinar(webinar);
    }

    // Método para mostrar los detalles de un webinar
    private void mostrarDetallesWebinar(Webinar webinar) {
        WebinarView webinarView = new WebinarView(webinar);
        webinarView.mostrarDetalles();
    }
}