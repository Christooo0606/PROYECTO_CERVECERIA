package vista;

public class Producto {
    private int idProducto;
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadStock;
    private String categoria;

    // Constructor
    public Producto(int idProducto, String nombre, String descripcion, double precio, int cantidadStock, String categoria) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
        this.categoria = categoria;
    }

    // Getters
    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public String getCategoria() {
        return categoria;
    }

    // Setter para establecer el ID del producto
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    // Método para obtener el código
    public String getCodigo() {
        return nombre;  // Puedes cambiar la lógica según sea necesario
    }

    // Método para obtener el ID
    public String getID() {
        return Integer.toString(idProducto);
    }
}
