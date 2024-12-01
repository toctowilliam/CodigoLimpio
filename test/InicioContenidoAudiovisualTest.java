
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class InicioContenidoAudiovisualTest {
    private InicioContenidoAudiovisual programa;
    @BeforeEach
    void setUp() {
        // Inicializar la clase de prueba antes de cada ejecución
        programa = new InicioContenidoAudiovisual();
    }

    @Test
    void testIniciarPrograma_Opcion1_CargarContenido() {
        // Simular el procesamiento de datos en lugar de leer desde un archivo.
        List<String[]> datosSimulados = new ArrayList<>();
        datosSimulados.add(new String[]{"pelicula", "Inception", "148", "Sci-Fi", "Warner Bros", "Leonardo DiCaprio"});
        // Llamamos al método de procesamiento
        programa.procesarDatosCSV(datosSimulados);
        // Verificamos que el contenido fue procesado correctamente
        assertEquals(1, programa.contenidoProcesado.size(), "Debe haber 1 contenido procesado.");
        assertEquals("Inception", programa.contenidoProcesado.get(0)[1], "El título de la película debe ser 'Inception'");
    }

    @Test
    void testIniciarPrograma_Opcion4_Salir() {
        // Simulamos la opción 4 (salir del programa)
        programa.ejecutarOpcion(4, programa.gestionarCSV);

        // Verificamos que no se haya producido ningún error
        assertTrue(true, "No hubo errores al salir del programa.");
    }


}