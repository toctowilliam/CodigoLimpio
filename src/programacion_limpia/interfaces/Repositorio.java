package programacion_limpia.interfaces;

import java.util.List;

public interface Repositorio<T> {
    void agregar(T elemento);
    List<T> listar();
}