package programacion_limpia.vista;

import programacion_limpia.modelo.SerieDeTV;
import programacion_limpia.modelo.Temporada;
import java.util.List;

public class SerieDeTvView {
    private SerieDeTV serieDeTv;

    public SerieDeTvView(SerieDeTV serieDeTv) {
        this.serieDeTv = serieDeTv;
    }

    public void mostrarDetalles() {
        System.out.println("\n================================================================");
        System.out.println("Detalles de la Serie TV:");
        System.out.println("ID: " + serieDeTv.getId());
        System.out.println("Título: " + serieDeTv.getTitulo());
        System.out.println("Duración en minutos: " + serieDeTv.getDuracionEnMinutos());
        System.out.println("Género: " + serieDeTv.getGenero());
        System.out.println("Temporadas: " + serieDeTv.getTemporadas());
        System.out.println("Temporadas:");
        List<Temporada> listaTemporadas = serieDeTv.getListaTemporadas();
        for (Temporada temporada : listaTemporadas) {
            System.out.println(temporada);
        }
        System.out.println("================================================================");
    }
}