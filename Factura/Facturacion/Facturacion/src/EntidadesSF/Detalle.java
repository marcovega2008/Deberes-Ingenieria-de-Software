package EntidadesSF;

public class Detalle {
    private int id;
    private Factura factura;
    private Producto producto;
    private int cantidad;
    private double precioFinal;

    public Detalle(int id) {
        this.id = id;
    }

    public Detalle(Factura factura, Producto producto, int canidad, double precioFinal) {
        this.factura = factura;
        this.producto = producto;
        this.cantidad = canidad;
        this.precioFinal = precioFinal;
    }

    public Detalle(int id, Factura factura, Producto producto, int canidad, double precioFinal) {
        this.id = id;
        this.factura = factura;
        this.producto = producto;
        this.cantidad = canidad;
        this.precioFinal = precioFinal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }    
}
