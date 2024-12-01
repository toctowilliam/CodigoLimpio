package programacion_limpia.controlador;

import programacion_limpia.modelo.Documental;
import programacion_limpia.modelo.Investigador;
import repositorios.RepositorioGenerico;
import programacion_limpia.vista.DocumentalView;

import java.util.List;

public class DocumentalController {
    private RepositorioGenerico<Documental> repositorio = new RepositorioGenerico<>();

    // Método para agregar un documental
    public void agregarDocumental(String titulo, int duracion, String genero,  String tema, List<Investigador> investigadores) {
        // Crear el documental con los datos proporcionados
        Documental documental = crearDocumental(titulo, duracion, genero, tema, investigadores);
        repositorio.agregar(documental);
        mostrarDetallesDocumental(documental);
    }

    // Método para crear un Documental
    private Documental crearDocumental(String titulo, int duracion, String genero, String tema, List<Investigador> investigadores) {
        return new Documental(titulo, duracion, genero, tema, investigadores);
    }

    // Método para mostrar los detalles del documental
    private void mostrarDetallesDocumental(Documental documental) {
        DocumentalView documentalView = new DocumentalView(documental);
        documentalView.mostrarDetalles();
    }

    // Método para listar todos los documentales
    public List<Documental> listarDocumentales() {
        return repositorio.listar();
    }
}