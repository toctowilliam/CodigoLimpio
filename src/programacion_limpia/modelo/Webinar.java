package programacion_limpia.modelo;

import programacion_limpia.interfaces.Calificable;
import programacion_limpia.interfaces.Duracion;

public class Webinar extends ContenidoAudiovisual implements Duracion, Calificable {

    private String fecha;
    private String ponente;
    private String tematica;

    // Constructor
    public Webinar(String titulo, int duracionEnMinutos, String genero, String fecha, String ponente, String tematica) {
        super(titulo, duracionEnMinutos, genero);
        this.fecha = fecha;
        this.ponente = ponente;
        this.tematica = tematica;
    }

    // Getters y Setters
    public String getFechaHora() {
        return fecha;
    }

    public void setFechaHora(String fechaHora) {
        this.fecha = fechaHora;
    }

    public String getPonente() {
        return ponente;
    }

    public void setPonente(String ponente) {
        this.ponente = ponente;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    @Override
    public void mostrarDuracion() {
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
    }

    @Override
    public void calificar(int likes) {
        System.out.println("Calificando webinar: " + getTitulo());
        System.out.println("Likes: " + likes);
    }
}
