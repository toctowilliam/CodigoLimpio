package programacion_limpia.vista;
import programacion_limpia.modelo.Actor;
import programacion_limpia.modelo.Pelicula;
public class PeliculaView  {

    private Pelicula pelicula;

    // Constructor que recibe una película
    public PeliculaView(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    // Método para mostrar los detalles de la película
    public void mostrarDetalles() {
        System.out.println("\n================================================================");
        if (pelicula == null) {  // Validar que la película no sea null
            System.out.println("No hay detalles de la película para mostrar.");
            return;
        }
        System.out.println("Detalles de la película:");
        System.out.println("Título: " + pelicula.getTitulo());
        System.out.println("Duración en minutos: " + pelicula.getDuracionEnMinutos());
        System.out.println("Género: " + pelicula.getGenero());
        System.out.println("Estudio: " + pelicula.getEstudio());
        System.out.println("Actores:");
        for (Actor actor : pelicula.getActores()) {
            System.out.println("\t"+actor);
        }
        System.out.println("================================================================");
    }

    // Método para cambiar la película mostrada en la programacion_limpia.vista
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
}