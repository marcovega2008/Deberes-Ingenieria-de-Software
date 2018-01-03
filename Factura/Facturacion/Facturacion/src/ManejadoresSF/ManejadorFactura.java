package ManejadoresSF;

import EntidadesSF.Factura;
import InterfacesSF.Crudable;
import PersistenciaSF.FacturaDao;
import java.sql.ResultSet;

public class ManejadorFactura implements Crudable<Factura>{

    @Override
    public Factura crear(Factura factura) {
       FacturaDao facturaDao = new FacturaDao();
       return facturaDao.crear(factura);
    }

    @Override
    public Factura modificar(Factura objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Factura listarUno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean eliminar(Factura objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
