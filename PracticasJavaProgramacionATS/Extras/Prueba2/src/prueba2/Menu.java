/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prueba2;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Menu extends javax.swing.JFrame {
    private DefaultTableModel modelTablePets = new DefaultTableModel();
    private DefaultTableModel modelTablePersons = new DefaultTableModel();
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        ModelTablePersonsFill();
        ModelTablePetsFill();
    }
    
    public void ModelTablePetsFill(){
            // Agregar columnas.
        modelTablePets.addColumn("Numero");
        modelTablePets.addColumn("Nombre");
        modelTablePets.addColumn("Tipo");
        modelTablePets.addColumn("Raza");
        modelTablePets.addColumn("Color");
        
        // Leer archivo.
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("dataPets.txt");
            br = new BufferedReader(fr);
            
            String linea;
            int i=0;
            while((linea = br.readLine()) != null){
                String arreglo[] = linea.split(";");
                modelTablePets.addRow(arreglo);
            }
            
            
        } catch (Exception ex) {
            System.out.println("Error E/O "+ex);
        }
    }
    
    public void ModelTablePersonsFill(){
    // Agregar columnas.
        modelTablePersons.addColumn("Cedula");
        modelTablePersons.addColumn("Nombre");
        modelTablePersons.addColumn("Apellido");
        modelTablePersons.addColumn("FNacimiento");
        
        // Leer archivo.
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("dataPersons.txt");
            br = new BufferedReader(fr);
            
            String linea;
            int i=0;
            while((linea = br.readLine()) != null){
                String arreglo[] = linea.split(";");
                modelTablePersons.addRow(arreglo);
            }
            
            
        } catch (Exception ex) {
            System.out.println("Error E/O "+ex);
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        buttonPersons = new javax.swing.JButton();
        buttonPets = new javax.swing.JButton();
        etiquetaDescrip = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        buttonPersons.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonPersons.setText("Persons");
        buttonPersons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPersonsActionPerformed(evt);
            }
        });

        buttonPets.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonPets.setText("Pets");
        buttonPets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPetsActionPerformed(evt);
            }
        });

        etiquetaDescrip.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        etiquetaDescrip.setText("PRESS A BUTTON");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(buttonPersons)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonPets)
                .addGap(130, 130, 130))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(291, Short.MAX_VALUE)
                .addComponent(etiquetaDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPersons)
                    .addComponent(buttonPets))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPetsActionPerformed
    // Acción del botón Pets.
        table.setModel(modelTablePets);
    }//GEN-LAST:event_buttonPetsActionPerformed

    private void buttonPersonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPersonsActionPerformed
        // Acción del botón Pets.
        table.setModel(modelTablePersons);
        
    }//GEN-LAST:event_buttonPersonsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPersons;
    private javax.swing.JButton buttonPets;
    private javax.swing.JLabel etiquetaDescrip;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
