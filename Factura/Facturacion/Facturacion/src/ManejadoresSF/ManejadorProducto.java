package ManejadoresSF;

import EntidadesSF.Producto;
import InterfacesSF.Crudable;
import PersistenciaSF.ProductoDao;
import java.sql.ResultSet;

public class ManejadorProducto implements Crudable<Producto> {

    @Override
    public Producto crear(Producto producto) {
        ProductoDao productoDao = new ProductoDao();
        return productoDao.crear(producto);
    }

    @Override
    public Producto modificar(Producto objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto listarUno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean eliminar(Producto objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    

    @Override
    public ResultSet listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
