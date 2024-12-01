package programacion_limpia.controlador;

import programacion_limpia.modelo.Temporada;
import repositorios.RepositorioGenerico;
import programacion_limpia.vista.TemporadaView;

public class TemporadaController {
    private RepositorioGenerico<Temporada> repositorio = new RepositorioGenerico<>();

    // Método para agregar un documental
    public void agregarTemporada(int numero, int episodios) {
        // Crear el documental con los datos proporcionados
        Temporada temporada = crearTemporada(numero, episodios);
        repositorio.agregar(temporada);
        mostrarDetallesTemporadas(temporada);
    }

    // Método para crear un Documental
    private Temporada crearTemporada(int numero, int episodios) {
        return new Temporada(numero, episodios);
    }

    // Método para mostrar los detalles del documental
    private void mostrarDetallesTemporadas(Temporada temporada) {
        TemporadaView temporadaView = new TemporadaView(temporada);
        temporadaView.mostrarDetalles();
    }
}