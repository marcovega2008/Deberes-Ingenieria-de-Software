package ConexionDB;

import java.sql.*;

public class ConexionDB {
    private static Connection conection = null;
    private static final String userDB = "postgres";
    private static final String passwordDB = "12345";
    private static final String url =  "jdbc:postgresql://localhost:5432/factura";
    
    public static Connection obtener() throws SQLException, ClassNotFoundException {
      if (conection == null) {
         try {
            Class.forName("org.postgresql.Driver");
            conection = DriverManager.getConnection(url,userDB, passwordDB);             
         } catch (SQLException ex) {
            throw new SQLException(ex);
         } catch (ClassNotFoundException ex) {
            throw new ClassCastException(ex.getMessage());
         }
         System.out.println("Conexión Exitosa");
      }
      return conection;
   }
   public static void cerrar() throws SQLException {
      if (conection != null) {
         conection.close();
      }
   }
}
