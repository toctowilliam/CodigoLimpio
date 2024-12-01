package programacion_limpia.modelo;


import programacion_limpia.interfaces.Investigacion;

public class Investigador implements Investigacion {
    private String nombre;
    private String especialidad;

    public Investigador(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Implementación de Investigacion
    @Override
    public void obtenerInvestigador() {
        System.out.println("Investigador: " + nombre);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getCampoEstudio() {
        return especialidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCampoEstudio(String campoEstudio) {
        this.especialidad = campoEstudio;
    }

    @Override
    public String toString() {
        return "\t" + "nombre:'" + nombre + '\'' + ", Especialidad='" + especialidad + '\'';
    }
}