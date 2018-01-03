package ManejadoresSF;

import EntidadesSF.Cliente;
import InterfacesSF.Crudable;
import PersistenciaSF.ClienteDao;
import java.sql.ResultSet;
import java.util.List;

public class ManejadorCliente implements Crudable<Cliente> {

    @Override
    public Cliente crear(Cliente cliente) {
        ClienteDao clienteDao = new ClienteDao();
        return clienteDao.crear(cliente);
    }

    @Override
    public Cliente modificar(Cliente objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente listarUno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean eliminar(Cliente objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //@Override
    //public ArrayList<Object> listar() {
    //    ClienteDao clienteDao = new ClienteDao();
    //    return clienteDao.listar();        
    //}

    @Override
    public ResultSet listar() {
        ClienteDao clienteDao = new ClienteDao();
        return clienteDao.listar();
    }
    
}
