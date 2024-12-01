import org.junit.jupiter.api.Test;
import utilidades.GestionarCSV;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GestionarCSVTest {

    @Test
    void leerArchivoCorrectamente() throws IOException {
        GestionarCSV gestionarCSV = new GestionarCSV();// Asegúrate de tener un archivo de prueba aquí
        String directorioTrabajo = System.getProperty("user.dir");
        String rutaArchivo = directorioTrabajo + "/prueba.csv"; // Ruta relativa desde el directorio de trabajo
        File archivo = new File(rutaArchivo);
        List<String[]> datos = gestionarCSV.leerArchivo(archivo);

        assertNotNull(datos, "Los datos no deben ser nulos.");
        assertFalse(datos.isEmpty(), "El archivo no debe estar vacío.");
    }
}