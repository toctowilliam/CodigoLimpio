package utilidades;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestionarCSV {

    public List<String[]> leerArchivo(File archivo) throws IOException {
        System.out.println(archivo);
        List<String[]> datos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.isBlank() && !linea.startsWith("#")) { // Ignorar comentarios y líneas vacías
                    datos.add(linea.split(","));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return datos;
    }

    // Método que abre el explorador de archivos y devuelve el archivo seleccionado
    public File seleccionarArchivo() {
        // Crear un JFileChooser para abrir el explorador de archivos
        JFileChooser fileChooser = new JFileChooser();

        // Filtrar para que solo se puedan elegir archivos CSV
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos CSV", "csv"));

        // Mostrar el explorador de archivos
        int resultado = fileChooser.showOpenDialog(null);

        // Si el usuario selecciona un archivo, devolver el archivo seleccionado
        if (resultado == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile();
        } else {
            return null; // Si no se selecciona un archivo, devolver null
        }
    }

    // Método para imprimir el contenido en un archivo .txt

    public boolean imprimirContenidoEnArchivo(String nombreArchivo, List<String[]> contenidoProcesado) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write("================================================================\n");
            writer.write("Contenido Procesado\n");
            writer.write("================================================================\n");
            for (String[] fila : contenidoProcesado) {
                writer.write(String.join(" | ", fila));
                writer.newLine(); // Salto de línea
            }
            writer.write("================================================================\n");
            System.out.println("Contenido impreso en el archivo: " + nombreArchivo);
            return true;
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
            return false;
        }
    }



}
