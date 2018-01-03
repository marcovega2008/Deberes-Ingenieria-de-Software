package EntidadesSF;

public class Producto {
    private int id;
    private String nombre;
    private int stock;
    private double precioUnitario;

    public Producto(int id, String nombre, int stock, double precioUnitario) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
        this.precioUnitario = precioUnitario;
    }

    public Producto(String nombre, int stock, double precioUnitario) {
        this.nombre = nombre;
        this.stock = stock;
        this.precioUnitario = precioUnitario;
    }

    public Producto(int id) {
        this.id = id;
    }   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}
