package vista;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConexionSQlServe {
    // Cambia estos valores según tu configuración
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=GrupoModelo";
    private static final String USUARIO = "usersql";
    private static final String CONTRASENA = "root";
    
    private Connection conexion;  // Almacena la conexión en la clase

    public Connection obtenerConexion() {
        try {
            // Cargar el controlador JDBC para SQL Server
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Establecer la conexión
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return conexion;
    }

    public void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }

    public ArrayList<String> obtenerNombresProductos() {
        ArrayList<String> nombresProductos = new ArrayList<>();

        try {
            // Establecer la conexión
            obtenerConexion();

            // Consulta SQL para obtener los nombres de los productos
            String sql = "SELECT Nombre FROM Productos";

            try (PreparedStatement stmt = conexion.prepareStatement(sql);
                 ResultSet rs = stmt.executeQuery()) {

                // Iterar a través de los resultados y agregar nombres a la lista
                while (rs.next()) {
                    nombresProductos.add(rs.getString("Nombre"));
                }
            }
        } catch (SQLException e) {
            // Manejar la excepción, por ejemplo, imprimir el error
            e.printStackTrace();
        }

        // No cerrar la conexión aquí, se cerrará explícitamente cuando sea necesario

        return nombresProductos;
    }
    
    
    public Producto obtenerDetallesProducto(String nombreProducto) {
    Producto producto = null;

    try {
        // Establecer la conexión
        Connection conexion = obtenerConexion();

        // Consulta SQL para obtener detalles del producto por nombre
        String sql = "SELECT * FROM Productos WHERE Nombre = ?";

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, nombreProducto);
            ResultSet rs = stmt.executeQuery();

            // Verificar si se encontró un producto
            if (rs.next()) {
                // Crear un objeto Producto con los detalles obtenidos de la base de datos
                producto = new Producto(
                    rs.getInt("ID"),
                    rs.getString("Nombre"),
                    rs.getString("Descripcion"),
                    rs.getDouble("Precio"),
                    rs.getInt("Cantidad_Stock"),
                    rs.getString("Categoria")
                );
            }
        }
    } catch (SQLException e) {
        // Manejar la excepción, por ejemplo, imprimir el error
        e.printStackTrace();
    }

    return producto;
}

    public void guardarDatos(String nombre, String descripcion, String cantidad, String precio, String categoria) {
    try {
        // Establecer la conexión
        Connection conexion = obtenerConexion();

        // Consulta SQL para insertar un nuevo producto
        String sql = "INSERT INTO Productos (Nombre, Descripcion, Precio, Cantidad_Stock, Categoria) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            stmt.setString(2, descripcion);
            stmt.setDouble(3, Double.parseDouble(precio));
            stmt.setInt(4, Integer.parseInt(cantidad));
            stmt.setString(5, categoria);

            // Ejecutar la consulta
            stmt.executeUpdate();
        }
    } catch (SQLException e) {
        // Manejar la excepción, por ejemplo, imprimir el error
        e.printStackTrace();
    }
}

public ArrayList<Producto> obtenerTodosProductos() {
    ArrayList<Producto> productos = new ArrayList<>();

    try {
        // Establecer la conexión
        Connection conexion = obtenerConexion();

        // Consulta SQL para obtener todos los productos
        String sql = "SELECT * FROM Productos";

        try (PreparedStatement stmt = conexion.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            // Iterar a través de los resultados y agregar productos a la lista
            while (rs.next()) {
                Producto producto = new Producto(
                        rs.getInt("Id_producto"),
                        rs.getString("Nombre"),
                        rs.getString("Descripcion"),
                        rs.getDouble("Precio"),
                        rs.getInt("cantidad_stock"),
                        rs.getString("categoria")
                );
                productos.add(producto);
            }
        }
    } catch (SQLException e) {
        // Manejar la excepción, por ejemplo, imprimir el error
        e.printStackTrace();
    }

    return productos;
}

    void guardarDatos(String idProducto, String nombreProducto, String descripcionProducto, String cantidadProducto, String precioProducto, String categoriaProducto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void close() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
