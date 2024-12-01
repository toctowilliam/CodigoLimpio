package programacion_limpia.modelo;

import java.util.List;

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private List<Investigador> investigadores;  // Relacion de Agregación con Investigador

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema, List<Investigador> investigadores) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigadores = investigadores;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public List<Investigador> getInvestigadores() {
        return investigadores;
    }

    public void setInvestigadores(List<Investigador> investigadores) {
        this.investigadores = investigadores;
    }
}

