package programacion_limpia.controlador;

import programacion_limpia.modelo.Investigador;
import repositorios.RepositorioGenerico;
import programacion_limpia.vista.InvestigadorView;

public class InvestigadorController {
    private RepositorioGenerico<Investigador> repositorio = new RepositorioGenerico<>();

    // Método para agregar un investigador
    public void agregarInvestigador(String nombre, String especialidad) {
        // Crear el investigador con los datos proporcionados
        Investigador investigador = crearInvestigador(nombre, especialidad);
        repositorio.agregar(investigador);
        mostrarDetallesInvestigador(investigador);
    }

    // Método para crear un Investigador
    private Investigador crearInvestigador(String nombre, String especialidad) {
        return new Investigador(nombre, especialidad);
    }

    // Método para mostrar los detalles del investigador
    private void mostrarDetallesInvestigador(Investigador investigador) {
        InvestigadorView investigadorView = new InvestigadorView(investigador);
        investigadorView.mostrarDetalles();
    }
}
