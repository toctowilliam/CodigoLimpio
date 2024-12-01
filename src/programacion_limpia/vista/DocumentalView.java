package programacion_limpia.vista;

import programacion_limpia.modelo.Documental;
import programacion_limpia.modelo.Investigador;

public class DocumentalView {
    private Documental documental;

    public DocumentalView(Documental documental) {
        this.documental = documental;
    }

    public void mostrarDetalles() {
        System.out.println("\n================================================================");
        System.out.println("Detalles del Documental:");
        System.out.println("ID: " + documental.getId());
        System.out.println("Título: " + documental.getTitulo());
        System.out.println("Duración en minutos: " + documental.getDuracionEnMinutos());
        System.out.println("Género: " + documental.getGenero());
        System.out.println("Tema: " + documental.getTema());
        System.out.println("Investigadores:");
        for (Investigador investigador : documental.getInvestigadores()) {
            System.out.println(investigador);
        }
        System.out.println("\n================================================================");
    }
}
