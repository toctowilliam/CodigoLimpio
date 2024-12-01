package programacion_limpia.controlador;

import programacion_limpia.modelo.Actor;
import programacion_limpia.modelo.Pelicula;
import repositorios.RepositorioGenerico;
import programacion_limpia.vista.PeliculaView;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeliculaController {

    private RepositorioGenerico<Pelicula> repositorio = new RepositorioGenerico<>();

    // Método para agregar una película
    public void agregarPelicula(String titulo, int duracion, String genero, String estudio, String actoresCsv) {
        // Crear la película y asignar los actores
        Pelicula pelicula = crearPelicula(titulo, duracion, genero, estudio, actoresCsv);
        if (pelicula != null) {
            // Agregar la película al repositorio
            repositorio.agregar(pelicula);
            // Mostrar los detalles de la película
            mostrarDetallesPelicula(pelicula);
        } else {
            System.out.println("Error: La película no pudo ser creada.");
        }
    }

    // Método para crear una película
    private Pelicula crearPelicula(String titulo, int duracion, String genero, String estudio, String actoresCsv) {
        Pelicula pelicula = new Pelicula(titulo, duracion, genero, estudio);
        List<Actor> actores = procesarActores(actoresCsv);
        pelicula.setActores(actores);
        return pelicula;
    }

    // Método para procesar la cadena de actores
    private List<Actor> procesarActores(String actoresCsv) {
        return Arrays.stream(actoresCsv.split(",")) // Separar los actores por coma
                .map(this::crearActor) // Crear objetos Actor
                .filter(actor -> actor != null) // Filtrar actores válidos
                .collect(Collectors.toList());
    }

    // Método para crear un Actor desde una cadena de datos
    private Actor crearActor(String actorData) {
        try {
            String[] datos = actorData.split(";"); // Separar atributos del actor por comas
            String nombre = datos[0].trim();
            int edad = Integer.parseInt(datos[1].trim());
            String nacionalidad = datos[2].trim();
            return new Actor(nombre, edad, nacionalidad);
        } catch (Exception e) {
            System.out.println("Error al procesar los datos del actor: " + actorData);
            return null;
        }
    }

    // Método para mostrar los detalles de una película
    private void mostrarDetallesPelicula(Pelicula pelicula) {
        PeliculaView peliculaView = new PeliculaView(pelicula);
        peliculaView.mostrarDetalles();
        System.out.println("Película agregada correctamente.");
    }

    // Método para listar todas las películas
    public List<Pelicula> listarPeliculas() {
        return repositorio.listar(); // Suponiendo que el repositorio tiene un método listar
    }
}
