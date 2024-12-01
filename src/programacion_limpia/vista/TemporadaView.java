package programacion_limpia.vista;

import programacion_limpia.modelo.Temporada;

public class TemporadaView {
    private Temporada temporada;

    public TemporadaView(Temporada temporada) {
        this.temporada = temporada;
    }

    public void mostrarDetalles() {
        System.out.println("\n================================================================");
        System.out.println("Detalles de la temporada:");
        System.out.println("Número de temporada: " + temporada.getNumero());
        System.out.println("Número de episodios: " + temporada.getEpisodios());
        System.out.println("\n================================================================");
    }

}
