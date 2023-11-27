import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MostrarProductos extends JFrame {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=GrupoModelo";
    private static final String USUARIO = "usersql";
    private static final String CONTRASENA = "root";

    private JTable table;

    public MostrarProductos() {
        super("Mostrar Productos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(460, 380);
        setLocationRelativeTo(null);

        // Crear tabla
        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);

        // Cargar datos de la base de datos en la tabla
        cargarDatosTabla();

        setVisible(true);

        // Obtener el texto de la tabla
        String tablaPrint = obtenerTextoTabla();
        System.out.println(tablaPrint);  // Puedes almacenar este valor en una variable según tus necesidades
    }

    private void cargarDatosTabla() {
        try {
            Connection conn = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            String query = "SELECT Id_producto, Nombre, Descripcion, Precio, cantidad_stock, categoria FROM Productos";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            // Obtener el modelo de la tabla
            DefaultTableModel model = new DefaultTableModel();
            table.setModel(model);

            // Añadir columnas al modelo
            model.addColumn("ID");
            model.addColumn("Nombre");
            model.addColumn("Descripción");
            model.addColumn("Precio");
            model.addColumn("Stock");
            model.addColumn("Categoría");

            // Añadir filas al modelo
            while (resultSet.next()) {
                Object[] row = {
                        resultSet.getInt("Id_producto"),
                        resultSet.getString("Nombre"),
                        resultSet.getString("Descripcion"),
                        resultSet.getDouble("Precio"),
                        resultSet.getInt("cantidad_stock"),
                        resultSet.getString("categoria")
                };
                model.addRow(row);
            }

            resultSet.close();
            preparedStatement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private String obtenerTextoTabla() {
        StringBuilder tablaPrint = new StringBuilder();
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        // Agregar nombres de columnas
        for (int i = 0; i < model.getColumnCount(); i++) {
            tablaPrint.append(model.getColumnName(i)).append("\t");
        }
        tablaPrint.append("\n");

        // Agregar datos de la tabla
        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                tablaPrint.append(model.getValueAt(i, j)).append("\t");
            }
            tablaPrint.append("\n");
        }

        return tablaPrint.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MostrarProductos());
    }
}
