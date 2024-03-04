// VIDEO 48 - 49 - 50- 51
// 48_Ejercicio_4_Interfaz_para_un_grupo_de_personas_parte_1_2_3_4
// +VIDEO 71
// 71. Estilos de Ventana (LookAndFeel)
// +VIDEO 72
// 72. Descargar más estilos de Ventana (LookAndFeel)


import java.awt.Dimension;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;


public class Ventana extends javax.swing.JFrame {

    private DefaultComboBoxModel<Persona> modelo = new DefaultComboBoxModel<Persona>();
    private DefaultTableModel modeloTabla = new DefaultTableModel();
    
    
    
    public Ventana() {
        llenarModeloComboBox();
        agregarModeloTabla();
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Exercise 4");
        this.setMinimumSize(new Dimension(this.getWidth(),this.getHeight()));
    }
    private void agregarModeloTabla(){
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellidos");
        modeloTabla.addColumn("Email");
        modeloTabla.addColumn("Celular");
        modeloTabla.addColumn("Dirección");
    }
    
    private void llenarModeloComboBox(){
        modelo.addElement(new Persona("Jennifer","Alcivar Nina","jennycitap@hotmail.com","2897528935932","Cotopaxi"));
        modelo.addElement(new Persona("Sebastian","Valverde Riera","sebas.20022@hotmail.com","41973553","Quevedo"));           
        modelo.addElement(new Persona("Bryan","Valverde Riera","bryan.202@hotmail.com","2973553","Quevedo"));
        modelo.addElement(new Persona("Pepito","Kilo Kilo","pepito.g@hotmail.com","03934274","Quito"));
        modelo.addElement(new Persona("Viel","Ambar Tool","ambar.4@hotmail.com","058483345","Ambato"));
        modelo.addElement(new Persona("Coco","Tinto Rojo","guajw.20202@hotmail.com","3948933","Guayaquil"));
        modelo.addElement(new Persona("Jose","Alcivar Plot","Jose.52@hotmail.com","9046893467","Tungurahua"));
        modelo.addElement(new Persona("Rayo","Lamborgini Lol","rayo.777@hotmail.com","5754353","Quevedo"));            
        modelo.addElement(new Persona("Carlos","Arroyo Minda","bryan.202@hotmail.com","8923758","Esmeraldas"));
        modelo.addElement(new Persona("Gref","Quint Pol","pepito.g@hotmail.com","293578923","Loja"));
        modelo.addElement(new Persona("Videl","Martinez Cucci","ambar.4@hotmail.com","09192741","Latacunga"));
        modelo.addElement(new Persona("Robert","Dog Jull","guajw.20202@hotmail.com","289497257","Guaranda"));
        modelo.addElement(new Persona("Paint","Jolty Dowm","Jose.52@hotmail.com","214819491","Manabi"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        etiquetaPersona = new javax.swing.JLabel();
        comboPersonas = new javax.swing.JComboBox<>();
        botonInsertar = new javax.swing.JButton();
        scrollTabla = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        // Oyente de Seleccion para que nos diga cuando seleccionamos una opcion.
        ListSelectionListener oyenteSeleccion = new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e){
                if(e.getValueIsAdjusting()){ // Ajustamos el oyente para que no sea multiple.
                    int filaSeleccionada = tabla.getSelectedRow(); // Guardamos la fila que seleccione el usuario.

                    // Para obtener los datos, dando row and column. Y guardamos en variables tipo String.
                    String nombres = (String)modeloTabla.getValueAt(filaSeleccionada,0);
                    String apellidos = (String)modeloTabla.getValueAt(filaSeleccionada,1);
                    String email = (String)modeloTabla.getValueAt(filaSeleccionada,2);
                    String celular = (String)modeloTabla.getValueAt(filaSeleccionada,3);
                    String direccion = (String)modeloTabla.getValueAt(filaSeleccionada,4);

                    // Establecemos el texto.
                    cajaNombre.setText(nombres);
                    cajaApellidos.setText(apellidos);
                    cajaEmail.setText(email);
                    cajaCelular.setText(celular);
                    cajaDireccion.setText(direccion);
                } 
            }
        };tabla.getSelectionModel().addListSelectionListener(oyenteSeleccion);
        separador = new javax.swing.JSeparator();
        etiquetaDatos = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        etiquetaApellidos = new javax.swing.JLabel();
        cajaApellidos = new javax.swing.JTextField();
        etiquetaEmail = new javax.swing.JLabel();
        cajaEmail = new javax.swing.JTextField();
        etiquetaCelular = new javax.swing.JLabel();
        cajaCelular = new javax.swing.JTextField();
        etiquetaDireccion = new javax.swing.JLabel();
        cajaDireccion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaPersona.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaPersona.setText("Persona");

        comboPersonas.setModel(modelo);

        botonInsertar.setText("Insertar Persona");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        tabla.setModel(modeloTabla);
        scrollTabla.setViewportView(tabla);

        etiquetaDatos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        etiquetaDatos.setText("Datos de la Persona");

        etiquetaNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiquetaNombre.setText("Nombre");

        etiquetaApellidos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiquetaApellidos.setText("Apellidos");

        etiquetaEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiquetaEmail.setText("Email");

        etiquetaCelular.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiquetaCelular.setText("Celular");

        etiquetaDireccion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiquetaDireccion.setText("Dirección");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(etiquetaPersona)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaNombre)
                                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaApellidos)
                                    .addComponent(cajaApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(etiquetaDireccion)
                            .addComponent(cajaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaDatos)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cajaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etiquetaEmail))
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaCelular)
                                    .addComponent(cajaCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 70, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(comboPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollTabla, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separador))
                        .addContainerGap())))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaPersona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(scrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaDatos)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(etiquetaApellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajaApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(etiquetaCelular)
                        .addGap(58, 58, 58))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(etiquetaEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)))
                .addComponent(etiquetaDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        Persona p = (Persona) comboPersonas.getSelectedItem();
        
        String nombres = p.getNombres();
        String apellidos = p.getApellidos();
        String email = p.getEmail();
        String celular = p.getCelular();
        String direccion = p.getDireccion();
        
        String [] persona = {nombres,apellidos,email,celular,direccion};
        modeloTabla.addRow(persona);
    }//GEN-LAST:event_botonInsertarActionPerformed


    public static void main(String args[]) {
        // Colocamos el nuevo diseño (LookAndFeel) que instalamos.
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInsertar;
    private javax.swing.JTextField cajaApellidos;
    private javax.swing.JTextField cajaCelular;
    private javax.swing.JTextField cajaDireccion;
    private javax.swing.JTextField cajaEmail;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JComboBox<Persona> comboPersonas;
    private javax.swing.JLabel etiquetaApellidos;
    private javax.swing.JLabel etiquetaCelular;
    private javax.swing.JLabel etiquetaDatos;
    private javax.swing.JLabel etiquetaDireccion;
    private javax.swing.JLabel etiquetaEmail;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaPersona;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JSeparator separador;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
