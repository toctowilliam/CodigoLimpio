package programacion_limpia.modelo;

import programacion_limpia.interfaces.Reproducible;

import java.util.List;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual  implements Reproducible {
    private int temporadas;
    private List<Temporada> listaTemporadas; // Relacion de  composicion ya que una temporada no puede existir sin una SerieDeTv

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas, List<Temporada> listaTemporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
        this.listaTemporadas = listaTemporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public List<Temporada> getListaTemporadas() {
        return listaTemporadas;
    }

    public void setListaTemporadas(List<Temporada> listaTemporadas) {
        this.listaTemporadas = listaTemporadas;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo serie de TV: " + getTitulo());
    }

    @Override
    public void pausar() {
        System.out.println("Pausando serie de TV: " + getTitulo());
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo serie de TV: " + getTitulo());
    }
}