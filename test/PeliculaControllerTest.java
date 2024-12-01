
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import programacion_limpia.controlador.PeliculaController;
import programacion_limpia.modelo.Actor;
import programacion_limpia.modelo.Pelicula;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
class PeliculaControllerTest {


    @Test
    void testAgregarPelicula() {
        // Datos de la película
        String titulo = "Incehhptioon";
        int duracion = 148;
        String genero = "Drama";
        String estudio = "Warner Bros";
        String actoresCsv = "Leonardo DiCaprio;48;EEUU";
        // Agregar la película

        PeliculaController peliculaController = new PeliculaController();
        peliculaController.agregarPelicula(titulo, duracion, genero,estudio, actoresCsv);

        // Obtener la lista de películas del controlador
        List<Pelicula> peliculas = peliculaController.listarPeliculas();

        // Verificar que la lista no esté vacía y que tenga la película correcta
        assertNotNull(peliculas, "La lista no debe ser nula.");
        assertFalse(peliculas.isEmpty(), "La lista de películas no debe estar vacía.");
        assertEquals(1, peliculas.size(), "Debe haber al menos una pelicula.");
    }
}
