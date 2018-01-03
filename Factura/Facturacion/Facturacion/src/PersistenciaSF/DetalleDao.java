
package PersistenciaSF;

import ConexionDB.ConexionDB;
import EntidadesSF.Detalle;
import InterfacesSF.Crudable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DetalleDao implements Crudable<Detalle>{

    @Override
    public Detalle crear(Detalle detalle) {
        try {
            Connection miConexion  = ConexionDB.obtener();
            PreparedStatement consulta;

            consulta = miConexion.prepareStatement("INSERT INTO detalle (factura, producto, cantidad,subtotal, iva, total) VALUES(?, ?, ?,?,?,?)");
            consulta.setInt(1, detalle.getFactura().getId());
            consulta.setInt(2, detalle.getProducto().getId());
            consulta.setInt(3, detalle.getCantidad());
            
            int filasInsertadas = consulta.executeUpdate();
            
            if (filasInsertadas==0) {
                 throw new SQLException("Creación Fallida del Detalle.");
            }
            try (ResultSet generatedKeys = consulta.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                
                Detalle detalleIngresado = new Detalle(generatedKeys.getInt(1));
           
                
                 return detalleIngresado;
            }
            else {
                throw new SQLException("Creación de Detalle Fallida, No se obtuvo el ID.");
            }
        }
            
            
       
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
      return null;
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
