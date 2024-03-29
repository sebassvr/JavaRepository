// VIDEO 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98
// Proyecto Final del bloque 13 Interfaces.
// Tres en Raya. VentanaInicio.

package TresEnRaya;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author sebassvr
 */
public class VentanaInicio extends javax.swing.JFrame {
    private String usuario1;
    private String usuario2;
    private String turno1 = "";
    private String turno2 = "";
    //Getters and Setters.

    public String getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(String usuario1) {
        this.usuario1 = usuario1;
    }

    public String getUsuario2() {
        return usuario2;
    }

    public void setUsuario2(String usuario2) {
        this.usuario2 = usuario2;
    }

    public String getTurno1() {
        return turno1;
    }

    public void setTurno1(String turno1) {
        this.turno1 = turno1;
    }

    public String getTurno2() {
        return turno2;
    }

    public void setTurno2(String turno2) {
        this.turno2 = turno2;
    }
    // Fin Getters and Setters.
    
    
    
    
    
    /**
     * Creates new form VentanaInicio
     */
    public VentanaInicio() {
        initComponents();
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        establecerUsuarios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInicio = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaUsuario1 = new javax.swing.JLabel();
        etiquetaUsuario2 = new javax.swing.JLabel();
        textoUsuario2 = new javax.swing.JTextField();
        textoUsuario1 = new javax.swing.JTextField();
        gifTresenRaya = new javax.swing.JLabel();
        botonIniciarJuego = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        panelInicio.setBackground(new java.awt.Color(255, 255, 255));
        panelInicio.setPreferredSize(new java.awt.Dimension(800, 600));
        panelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesTresEnRaya/tituloTresenRaya.png"))); // NOI18N
        panelInicio.add(etiquetaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        etiquetaUsuario1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        etiquetaUsuario1.setText("Usuario1:");
        panelInicio.add(etiquetaUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 130, 40));

        etiquetaUsuario2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        etiquetaUsuario2.setText("Usuario2:");
        panelInicio.add(etiquetaUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 130, 40));

        textoUsuario2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        panelInicio.add(textoUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 480, 40));

        textoUsuario1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        panelInicio.add(textoUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 480, 40));

        gifTresenRaya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesTresEnRaya/tresEnRaya.gif"))); // NOI18N
        panelInicio.add(gifTresenRaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, -1, -1));

        botonIniciarJuego.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        botonIniciarJuego.setText("START GAME");
        botonIniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarJuegoActionPerformed(evt);
            }
        });
        panelInicio.add(botonIniciarJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarJuegoActionPerformed
        // Accion cuando se presione el botonIniciar.
        // Esta función automaticamente nos selecciona y muestra el turno1 y turno2.
        
        establecerUsuarios();
        if (!usuario1.isEmpty() && !usuario2.isEmpty()) {
            obtenerTurnoYMostrarlo();
            System.out.println("Usuario1: "+usuario1);
            System.out.println("Usuario2: "+usuario2);
            VentanaJuego ventanaJuego = new VentanaJuego(turno1,turno2);
            ventanaJuego.setVisible(true);
            dispose();
        } 
        // Mostrar un cuadro de diálogo de advertencia, en caso de que los usuario no han ingresado uno de los 2 usuarios o ninguno.
        else{
            JOptionPane.showMessageDialog(null, "Ingrese los usuarios", "", JOptionPane.WARNING_MESSAGE);
        }
        
        
        
        
    }//GEN-LAST:event_botonIniciarJuegoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the look and feel */
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciarJuego;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel etiquetaUsuario1;
    private javax.swing.JLabel etiquetaUsuario2;
    private javax.swing.JLabel gifTresenRaya;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JTextField textoUsuario1;
    private javax.swing.JTextField textoUsuario2;
    // End of variables declaration//GEN-END:variables

    private void establecerUsuarios(){
        setUsuario1(textoUsuario1.getText());
        setUsuario2(textoUsuario2.getText());
    }
    /*
        obtenerTurno();
        Este es un metodo para obtener quien sera el primer turno
        y por lo tanto usara X.
        El que no salga seleccionado sera el segundo turno y usara
        el O.
    */
    private void obtenerTurnoYMostrarlo() {
        // Crear una instancia de la clase Random
        Random random = new Random();
        // Generar un número aleatorio entre 0 y 1
        int randomNumber = random.nextInt(2);
        // Determinar el usuario según el número aleatorio generado
        if (randomNumber == 0) {
            turno1 = usuario1;
            turno2 = usuario2;
        } else {
            turno1 = usuario2;
            turno2 = usuario1;
        }
        // Mostramos en la etiqueta los turnos.
        JOptionPane.showMessageDialog(null, "Turno 1: " + turno1+"\n\t Ficha: Azul");
        JOptionPane.showMessageDialog(null, "Turno 2: " + turno2+"\n\t Ficha: Café");
    }
    
    
    
    
    
}
