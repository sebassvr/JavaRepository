/**
 * @author sebassvr
 */
package graficasdebarras;

import java.awt.Color;
import java.awt.Graphics;

public class GraficaDeBarras extends javax.swing.JFrame {

    /**
     * Creates new form GraficaDeBarras
     */
    public GraficaDeBarras() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    boolean bandera = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_rojo = new javax.swing.JTextField();
        txt_verde = new javax.swing.JTextField();
        txt_azul = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel1.setText("Color Favorito");

        jLabel2.setText("Azul:");

        jLabel3.setText("Verde:");

        jLabel4.setText("Rojo:");

        jButton1.setText("Gráficar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_azul, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_verde, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(txt_rojo))
                                .addGap(124, 124, 124)
                                .addComponent(jButton1)))))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_rojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_verde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        bandera = true;
        repaint();


    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GraficaDeBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficaDeBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficaDeBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficaDeBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficaDeBarras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_azul;
    private javax.swing.JTextField txt_rojo;
    private javax.swing.JTextField txt_verde;
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

    // Método para gráficar.
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (bandera == true) {
            
            // Receptamos los valores de los textfields y guardamos en unas variables Strings.
            String string_rojo = txt_rojo.getText();
            String string_verde = txt_verde.getText();
            String string_azul = txt_azul.getText();
        
            // Transformamos los valores a enteros.
            int int_rojo = Integer.parseInt(string_rojo);
            int int_verde = Integer.parseInt(string_verde);
            int int_azul = Integer.parseInt(string_azul);
            
            // Usamos el método para saber cual es valor mayor.
            int valor_Mayor = MayorValor(int_rojo, int_verde, int_azul);
            
            // Ahora hacemos que calcule el largo de las barras.
            
            // Calcular largo Rojo.
            int largo_Rojo = int_rojo * 400 / valor_Mayor;
            
            //Calcular largo Verde.
            int largo_Verde = int_verde * 400 / valor_Mayor;
            
            //Calcular largo Azul.
            int largo_Azul = int_azul * 400 / valor_Mayor;
            
            // Ahora graficamos.
            // Grafica Rojo
            g.setColor(new Color(255,0,0));
            g.fillRect(100, 100, largo_Rojo, 40);
            g.drawString("Color Rojo", 10, 125);
            
            // Grafica Verde
            g.setColor(new Color(0,130,0));
            g.fillRect(100, 150, largo_Verde, 40);
            g.drawString("Color Verde", 10, 175);
            
            // Grafica Azul
            g.setColor(new Color(0,0,255));
            g.fillRect(100, 200, largo_Azul, 40);
            g.drawString("Color Azul", 10, 225);
            
            
            
        }
        
        
        
        
    }

}
