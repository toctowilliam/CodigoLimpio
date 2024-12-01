package programacion_limpia.vista;


import programacion_limpia.modelo.Webinar;

public class WebinarView {

    private Webinar webinar;

    public WebinarView(Webinar webinar) {
        this.webinar = webinar;
    }

    public void mostrarDetalles() {
        System.out.println("\n================================================================");
        System.out.println("Detalles del Webinar:");
        System.out.println("Título: " + webinar.getTitulo());
        System.out.println("Duración: " + webinar.getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + webinar.getGenero());
        System.out.println("Fecha y Hora: " + webinar.getFechaHora());
        System.out.println("Ponente: " + webinar.getPonente());
        System.out.println("Temática: " + webinar.getTematica());
        System.out.println("\n================================================================");
    }
}
