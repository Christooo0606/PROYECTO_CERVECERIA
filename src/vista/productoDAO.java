package vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import vista.Producto;

public class productoDAO {

    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=GrupoModelo";
    private static final String USUARIO = "usersql";
    private static final String CONTRASENA = "root";

    public static List<String> obtenerNombresProductos() throws SQLException {
        List<String> nombresProductos = new ArrayList<>();

        try (Connection conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
             PreparedStatement statement = conexion.prepareStatement("SELECT Nombre FROM Productos");
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                String nombreProducto = resultSet.getString("Nombre");
                nombresProductos.add(nombreProducto);
            }
        }

        return nombresProductos;
    }

    public static List<Producto> obtenerProductos() throws SQLException {
        List<Producto> productos = new ArrayList<>();

        try (Connection conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
             PreparedStatement statement = conexion.prepareStatement("SELECT * FROM Productos");
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("Id_producto");
                String nombre = resultSet.getString("Nombre");
                String descripcion = resultSet.getString("Descripcion");
                double precio = resultSet.getDouble("Precio");
                int stock = resultSet.getInt("cantidad_stock");
                String categoria = resultSet.getString("categoria");

                Producto producto = new Producto(id, nombre, descripcion, precio, stock, categoria);
                productos.add(producto);
            }
        }

        return productos;
    }

    public static Producto obtenerProductoPorNombre(String nombre) throws SQLException {
        Producto producto = null;

        try (Connection conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
             PreparedStatement statement = conexion.prepareStatement("SELECT * FROM Productos WHERE Nombre = ?");
        ) {
            statement.setString(1, nombre);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    
                    int id = resultSet.getInt("Id_producto");
                    String descripcion = resultSet.getString("Descripcion");
                    double precio = resultSet.getDouble("Precio");
                    int stock = resultSet.getInt("cantidad_stock");
                    String categoria = resultSet.getString("categoria");

                    producto = new Producto(id, nombre, descripcion, precio, stock, categoria);
                }
            }
        }

        return producto;
    }
}
