package programacion_limpia.controlador;

import programacion_limpia.modelo.SerieDeTV;
import programacion_limpia.modelo.Temporada;
import repositorios.RepositorioGenerico;
import programacion_limpia.vista.SerieDeTvView;

import java.util.List;

public class SerieDeTvController {
    private RepositorioGenerico<SerieDeTV> repositorio = new RepositorioGenerico<>();

    // Método para agregar una serie de TV
    public void agregarSerieDeTv(String titulo, int duracion,String genero, int temporadas, List<Temporada> listaTemporadas) {
        // Crear la serie de TV con los datos proporcionados
        SerieDeTV serieDeTv = crearSerieDeTv(titulo, duracion, genero, temporadas, listaTemporadas);
        repositorio.agregar(serieDeTv);
        mostrarDetallesSerieDeTv(serieDeTv);
    }

    // Método para crear una SerieDeTv
    private SerieDeTV crearSerieDeTv(String titulo, int duracion, String genero, int temporadas, List<Temporada> listaTemporadas) {
        return new SerieDeTV(titulo, duracion, genero, temporadas, listaTemporadas);
    }

    // Método para mostrar los detalles de la serie de TV
    private void mostrarDetallesSerieDeTv(SerieDeTV serieDeTv) {
        SerieDeTvView serieDeTvView = new SerieDeTvView(serieDeTv);
        serieDeTvView.mostrarDetalles();
    }
}