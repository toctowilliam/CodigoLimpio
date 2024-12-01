package repositorios;

import programacion_limpia.interfaces.Repositorio;

import java.util.ArrayList;
import java.util.List;

public class RepositorioGenerico<T> implements Repositorio<T> {
    private List<T> elementos;

    public RepositorioGenerico() {
        this.elementos = new ArrayList<>();
    }

    @Override
    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    @Override
    public List<T> listar() {
        return elementos;
    }
}