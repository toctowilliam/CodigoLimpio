import programacion_limpia.controlador.*;
import programacion_limpia.modelo.Investigador;
import programacion_limpia.modelo.Temporada;
import utilidades.GestionarCSV;
import programacion_limpia.vista.MenuView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InicioContenidoAudiovisual {

    public final List<String[]> contenidoProcesado = new ArrayList<>();
    private final List<Investigador> investigadores = new ArrayList<>();
    private final List<Temporada> temporadas = new ArrayList<>();
    public GestionarCSV gestionarCSV;
    MenuView menuView = new MenuView();

    public static void main(String[] args) {
        try {
            InicioContenidoAudiovisual programa = new InicioContenidoAudiovisual();
            programa.iniciarPrograma();
        } catch (Exception e) {
            System.err.println("Error al Iniciar el Programa: " + e.getMessage());
        }
    }

    public void iniciarPrograma() {
        GestionarCSV gestionarCSV = new GestionarCSV();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            menuView.mostrarMenu();
            opcion = leerOpcion(scanner);
            ejecutarOpcion(opcion, gestionarCSV);
        } while (opcion != 4);
        scanner.close();
    }


    public int leerOpcion(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine(); // Limpiar entrada
            System.out.println("Entrada inválida. Por favor, ingresa un número.");
            return -1;
        }
    }

    public void ejecutarOpcion(int opcion, GestionarCSV gestionarCSV) {
        menuView.mostrarOpcionSeleccionada(opcion);
        try {
            switch (opcion) {
                case 1 -> cargarContenidoDesdeCSV(gestionarCSV);
                case 2 -> gestionarCSV.imprimirContenidoEnArchivo("contenido.txt", contenidoProcesado);
                case 3 -> eliminarContenidoAudiovisual(); // Nueva opción para eliminar contenido
                case 4 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        } catch (Exception e) {
            System.out.println("Error al ejecutar la opción: " + e.getMessage());
        }
    }
    public void cargarContenidoDesdeCSV(GestionarCSV gestionarCSV) {
        try {
            File archivoSeleccionado = gestionarCSV.seleccionarArchivo();
            if (archivoSeleccionado != null) {
                List<String[]> datos = gestionarCSV.leerArchivo(archivoSeleccionado);
                procesarDatosCSV(datos);
                System.out.println("Contenido cargado exitosamente.");
            } else {
                System.out.println("No se seleccionó ningún archivo.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public void procesarDatosCSV(List<String[]> datos) {
        for (String[] fila : datos) {
            try {
                procesarFila(fila);
                contenidoProcesado.add(fila);
            } catch (Exception e) {
                System.out.println("Error al procesar fila: " + String.join(",", fila) + ". Detalle: " + e.getMessage());
            }
        }
    }

    public void procesarFila(String[] fila) {
        switch (fila[0].toLowerCase()) {
            case "pelicula" -> new PeliculaController().agregarPelicula(fila[1], Integer.parseInt(fila[2]), fila[3], fila[4], fila[5]);
            case "investigador" -> {
                new InvestigadorController().agregarInvestigador(fila[1], fila[2]);
                investigadores.add(new Investigador(fila[1], fila[2]));
            }
            case "documental" -> new DocumentalController().agregarDocumental(fila[1], Integer.parseInt(fila[2]), fila[3], fila[4], investigadores);
            case "temporada" -> {
                new TemporadaController().agregarTemporada(Integer.parseInt(fila[1]), Integer.parseInt(fila[2]));
                temporadas.add(new Temporada(Integer.parseInt(fila[1]), Integer.parseInt(fila[2])));
            }
            case "serie" -> new SerieDeTvController().agregarSerieDeTv(fila[1], Integer.parseInt(fila[2]), fila[3], Integer.parseInt(fila[4]), temporadas);
            case "telenovela" -> new TelenovelaController().agregarTelenovela(fila[1], Integer.parseInt(fila[2]), fila[3], fila[4], Integer.parseInt(fila[5]));
            case "webinar" -> new WebinarController().agregarWebinar(fila[1], Integer.parseInt(fila[2]), fila[3], fila[4], fila[5], fila[6]);
            default -> System.out.println("Tipo de contenido desconocido: " + fila[0]);
        }
    }
    public void eliminarContenidoAudiovisual() {
        contenidoProcesado.clear();
        investigadores.clear();
        temporadas.clear();
        System.out.println("=============================================");
        System.out.println("\nTodos los contenidos audiovisuales han sido eliminados.");
    }
}