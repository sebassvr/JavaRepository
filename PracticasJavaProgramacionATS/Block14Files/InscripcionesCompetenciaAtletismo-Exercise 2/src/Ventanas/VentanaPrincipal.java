// KAPITEL 15, 16, 17, 18, 19
// 15. Ejercicio 2 - Inscripciones a una competencia de atletismo (Explicación)
// 16. Ejercicio 2 - Inscripciones a una competencia de atletismo (parte 1)
// 17. Ejercicio 2 - Inscripciones a una competencia de atletismo (parte 2)
// 18. Ejercicio 2 - Inscripciones a una competencia de atletismo (parte 3)
// 19. Ejercicio 2 - Inscripciones a una competencia de atletismo (parte 4)

// Ventana 625x425
/**
 *
 * @author sebassvr
 */
package Ventanas;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class VentanaPrincipal extends javax.swing.JFrame {
    Atleta atleta;
    
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    // PARA CREAR EL ARCHIVO EN CASO DE QUE NO ESTE CREADO.
    // PARA ESCRIBIR EN EL ARCHIVO BINARIO.
//    private void escribirBinario(String nombre, String edad, String peso, String estatura){
//        // Instanciamos el archivo si no esta creado todavia.
//        try {
//            FileOutputStream archivo = new FileOutputStream("atletas.bin");
//            // Para escribir.
//            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
//            
//            // Instanciamos un objeto de persona.
//            Atleta atleta1  = new Atleta(nombre, edad, peso, estatura);
//            // Escribimos objetos sobre el archivo binario.
//            escritura.writeObject(atleta1);
//            escritura.close();
//            
//        } catch (FileNotFoundException ex) {
//            System.err.println("Error: "+ex);
//        } catch (IOException ex) {
//            System.err.println("Error: "+ex);
//        }
//    }
    
    // PARA AÑADIR CONTENIDO AL ARCHIVO BINARIO.
    private void añadirBinario(String nombre, String edad, String peso, String estatura){
        Atleta atletas;
        // Instanciamos el archivo si no esta creado todavia.
        try {
            FileOutputStream archivo = new FileOutputStream("atletas.bin",true);
            // Para escribir.
            AñadirBinario escritura = new AñadirBinario(archivo);
            // Instanciamos un objeto de persona.
            atletas = new Atleta(nombre, edad, peso, estatura);
            // Escribimos objetos sobre el archivo binario.
            escritura.writeObject(atletas);
            // Cerramos el archivo.
            escritura.close();
            
        } catch (FileNotFoundException ex) {
            System.err.println("Error: "+ex);
        } catch (IOException ex) {
            System.err.println("Error: "+ex);
        }
    }
    
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaEdad = new javax.swing.JLabel();
        etiquetaPeso = new javax.swing.JLabel();
        etiquetaEstatura = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        textFieldEdad = new javax.swing.JTextField();
        textFieldPeso = new javax.swing.JTextField();
        textFieldEstatura = new javax.swing.JTextField();
        bontoRegistrarAtleta = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        opcionMenu = new javax.swing.JMenu();
        menuMostrarAtletasRegistrados = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(0, 153, 153));

        etiquetaTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 32)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText("REGISTRO");

        etiquetaNombre.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        etiquetaNombre.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaNombre.setText("Nombre:");

        etiquetaEdad.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        etiquetaEdad.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaEdad.setText("Edad:");

        etiquetaPeso.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        etiquetaPeso.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaPeso.setText("Peso (kg):");

        etiquetaEstatura.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        etiquetaEstatura.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaEstatura.setText("Estatura (cm):");

        textFieldNombre.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        textFieldEdad.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        textFieldPeso.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        textFieldEstatura.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        bontoRegistrarAtleta.setBackground(new java.awt.Color(0, 0, 0));
        bontoRegistrarAtleta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        bontoRegistrarAtleta.setForeground(new java.awt.Color(255, 255, 255));
        bontoRegistrarAtleta.setText("REGISTRAR ATLETA");
        bontoRegistrarAtleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bontoRegistrarAtletaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaNombre)
                    .addComponent(etiquetaEdad)
                    .addComponent(etiquetaPeso)
                    .addComponent(etiquetaEstatura))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bontoRegistrarAtleta)
                .addGap(160, 160, 160))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(etiquetaTitulo)
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaEdad)
                    .addComponent(textFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaPeso)
                    .addComponent(textFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaEstatura)
                    .addComponent(textFieldEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(bontoRegistrarAtleta)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        menuBar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        opcionMenu.setText("Menú");
        opcionMenu.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        menuMostrarAtletasRegistrados.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        menuMostrarAtletasRegistrados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atletaIcon.png"))); // NOI18N
        menuMostrarAtletasRegistrados.setText("Mostrar Atletas Registrados");
        menuMostrarAtletasRegistrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMostrarAtletasRegistradosActionPerformed(evt);
            }
        });
        opcionMenu.add(menuMostrarAtletasRegistrados);

        menuSalir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salirIcon.png"))); // NOI18N
        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        opcionMenu.add(menuSalir);

        menuBar.add(opcionMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bontoRegistrarAtletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bontoRegistrarAtletaActionPerformed
        // Creamos la varibles para agregar los datos.
        String nombre, edad, peso, estatura;

        nombre = textFieldNombre.getText();
        edad = textFieldEdad.getText();
        peso = textFieldPeso.getText();
        estatura = textFieldEstatura.getText();
        
        if (!nombre.isEmpty() && !edad.isEmpty() && !peso.isEmpty() && !estatura.isEmpty()) {
                // Llamamos a la funcion y mandamos los parametros para que se realice la acción de agregar los datos a los archivos binarios.
                añadirBinario(nombre, edad, peso, estatura);

                // Vaciamos los texto.
                textFieldNombre.setText("");
                textFieldEdad.setText("");
                textFieldPeso.setText("");
                textFieldEstatura.setText("");
        }
    }//GEN-LAST:event_bontoRegistrarAtletaActionPerformed

    private void menuMostrarAtletasRegistradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMostrarAtletasRegistradosActionPerformed
        VentanaMostrarAtletas vMostrarAtletas = new VentanaMostrarAtletas(this, true);
        vMostrarAtletas.setVisible(true);
    }//GEN-LAST:event_menuMostrarAtletasRegistradosActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bontoRegistrarAtleta;
    private javax.swing.JLabel etiquetaEdad;
    private javax.swing.JLabel etiquetaEstatura;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaPeso;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuMostrarAtletasRegistrados;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenu opcionMenu;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField textFieldEdad;
    private javax.swing.JTextField textFieldEstatura;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldPeso;
    // End of variables declaration//GEN-END:variables
}
