package interfazlogin;


public class VentanaLogin extends javax.swing.JFrame {

    public VentanaLogin() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaLogin = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();
        iconLogin = new javax.swing.JLabel();
        miniPasswordIcon = new javax.swing.JLabel();
        separatorPassword = new javax.swing.JSeparator();
        separatorUser = new javax.swing.JSeparator();
        miniUserIcon = new javax.swing.JLabel();
        textUser = new javax.swing.JTextField();
        textPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        subBackgroundLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ventanaLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitButton.setBackground(new java.awt.Color(0, 41, 73));
        exitButton.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("Leave");
        exitButton.setToolTipText("");
        exitButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        ventanaLogin.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 60, 30));

        iconLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/iconLogin2.png"))); // NOI18N
        iconLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ventanaLogin.add(iconLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        miniPasswordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/miniPasswordIcon.png"))); // NOI18N
        ventanaLogin.add(miniPasswordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        separatorPassword.setForeground(new java.awt.Color(255, 255, 255));
        ventanaLogin.add(separatorPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 260, -1));

        separatorUser.setForeground(new java.awt.Color(255, 255, 255));
        ventanaLogin.add(separatorUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 260, -1));

        miniUserIcon.setForeground(new java.awt.Color(255, 255, 255));
        miniUserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/miniUserIcon.png"))); // NOI18N
        ventanaLogin.add(miniUserIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        textUser.setText("Usuario");
        textUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUserActionPerformed(evt);
            }
        });
        ventanaLogin.add(textUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 220, -1));

        textPassword.setText("Password");
        ventanaLogin.add(textPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 220, -1));

        jButton1.setBackground(new java.awt.Color(0, 193, 183));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGIN");
        ventanaLogin.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 260, 50));

        subBackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/subFondoLogin.png"))); // NOI18N
        ventanaLogin.add(subBackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, 330));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/fondoLogin.png"))); // NOI18N
        ventanaLogin.add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void textUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUserActionPerformed


    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel iconLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel miniPasswordIcon;
    private javax.swing.JLabel miniUserIcon;
    private javax.swing.JSeparator separatorPassword;
    private javax.swing.JSeparator separatorUser;
    private javax.swing.JLabel subBackgroundLabel;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JTextField textUser;
    private javax.swing.JPanel ventanaLogin;
    // End of variables declaration//GEN-END:variables

}
