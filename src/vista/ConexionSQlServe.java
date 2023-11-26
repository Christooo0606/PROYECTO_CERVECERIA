package vista;

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
        } finally {
            cerrarConexion();  // Asegurarse de cerrar la conexión
        }

        return nombresProductos;
    }
}
