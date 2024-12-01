package programacion_limpia.controlador;

import programacion_limpia.modelo.Telenovela;
import repositorios.RepositorioGenerico;
import programacion_limpia.vista.TelenovelaView;

public class TelenovelaController {
        private RepositorioGenerico<Telenovela> repositorio = new RepositorioGenerico<>();

    // Método para agregar una telenovela
    public void agregarTelenovela(String titulo, int duracionEnMinutos, String genero, String paisOrigen, int numeroCapitulos) {
        // Crear la telenovela con los datos proporcionados
        Telenovela telenovela = new Telenovela(titulo, duracionEnMinutos, genero, paisOrigen, numeroCapitulos);
        repositorio.agregar(telenovela);
        mostrarDetallesTelenovela(telenovela);
    }

    // Método para mostrar los detalles de la telenovela
    private void mostrarDetallesTelenovela(Telenovela telenovela) {
        TelenovelaView telenovelaView = new TelenovelaView(telenovela);
        telenovelaView.mostrarDetalles();
    }

}
