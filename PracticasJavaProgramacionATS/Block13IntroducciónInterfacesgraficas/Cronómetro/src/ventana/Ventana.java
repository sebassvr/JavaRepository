
package ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class Ventana extends javax.swing.JFrame {
    private Timer tiempo;
    private int centesimaSegundos = 0, segundos = 0, minutos = 0, horas = 0;
    
    // Implementamos las acciones de la clase Timer.
    private ActionListener acciones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            centesimaSegundos++;
            if (centesimaSegundos == 100) {
                segundos++;
                centesimaSegundos = 0;
            }
            if (segundos == 60) {
                minutos++;
                segundos = 0;
            }
            if (minutos == 60) {
                horas++;
                minutos = 0;
            }
            actualizarEtiquetaTiempo();
        }
    };      
    
    // Actualizamos la etiqueta tiempo y agregamos un condicional para que aparezca el 0 cuando sea menor a 9;
    private void actualizarEtiquetaTiempo(){
        String texto = (horas<=9?"0":"")+horas+":"+(minutos<=9?"0":"")+minutos+":"+(segundos<=9?"0":"")+segundos+":"+(centesimaSegundos<=9?"0":"")+centesimaSegundos;
        etiquetaTiempo.setText(texto);
    }
    
    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Cronómetro");
        tiempo = new Timer(10, acciones);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        imagenCronometro = new javax.swing.JLabel();
        textCronometro = new javax.swing.JLabel();
        etiquetaTiempo = new javax.swing.JLabel();
        botonIniciar = new javax.swing.JButton();
        botonPausar = new javax.swing.JButton();
        botonDetener = new javax.swing.JButton();
        etiquetaFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagenCronometro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cronometro3.png"))); // NOI18N
        panel.add(imagenCronometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        textCronometro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 33)); // NOI18N
        textCronometro.setForeground(new java.awt.Color(204, 255, 255));
        textCronometro.setText("Cronómetro");
        panel.add(textCronometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        etiquetaTiempo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        etiquetaTiempo.setForeground(new java.awt.Color(255, 204, 204));
        etiquetaTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTiempo.setText("00:00:00:00");
        panel.add(etiquetaTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 290, -1));

        botonIniciar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        botonIniciar.setText("INICIAR");
        botonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarActionPerformed(evt);
            }
        });
        panel.add(botonIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 180, 110, 30));

        botonPausar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        botonPausar.setText("PAUSAR");
        botonPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPausarActionPerformed(evt);
            }
        });
        panel.add(botonPausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 110, 30));

        botonDetener.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        botonDetener.setText("DETENER");
        botonDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDetenerActionPerformed(evt);
            }
        });
        panel.add(botonDetener, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 180, 110, 30));

        etiquetaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoCronometro.png"))); // NOI18N
        panel.add(etiquetaFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 250));

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

    private void botonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarActionPerformed
        tiempo.start();
        botonIniciar.setEnabled(false);
        botonIniciar.setText("REANUDAR");
        botonPausar.setEnabled(true);
        botonDetener.setEnabled(true);
    }//GEN-LAST:event_botonIniciarActionPerformed

    private void botonPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPausarActionPerformed
        tiempo.stop();
        botonPausar.setEnabled(false);
        botonIniciar.setEnabled(true);
    }//GEN-LAST:event_botonPausarActionPerformed

    private void botonDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDetenerActionPerformed
        if (tiempo.isRunning()) {
            tiempo.stop();
            botonIniciar.setEnabled(true);
        }
        botonIniciar.setText("INICIAR");
        botonPausar.setEnabled(false);
        botonDetener.setEnabled(false);
        centesimaSegundos = 0;
        segundos = 0;
        minutos = 0;
        horas = 0;
        actualizarEtiquetaTiempo();
    }//GEN-LAST:event_botonDetenerActionPerformed

    
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDetener;
    private javax.swing.JButton botonIniciar;
    private javax.swing.JButton botonPausar;
    private javax.swing.JLabel etiquetaFondo;
    private javax.swing.JLabel etiquetaTiempo;
    private javax.swing.JLabel imagenCronometro;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel textCronometro;
    // End of variables declaration//GEN-END:variables
}
