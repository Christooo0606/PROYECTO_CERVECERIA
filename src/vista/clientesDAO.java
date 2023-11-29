package vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class clientesDAO {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=GrupoModelo";
    private static final String USUARIO = "usersql";
    private static final String CONTRASENA = "root";

    // Método para obtener todos los clientes como DefaultTableModel
    public DefaultTableModel obtenerTodosClientes() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No_cliente");
        model.addColumn("Nombre");
        model.addColumn("Apellidos");
        model.addColumn("Correo");
        model.addColumn("Clave");

        try (Connection conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA)) {
            String sql = "SELECT * FROM clientes";
            try (PreparedStatement statement = conexion.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Object[] rowData = {
                        resultSet.getInt("No_cliente"),
                        resultSet.getString("Nombre"),
                        resultSet.getString("Apellidos"),
                        resultSet.getString("Correo"),
                        resultSet.getString("Clave")
                    };
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            // Manejo de la excepción
            e.printStackTrace();
        }

        return model;
    }

    // Método para insertar un cliente
    public boolean insertarCliente(clientes cliente) {
        try (Connection conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA)) {
            String sql = "INSERT INTO clientes (Nombre, Apellidos, Correo, Clave) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = conexion.prepareStatement(sql)) {
                statement.setString(1, cliente.getNombre());
                statement.setString(2, cliente.getApellidos());
                statement.setString(3, cliente.getCorreo());
                statement.setString(4, cliente.getClave());

                // Ejecutar la inserción
                int filasAfectadas = statement.executeUpdate();

                // Devolver true si se insertó al menos una fila
                return filasAfectadas > 0;
            }
        } catch (SQLException e) {
            // Manejo de la excepción
            e.printStackTrace();
        }

        // Devolver false en caso de error
        return false;
    }

    // metodo paa cargar datos en tabla
     public void cargarDatosEnTabla(JTable tabla) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de cargar nuevos datos

        try (Connection conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA)) {
            String sql = "SELECT * FROM clientes";
            try (PreparedStatement statement = conexion.prepareStatement(sql);
                 ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Object[] rowData = {
                            resultSet.getInt("No_cliente"),
                            resultSet.getString("Nombre"),
                            resultSet.getString("Apellidos"),
                            resultSet.getString("Correo"),
                            resultSet.getString("Clave")
                    };
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            // Manejo de la excepción
            e.printStackTrace();
        }
    }
    // metodo para eliminar un cliente
    public boolean eliminarCliente(int idCliente) {
        try (Connection conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA)) {
            String sql = "DELETE FROM clientes WHERE No_cliente = ?";
            try (PreparedStatement statement = conexion.prepareStatement(sql)) {
                statement.setInt(1, idCliente);

                // Ejecutar la eliminación
                int filasAfectadas = statement.executeUpdate();

                // Devolver true si se eliminó al menos una fila
                return filasAfectadas > 0;
            }
        } catch (SQLException e) {
            // Manejo de la excepción
            e.printStackTrace();
        }

        // Devolver false en caso de error
        return false;
    }
    // Método para actualizar un cliente en la base de datos
    public boolean actualizarCliente(clientes cliente) {
        try (Connection conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA)) {
            String sql = "UPDATE clientes SET Nombre=?, Apellidos=?, Correo=?, Clave=? WHERE No_cliente=?";
            try (PreparedStatement statement = conexion.prepareStatement(sql)) {
                statement.setString(1, cliente.getNombre());
                statement.setString(2, cliente.getApellidos());
                statement.setString(3, cliente.getCorreo());
                statement.setString(4, cliente.getClave());
                statement.setInt(5, cliente.getNoclientes());

                int filasAfectadas = statement.executeUpdate();
                return filasAfectadas > 0;
            }
        } catch (SQLException e) {
            // Manejo de la excepción
            e.printStackTrace();
            return false;
        }
    }
}
