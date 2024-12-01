import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import programacion_limpia.controlador.DocumentalController;
import programacion_limpia.modelo.Documental;
import programacion_limpia.modelo.Investigador;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DocumentalControllerTest {

    private DocumentalController documentalController;

    @BeforeEach
    void setUp() {
        // Inicializar el controlador de Documental antes de cada prueba
        documentalController = new DocumentalController();
    }

    @Test
    void testAgregarDocumental() {
        // Crear investigadores
        Investigador investigador1 = new Investigador("Dr. Smith", "Arqueología");
        Investigador investigador2 = new Investigador("Dr. Johnson", "Historia");
        List<Investigador> investigadores = Arrays.asList(investigador1, investigador2);

        // Datos del documental
        String titulo = "History of Ancient Civilizations";
        int duracion = 120;
        String genero = "Documental";
        String tema = "Ancient History";

        // Agregar el documental
        documentalController.agregarDocumental(titulo, duracion, genero, tema, investigadores);

        // Obtener la lista de documentales del repositorio (suponiendo que el repositorio tiene un método listar)
        List<Documental> documentales = documentalController.listarDocumentales();

        // Verificar que la lista no esté vacía y que tenga un documental
        assertNotNull(documentales, "La lista no debe ser nula.");
        assertFalse(documentales.isEmpty(), "La lista de documentales no debe estar vacía.");
        assertEquals(1, documentales.size(), "Debe haber al menos un documental.");

        // Verificar los datos del documental
        Documental documentalCreado = documentales.get(0);
        assertEquals(duracion, documentalCreado.getDuracionEnMinutos(), "La duración debe ser 120 minutos.");
        assertEquals(genero, documentalCreado.getGenero(), "El género debe ser 'Documental'");


    }
}