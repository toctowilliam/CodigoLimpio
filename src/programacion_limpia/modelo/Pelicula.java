package programacion_limpia.modelo;


import programacion_limpia.interfaces.Reproducible;

import java.util.List;

public class Pelicula extends ContenidoAudiovisual implements Reproducible {
    private String estudio;
    private List<Actor> actores; // Asociación con Actor
    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public List<Actor> getActores() {
        return actores;
    }

    public void setActores(List<Actor> actores) {
        this.actores = actores;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo película: " + getTitulo());
    }

    @Override
    public void pausar() {
        System.out.println("Pausando película: " + getTitulo());
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo película: " + getTitulo());
    }



}