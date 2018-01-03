package PersistenciaSF;

import ConexionDB.ConexionDB;
import EntidadesSF.Factura;
import InterfacesSF.Crudable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FacturaDao implements Crudable<Factura>{

    @Override
    public Factura crear(Factura factura) {
        try {
            ConexionDB conexion = new ConexionDB();
            
            Connection miConexion  = ConexionDB.obtener();
            PreparedStatement consulta;

            consulta = miConexion.prepareStatement("INSERT INTO factura (fecha, cliente) VALUES(?, ?)");
            consulta.setString(1, factura.getFecha());
            consulta.setInt(2, factura.getCliente().getId());
         
            
            int filasInsertadas = consulta.executeUpdate();
            
            if (filasInsertadas==0) {
                 throw new SQLException("Creación Fallida de Factura");
            }
            try (ResultSet generatedKeys = consulta.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                
                Factura facturaIngresada = new Factura(generatedKeys.getInt(1));
           
                
                 return facturaIngresada;
            }
            else {
                throw new SQLException("Creación de Factura Fallida, Id no Obtenido.");
            }
        }
            
            
       
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
      return null;
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
