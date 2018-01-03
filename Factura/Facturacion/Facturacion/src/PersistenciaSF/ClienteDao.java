package PersistenciaSF;

import ConexionDB.ConexionDB;
import EntidadesSF.Cliente;
import InterfacesSF.Crudable;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteDao implements Crudable<Cliente> {

    @Override
    public Cliente crear(Cliente cliente) {
        try {
            Connection miConexion = ConexionDB.obtener();
            PreparedStatement consulta;

            consulta = miConexion.prepareStatement("INSERT INTO cliente (cedula, nombre, direccion,telefono) VALUES(?, ?, ?,?)");
            consulta.setString(1, cliente.getCedula());
            consulta.setString(2, cliente.getNombre());
            consulta.setString(3, cliente.getDireccion());
            consulta.setString(4, cliente.getTelefono());

            int filasInsertadas = consulta.executeUpdate();

            if (filasInsertadas == 0) {
                throw new SQLException("Creación de Usuario Fallida");
            } else {
                JOptionPane.showMessageDialog(null, "Cliente Creado Exitosamente");
            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Cliente modificar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente listarUno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean eliminar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*@Override
    public ArrayList<Object> listar() {
        ArrayList<Object> cliente = new ArrayList<>();           
        try {
            
            Connection miConexion  = ConexionDB.obtener();
            String sql = "SELECT * FROM cliente";
            
            Statement statement = miConexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                cliente.add(rs.getInt("id"));
                cliente.add(rs.getString("cedula"));
                cliente.add(rs.getString("nombre"));
                cliente.add(rs.getString("direccion"));
                cliente.add(rs.getString("telefono"));
            }
            
            
        }catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }*/
    @Override
    public ResultSet listar() {        
        ResultSet rs = null;
        try {
            Connection miConexion = ConexionDB.obtener();            
            String sql = "Select * from cliente";
            Statement st = miConexion.createStatement();
            rs = st.executeQuery(sql);

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
}
