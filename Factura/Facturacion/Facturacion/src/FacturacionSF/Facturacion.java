
package FacturacionSF;
import EntidadesSF.Producto;
import ManejadoresSF.ManejadorCliente;
import ManejadoresSF.ManejadorDetalle;
import ManejadoresSF.ManejadorFactura;
import ManejadoresSF.ManejadorProducto;
import java.util.ArrayList;
import java.util.Iterator;

public class Facturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ManejadorCliente manejadorCliente = new ManejadorCliente();
        System.out.println(manejadorCliente.listar());
        
        
        /*
        ManejadorFactura manejadorFactura = new ManejadorFactura();
        ManejadorProducto manejadorProducto = new ManejadorProducto();
        ManejadorDetalle manejadorDetalle = new ManejadorDetalle();
        
        //Cliente cliente = new Cliente("1723713556", "David Carrillo", "Vista Hermosa de Chillogallo", "4505331");
        //Cliente clienteIngresado = manejadorCliente.crear(cliente);
        ArrayList<Object> clientes = new ArrayList<>();
        //clientes = manejadorCliente.listar();
        
        
        
        // Declaramos el Iterador e imprimimos los Elementos del ArrayList
        Iterator<Object> nombreIterator = clientes.iterator();
        while(nombreIterator.hasNext()){
                Object elemento = nombreIterator.next();
                System.out.println(elemento);
        }
        
         
        //Factura factura = new Factura("21/12/2017", clienteIngresado);
        //Factura facturaCreada = manejadorFactura.crear(factura);
        
        //Producto producto1 = new Producto("Computador Dell", 25, 320.50);
        //Producto producto2 = new Producto("Teclado Acer",15 , 18.50);
       
        
        //Producto productoCreado1 = manejadorProducto.crear(producto1);
        //Producto productoCreado2 = manejadorProducto.crear(producto2);
       
        
        //Detalle detalle1 = new Detalle(facturaCreada, productoCreado1, 0, 0, 0, 0);
        //Detalle detalle2 = new Detalle(facturaCreada, productoCreado2, 0, 0, 0, 0);
        
        //manejadorDetalle.crear(detalle1);
        //manejadorDetalle.crear(detalle2);
        
        */
        
        
        
    }
    
}
