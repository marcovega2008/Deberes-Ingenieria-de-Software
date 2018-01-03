package PersistenciaSF;

import ConexionDB.ConexionDB;
import EntidadesSF.Producto;
import InterfacesSF.Crudable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductoDao implements Crudable<Producto>{

    @Override
    public Producto crear(Producto producto) {
        try {
            ConexionDB conexion = new ConexionDB();
            Connection miConexion  = ConexionDB.obtener();
            PreparedStatement consulta;

            consulta = miConexion.prepareStatement("INSERT INTO producto (nombre, stock) VALUES(?, ?)", Statement.RETURN_GENERATED_KEYS);
            consulta.setString(1, producto.getNombre() );
            consulta.setDouble(2, producto.getStock());
         
            
            int filasInsertadas = consulta.executeUpdate();
            
            if (filasInsertadas==0) {
                 throw new SQLException("Creación Fallida de Producto.");
            }
            try (ResultSet generatedKeys = consulta.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                
                Producto productoIngresado = new Producto(generatedKeys.getInt(1));
           
                System.out.println(productoIngresado.getId());
                 return productoIngresado;
            }
            else {
                throw new SQLException("Creacion Fallida de Producto, No se obtuvo el ID.");
            }
        }
            
            
       
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
      return null;
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
