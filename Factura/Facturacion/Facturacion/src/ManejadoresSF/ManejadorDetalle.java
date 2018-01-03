package ManejadoresSF;

import EntidadesSF.Detalle;
import InterfacesSF.Crudable;
import PersistenciaSF.DetalleDao;
import java.sql.ResultSet;

public class ManejadorDetalle implements Crudable<Detalle> {

    @Override
    public Detalle crear(Detalle detalle) {
        DetalleDao detalleDao = new DetalleDao();
        return detalleDao.crear(detalle);
    }

    @Override
    public Detalle modificar(Detalle objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Detalle listarUno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean eliminar(Detalle objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
