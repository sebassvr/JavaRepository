// 775x380
package Ventanas;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sebassvr
 */
public class VentanaMostrarAtletas extends javax.swing.JDialog {
    DefaultTableModel modeloTabla = new DefaultTableModel();

    public VentanaMostrarAtletas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        rellenarTabla();
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    //Rellenar la tabla.
    private void rellenarTabla(){
        String partesObjecto[];
        // Creamos un objeto persona para leer el archivo que contiene objetos.
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Edad");
        modeloTabla.addColumn("Peso");
        modeloTabla.addColumn("Estatura");
        
        
        try (FileInputStream archivo = new FileInputStream("atletas.bin");
             ObjectInputStream lectura = new ObjectInputStream(archivo)) {
            
            while(true){
                Atleta objetoPersona = (Atleta) lectura.readObject();
                modeloTabla.addRow(new Object[]{objetoPersona.getNombre(), objetoPersona.getEdad(), objetoPersona.getPeso(), objetoPersona.getEstatura()});
            }
        } catch (EOFException ex) {
            return; // Se llego al final del archivo.
            // Finalización de lectura del archivo
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        
        
        
        
    }
    
    // PARA LEER BINARIOS.
    private void leerBinario(){
        // Creamos un objeto persona para leer el archivo que contiene objetos.
        Atleta objetoPersona;
        try {
            FileInputStream archivo = new FileInputStream("personas.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            
            while(true){ // Recorremos el archivo binario.
                objetoPersona = (Atleta)lectura.readObject();
            } 
            
        }catch(EOFException ex){
            return; // Excepción cuando finaliza de leer de todo el archivo binario.
        } catch (FileNotFoundException ex) {
            System.err.println("Error: "+ex);
        } catch (IOException ex) {
            System.err.println("Error: "+ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("Error: "+ex);
        }
    
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMostrarAtletas = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMostrarDatos = new javax.swing.JTable();
        botonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelMostrarAtletas.setBackground(new java.awt.Color(0, 153, 153));

        etiquetaTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo.setText("Atletas Registrados");

        tablaMostrarDatos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tablaMostrarDatos.setModel(modeloTabla);
        jScrollPane1.setViewportView(tablaMostrarDatos);

        botonRegresar.setBackground(new java.awt.Color(0, 0, 0));
        botonRegresar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresar.setText("REGRESAR");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMostrarAtletasLayout = new javax.swing.GroupLayout(panelMostrarAtletas);
        panelMostrarAtletas.setLayout(panelMostrarAtletasLayout);
        panelMostrarAtletasLayout.setHorizontalGroup(
            panelMostrarAtletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarAtletasLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(etiquetaTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelMostrarAtletasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMostrarAtletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMostrarAtletasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonRegresar)))
                .addContainerGap())
        );
        panelMostrarAtletasLayout.setVerticalGroup(
            panelMostrarAtletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMostrarAtletasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTitulo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonRegresar)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMostrarAtletas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMostrarAtletas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed


    
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
            java.util.logging.Logger.getLogger(VentanaMostrarAtletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarAtletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarAtletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarAtletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaMostrarAtletas dialog = new VentanaMostrarAtletas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelMostrarAtletas;
    private javax.swing.JTable tablaMostrarDatos;
    // End of variables declaration//GEN-END:variables
}
