/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import com.sun.jdi.connect.spi.Connection;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.clientesDAO;

public class clientes extends javax.swing.JPanel {
    
    
    public clientes() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TableCliente = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtApellidosCliente = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnGuardarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtCorreoCliente = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtClaveCliente1 = new javax.swing.JTextField();
        Actualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));

        TableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO", "CORREO", "CLAVE"
            }
        ));
        TableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableCliente);

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Nombre");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtNombreCliente.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreCliente.setBorder(null);
        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });
        txtNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyTyped(evt);
            }
        });
        jPanel9.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 160, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Apellidos:");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtApellidosCliente.setBackground(new java.awt.Color(204, 204, 204));
        txtApellidosCliente.setBorder(null);
        txtApellidosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosClienteActionPerformed(evt);
            }
        });
        jPanel9.add(txtApellidosCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 160, 30));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Acrtualizar Tabla");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        btnGuardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/GuardarTodo.png"))); // NOI18N
        btnGuardarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClienteActionPerformed(evt);
            }
        });
        jPanel9.add(btnGuardarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 70, 35));

        btnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        btnEliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });
        jPanel9.add(btnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 50, 35));

        btnNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo.png"))); // NOI18N
        btnNuevoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });
        jPanel9.add(btnNuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 70, 35));

        jPanel26.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 160, 2));

        jPanel27.setBackground(new java.awt.Color(0, 110, 255));

        jPanel30.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel27Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel27Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel9.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 160, 2));

        jPanel28.setBackground(new java.awt.Color(0, 110, 255));

        jPanel29.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel28Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel28Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel9.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 160, 2));

        jPanel46.setBackground(new java.awt.Color(255, 255, 0));

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Nuevo Cliente");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 40));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("Correos:");
        jPanel9.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txtCorreoCliente.setBackground(new java.awt.Color(204, 204, 204));
        txtCorreoCliente.setBorder(null);
        txtCorreoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoClienteActionPerformed(evt);
            }
        });
        jPanel9.add(txtCorreoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 160, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Clave:");
        jPanel9.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        txtClaveCliente1.setBackground(new java.awt.Color(255, 255, 255));
        txtClaveCliente1.setForeground(new java.awt.Color(0, 0, 0));
        txtClaveCliente1.setBorder(null);
        txtClaveCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveCliente1ActionPerformed(evt);
            }
        });
        jPanel9.add(txtClaveCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 160, 30));

        Actualizar.setBackground(new java.awt.Color(102, 255, 204));
        Actualizar.setText("-");
        Actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        jPanel9.add(Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 60, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    
             public void actualizarDesdeDAO(clientesDAO dao) {
        DefaultTableModel model = dao.obtenerTodosClientes();
        TableCliente.setModel(model);
    }
    private void TableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableClienteMouseClicked
        
    }//GEN-LAST:event_TableClienteMouseClicked

    private void txtNombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteKeyTyped

    
      
    private void btnGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClienteActionPerformed
      // Obtener la fila seleccionada
    int filaSeleccionada = TableCliente.getSelectedRow();

    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione una fila para editar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Obtener los datos de la fila seleccionada
    int idCliente = (int) TableCliente.getValueAt(filaSeleccionada, 0);
    String nombre = (String) TableCliente.getValueAt(filaSeleccionada, 1);
    String apellidos = (String) TableCliente.getValueAt(filaSeleccionada, 2);
    String correo = (String) TableCliente.getValueAt(filaSeleccionada, 3);
    String clave = (String) TableCliente.getValueAt(filaSeleccionada, 4);

    // Mostrar los datos en los campos de edición
    
    txtNombreCliente.setText(nombre);
    txtApellidosCliente.setText(apellidos);
    txtCorreoCliente.setText(correo);
    txtClaveCliente1.setText(clave);

    // Permitir que el usuario modifique los datos...

    // Luego, cuando el usuario presiona el botón "Guardar Cliente":
    // Obtener los nuevos datos desde los campos de edición
    String nuevoNombre = txtNombreCliente.getText();
    String nuevoApellidos = txtApellidosCliente.getText();
    String nuevoCorreo = txtCorreoCliente.getText();
    String nuevaClave = txtClaveCliente1.getText();

    // Actualizar el cliente en la base de datos
    clientesDAO dao = new clientesDAO();
    clientes clienteActualizado = new clientes();
    clienteActualizado.setNoclientes(idCliente);
    clienteActualizado.setNombre(nuevoNombre);
    clienteActualizado.setApellidos(nuevoApellidos);
    clienteActualizado.setCorreo(nuevoCorreo);
    clienteActualizado.setClave(nuevaClave);

    boolean actualizado = dao.actualizarCliente(clienteActualizado);

    if (actualizado) {
        JOptionPane.showMessageDialog(this, "Cliente actualizado con éxito.");
        // Volver a cargar los datos en la tabla desde la base de datos
        dao.cargarDatosEnTabla(TableCliente);
    } else {
        JOptionPane.showMessageDialog(this, "Error al actualizar el cliente.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Limpiar los campos de edición después de guardar
    limpiarCampos();
}

// Método para limpiar los campos de edición
private void limpiarCampos() {
    
    txtNombreCliente.setText("");
    txtApellidosCliente.setText("");
    txtCorreoCliente.setText("");
    txtClaveCliente1.setText("");
    }//GEN-LAST:event_btnGuardarClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
       // Obtener la fila seleccionada
    int filaSeleccionada = TableCliente.getSelectedRow();

    // Verificar si se ha seleccionado una fila
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione un cliente para eliminar.",
                "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Obtener el ID del cliente de la fila seleccionada
    int idCliente = (int) TableCliente.getValueAt(filaSeleccionada, 0);

    // Instanciar la clase clientesDAO
    clientesDAO dao = new clientesDAO();

    // Llamar al método eliminarCliente y verificar si la eliminación fue exitosa
    boolean eliminado = dao.eliminarCliente(idCliente);

    // Verificar el resultado de la eliminación
    if (eliminado) {
        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(this, "Cliente eliminado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        // Actualizar la tabla después de la eliminación
           actualizarDesdeDAO(dao);
    } else {
        // Mostrar mensaje de error
        JOptionPane.showMessageDialog(this, "Error al eliminar el cliente.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
         String nombre = txtNombreCliente.getText();
    String apellidos = txtApellidosCliente.getText();
    String correo = txtCorreoCliente.getText();
    

    // Crear un objeto clientes con los datos obtenidos
    clientes nuevoCliente = new clientes();
    nuevoCliente.setNombre(nombre);
    nuevoCliente.setApellidos(apellidos);
    nuevoCliente.setCorreo(correo);
    nuevoCliente.setClave(clave);

    // Instanciar la clase clientesDAO
    clientesDAO dao = new clientesDAO();
    actualizarDesdeDAO(dao);

    // Llamar al método insertarCliente y verificar si la inserción fue exitosa
    boolean exito = dao.insertarCliente(nuevoCliente);

    // Verificar el resultado de la inserción
    if (exito) {
        // Limpiar los campos si la inserción fue exitosa
        txtNombreCliente.setText("");
        txtApellidosCliente.setText("");
        txtCorreoCliente.setText("");
    

        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(this, "Cliente registrado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } else {
        // Mostrar mensaje de error
        JOptionPane.showMessageDialog(this, "Error al registrar el cliente.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void txtApellidosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosClienteActionPerformed

    private void txtCorreoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoClienteActionPerformed

    private void txtClaveCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveCliente1ActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        clientesDAO dao = new clientesDAO();
      actualizarDesdeDAO(dao);
    }//GEN-LAST:event_ActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    public javax.swing.JTable TableCliente;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtApellidosCliente;
    private javax.swing.JTextField txtClaveCliente1;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
private int noclientes;
    private String nombre;
    private String apellidos;
    private String correo;
    private String clave;

    // Otros métodos y atributos...

    public void setNoclientes(int noclientes) {
        this.noclientes = noclientes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getNoclientes() {
        return noclientes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public String getClave() {
        return clave;
    }

  
    }


