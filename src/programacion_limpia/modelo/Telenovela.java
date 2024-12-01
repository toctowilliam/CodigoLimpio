package programacion_limpia.modelo;

import programacion_limpia.interfaces.Reproducible;

import java.util.ArrayList;
import java.util.List;

public class Telenovela extends ContenidoAudiovisual implements Reproducible {

    private String paisOrigen;
    private int numeroCapitulos;
    private List<Actor> actores; // Relación de composición con Actor

    public Telenovela(String titulo, int duracionEnMinutos, String genero, String paisOrigen, int numeroCapitulos) {
        super(titulo, duracionEnMinutos, genero);
        this.paisOrigen = paisOrigen;
        this.numeroCapitulos = numeroCapitulos;
        this.actores = new ArrayList<>();
    }

    // Getters y setters
    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public int getNumeroCapitulos() {
        return numeroCapitulos;
    }

    public void setNumeroCapitulos(int numeroCapitulos) {
        this.numeroCapitulos = numeroCapitulos;
    }


    @Override
    public void reproducir() {
        System.out.println("Reproduciendo telenovela: " + getTitulo());
    }

    @Override
    public void pausar() {
        System.out.println("Pausando telenovela: " + getTitulo());
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo telenovela: " + getTitulo());
    }

    public List<Actor> getActores() {
        return actores;
    }
}