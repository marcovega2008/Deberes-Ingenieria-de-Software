package EntidadesSF;

public class Factura {
    private int id;
    private String numFactura,fecha;
    private Cliente cliente;

    public Factura(int id) {
        this.id = id;
    }
    
    public Factura(String numFactura, String fecha, Cliente cliente) {
        this.numFactura = numFactura;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public Factura(int id, String numFactura, String fecha, Cliente cliente) {
        this.id = id;
        this.numFactura = numFactura;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }  
}
