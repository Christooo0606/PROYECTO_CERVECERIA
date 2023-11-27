import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class productoDAO {

    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=GrupoModelo";
    private static final String USUARIO = "usersql";
    private static final String CONTRASENA = "root";

    public static void main(String[] args) {
        obtenerNombresProductos();
    }

    public static List<String> obtenerNombresProductos() {
        List<String> nombresProductos = new ArrayList<>();

        try {
            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);

            // Consulta SQL para obtener los nombres de la tabla "Productos"
            String sql = "SELECT Nombre FROM Productos";

            // Crear una declaración preparada
            PreparedStatement statement = conexion.prepareStatement(sql);

            // Ejecutar la consulta y obtener resultados
            ResultSet resultSet = statement.executeQuery();

            // Procesar los resultados
            while (resultSet.next()) {
                String nombreProducto = resultSet.getString("Nombre");
                nombresProductos.add(nombreProducto);
            }

            // Cerrar recursos
            resultSet.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nombresProductos;
    }
}
