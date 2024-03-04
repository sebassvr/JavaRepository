/**
 * @author sebassvr
 */
package graficasdebarrasporcentual;

import java.awt.Color;
import java.awt.Graphics;

public class GraficaDeBarrasPorcentual extends javax.swing.JFrame {
    
    
    public GraficaDeBarrasPorcentual() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    boolean bandera = false;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textFieldRojo = new javax.swing.JTextField();
        textFieldVerde = new javax.swing.JTextField();
        textFieldAzul = new javax.swing.JTextField();
        botonGraficar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Azul:");

        jLabel4.setText("Rojo:");

        jLabel3.setText("Verde:");

        botonGraficar.setText("Gráficar");
        botonGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGraficarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel5.setText("Colores Favoritos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldAzul)
                            .addComponent(textFieldVerde)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldRojo)))))
                .addGap(96, 96, 96)
                .addComponent(botonGraficar)
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textFieldRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textFieldVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGraficar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGraficarActionPerformed
        bandera = true;
        repaint();
    }//GEN-LAST:event_botonGraficarActionPerformed

    
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
            java.util.logging.Logger.getLogger(GraficaDeBarrasPorcentual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficaDeBarrasPorcentual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficaDeBarrasPorcentual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficaDeBarrasPorcentual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficaDeBarrasPorcentual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGraficar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField textFieldAzul;
    private javax.swing.JTextField textFieldRojo;
    private javax.swing.JTextField textFieldVerde;
    // End of variables declaration//GEN-END:variables

    // Método para saber cual es el valor mayor.
    public int MayorValor(int valor_rojo, int valor_verde, int valor_azul) {
        if (valor_rojo > valor_verde && valor_rojo > valor_azul) {
            return valor_rojo;
        } else if (valor_verde > valor_azul) {
            return valor_verde;
        } else {
            return valor_azul;
        }
    }
    
    
    
    // Dibujamos el gráfico
    @Override
    public void paint(Graphics g){
        super.paint(g);
        if (bandera == true) {
            
        
            // Obtenemos los el texto de los textFields.
            String txtRojo = textFieldRojo.getText();
            String txtVerde = textFieldVerde.getText();
            String txtAzul = textFieldAzul.getText();
        
            // Transformamos los string a enteros.
            int intRojo = Integer.parseInt(txtRojo);
            int intVerde = Integer.parseInt(txtVerde);
            int intAzul = Integer.parseInt(txtAzul);
        
            // Sumamos todos los datos.
            int Total = intRojo + intVerde + intAzul;
            
            // Sacamos la distribucion de la barra
            int largoRojo = intRojo * 400 / Total;
            int largoVerde = intVerde * 400 / Total;
            int largoAzul = intAzul * 400 / Total;
            
            // Sacamos los porcentajes sobre 100%
            int porcentajeRojo = intRojo * 100 / Total;
            int porcentajeVerde = intVerde * 100 / Total;
            int porcentajeAzul = intAzul * 100 / Total;
           
            // Dibujamos la barra
            // Dibujamos la parte Rojo.
            g.setColor(new Color(255,0,0));
            g.fillRect(50, 120, largoRojo, 50);
            g.setColor(new Color(255,255,255));
            g.drawString(porcentajeRojo+"%", 55, 140);
            
            //Dibujamos la parte Verde.
            g.setColor(new Color(0,130,0));
            g.fillRect(50+largoRojo, 120, largoVerde, 50);
            g.setColor(new Color(255,255,255));
            g.drawString(porcentajeVerde+"%", 55+largoRojo, 140);
            
            //Dibujamos la parte Azul.
            g.setColor(new Color(0,0,255));
            g.fillRect(50+largoRojo+largoVerde, 120, largoAzul, 50);
            g.setColor(new Color(255,255,255));
            g.drawString(porcentajeAzul+"%", 55+largoRojo+largoVerde, 140);
            
            
        }
        
        
        
        
        
        
    }

} // FIN
