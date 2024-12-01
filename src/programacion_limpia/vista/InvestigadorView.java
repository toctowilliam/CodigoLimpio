package programacion_limpia.vista;

import programacion_limpia.modelo.Investigador;
public class InvestigadorView {

    private Investigador investigador;


    public InvestigadorView(Investigador investigador) {
        this.investigador = investigador;
    }
    public void mostrarDetalles() {
        System.out.println("\n================================================================");
        System.out.println("Detalles del Investigador:");
        System.out.println("Nombre: " + investigador.getNombre());
        System.out.println("Especaialidad: " + investigador.getCampoEstudio());
        System.out.println("\n================================================================");
    }
}
