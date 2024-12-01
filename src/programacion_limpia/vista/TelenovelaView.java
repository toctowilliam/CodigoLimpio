package programacion_limpia.vista;

import programacion_limpia.modelo.Actor;
import programacion_limpia.modelo.Telenovela;

public class TelenovelaView {

    private Telenovela telenovela;

    public TelenovelaView(Telenovela telenovela) {
        this.telenovela = telenovela;
    }

    public void mostrarDetalles() {
        System.out.println("\n================================================================");
        System.out.println("Detalles de la Telenovela:");
        System.out.println("Título: " + telenovela.getTitulo());
        System.out.println("Duración en minutos: " + telenovela.getDuracionEnMinutos());
        System.out.println("Género: " + telenovela.getGenero());
        System.out.println("País de origen: " + telenovela.getPaisOrigen());
        System.out.println("Número de capítulos: " + telenovela.getNumeroCapitulos());
        if (!telenovela.getActores().isEmpty()) {
            System.out.println("Actores:");
            for (Actor actor : telenovela.getActores()) {
                System.out.println("- " + actor.getNombre());
            }
        } else {
            System.out.println("No hay actores en esta telenovela.");
        }
    }
}
