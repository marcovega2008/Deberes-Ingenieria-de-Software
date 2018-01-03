package InterfacesSF;

import java.sql.ResultSet;

/**
 *
 * @param <T>
 */
public interface Crudable<T> {
    T crear(T objeto);
    T modificar(T objeto);
    T listarUno();
    Boolean eliminar(T objeto);
    ResultSet listar();
    
}
