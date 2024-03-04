/**
 * @author sebassvr
 */
package aplicacion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Persona extends javax.swing.JFrame {
    // Atributos estaticos que guardan los datos de la base de datos.
    public static final String URL = "jdbc:mysql://localhost:3306/escuela?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contraseña = "root";
    PreparedStatement ps;
    ResultSet rs;

    
    // Función para borrar las cajas cuando se requiera esta acción.
    public void limpiarCajas(){
        cajaBuscar.setText(null);
        cajaClave.setText(null);
        cajaNombre.setText(null);
        cajaDomicilio.setText(null);
        cajaCelular.setText(null);
        cajaCorreoElectronico.setText(null);
        cajaFechaDeNacimiento.setText(null);
        comboBoxGenero.setSelectedIndex(0);
        
        
    }
    
    
    // Función para conectar con la base de datos.
    public Connection getConnection(){
        
        Connection conexion = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL,usuario,contraseña);
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");
        } catch (Exception ex) {
            System.err.println("Error: "+ex);
        }
        return conexion;
    }
    
    
    

    public Persona() {
        initComponents();
        cajaID.setVisible(false);
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        botonBuscar = new javax.swing.JButton();
        cajaID = new javax.swing.JTextField();
        cajaBuscar = new javax.swing.JTextField();
        etiquetaClave = new javax.swing.JLabel();
        cajaClave = new javax.swing.JTextField();
        etiquetaNombre = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        etiquetaDomicilio = new javax.swing.JLabel();
        cajaDomicilio = new javax.swing.JTextField();
        etiquetaCelular = new javax.swing.JLabel();
        cajaCelular = new javax.swing.JTextField();
        etiquetaCorreoElectronico = new javax.swing.JLabel();
        cajaCorreoElectronico = new javax.swing.JTextField();
        etiquetaFechaDeNacimiento = new javax.swing.JLabel();
        cajaFechaDeNacimiento = new javax.swing.JTextField();
        etiquetaGenero = new javax.swing.JLabel();
        comboBoxGenero = new javax.swing.JComboBox<>();
        botonInsertar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        etiquetaClave.setText("Clave");

        etiquetaNombre.setText("Nombre");

        etiquetaDomicilio.setText("Domicilio");

        etiquetaCelular.setText("Celular");

        etiquetaCorreoElectronico.setText("Correo electrónico");

        etiquetaFechaDeNacimiento.setText("Fecha de nacimiento");

        etiquetaGenero.setText("Género");

        comboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));

        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");

        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(etiquetaNombre)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaDomicilio)
                            .addComponent(etiquetaClave)
                            .addComponent(etiquetaCelular))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cajaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(cajaClave))
                        .addGap(24, 24, 24))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cajaDomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(cajaCelular))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cajaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonBuscar)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(botonModificar)
                                .addGap(36, 36, 36)
                                .addComponent(botonEliminar)
                                .addGap(36, 36, 36)
                                .addComponent(botonLimpiar)))
                        .addGap(16, 16, 16))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(botonInsertar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addComponent(etiquetaCorreoElectronico)
                        .addGap(26, 26, 26)
                        .addComponent(cajaCorreoElectronico))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaFechaDeNacimiento)
                            .addComponent(etiquetaGenero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaFechaDeNacimiento)
                            .addComponent(comboBoxGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBuscar)
                    .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cajaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaClave)
                    .addComponent(cajaClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaDomicilio)
                    .addComponent(cajaDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCelular)
                    .addComponent(cajaCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCorreoElectronico)
                    .addComponent(cajaCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaFechaDeNacimiento)
                    .addComponent(cajaFechaDeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaGenero)
                    .addComponent(comboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInsertar)
                    .addComponent(botonModificar)
                    .addComponent(botonEliminar)
                    .addComponent(botonLimpiar))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        
        Connection conexion = null;
        
        try {
            conexion = getConnection();
            ps = conexion.prepareStatement("insert into persona (clave,nombre,domicilio,celular,correo_electronico,fecha_nacimiento,genero) values (?,?,?,?,?,?,?)");
            ps.setString(1, cajaClave.getText());
            ps.setString(2, cajaNombre.getText());
            ps.setString(3, cajaDomicilio.getText());
            ps.setString(4, cajaCelular.getText());
            ps.setString(5, cajaCorreoElectronico.getText());

            // Obtener el String de la fecha de la caja de texto
            String fechaTexto = cajaFechaDeNacimiento.getText();
            // Convertir el String de fecha a un objeto Date
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy"); // Ajusta el formato según tu entrada
            java.util.Date fechaUtil = formato.parse(fechaTexto);
            java.sql.Date fechaNacimiento = new java.sql.Date(fechaUtil.getTime());
            // Insertar el objeto Date en la base de datos
            ps.setDate(6, fechaNacimiento);

            // Continuamos con el dato genero.
            ps.setString(7, comboBoxGenero.getSelectedItem().toString());
            
            // Ejecutamos la insercion dentro de la base de datos.
            int resultado = ps.executeUpdate();
            
            if(resultado > 0){
                JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
                limpiarCajas();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al insertar el registro");
                limpiarCajas();
            }
            
            // Cerramos la conexión con la base de datos.
            conexion.close();
        
        } catch (Exception ex) {
            System.err.println("Error: "+ex);
        }
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // Inicializamos la conexion a la DB.
        Connection conexion = null;
        
        try {
            conexion = getConnection();
            ps = conexion.prepareStatement("select * from persona where clave=?");
            ps.setString(1,cajaBuscar.getText());
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                cajaID.setText(String.valueOf(rs.getInt("idPersona")));
                cajaClave.setText(rs.getString("clave"));
                cajaNombre.setText(rs.getString("nombre"));
                cajaDomicilio.setText(rs.getString("domicilio"));
                cajaCelular.setText(rs.getString("celular"));
                cajaCorreoElectronico.setText(rs.getString("correo_electronico"));
                cajaFechaDeNacimiento.setText(String.valueOf(rs.getDate("fecha_nacimiento")));
                comboBoxGenero.setSelectedItem(rs.getString("genero"));
            }
            else{
                JOptionPane.showMessageDialog(null, "No existe una persona con esa clave");
            }
            conexion.close();
            
        } catch (Exception e) {
            System.err.println("Error: "+e);
        }
        
        
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        
        Connection conexion = null;
        
        try {
            conexion = getConnection();
            
            // Cambiamos a delete para eliminar el registro.
            ps = conexion.prepareStatement("delete from persona where idPersona=?");
            ps.setInt(1, Integer.parseInt(cajaID.getText()));
            
            
            // Ejecutamos la eliminación.
            int resultado = ps.executeUpdate();
            
            
            if(resultado > 0){
                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
                limpiarCajas();
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
                limpiarCajas();
            }
            
            // Cerramos la conexión con la base de datos.
            conexion.close();
        
        } catch (Exception ex) {
            System.err.println("Error: "+ex);
        }
        
        
        
    }//GEN-LAST:event_botonModificarActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Persona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField cajaBuscar;
    private javax.swing.JTextField cajaCelular;
    private javax.swing.JTextField cajaClave;
    private javax.swing.JTextField cajaCorreoElectronico;
    private javax.swing.JTextField cajaDomicilio;
    private javax.swing.JTextField cajaFechaDeNacimiento;
    private javax.swing.JTextField cajaID;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JComboBox<String> comboBoxGenero;
    private javax.swing.JLabel etiquetaCelular;
    private javax.swing.JLabel etiquetaClave;
    private javax.swing.JLabel etiquetaCorreoElectronico;
    private javax.swing.JLabel etiquetaDomicilio;
    private javax.swing.JLabel etiquetaFechaDeNacimiento;
    private javax.swing.JLabel etiquetaGenero;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}