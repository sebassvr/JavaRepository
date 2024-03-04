package eventos;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.image.AreaAveragingScaleFilter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel saludo;
    private JTextField cajaTexto;
    private JButton boton;
    private JTextArea areaTexto;
    
    public Ventana(){
        setBounds(50,50,500,500); // Posicion y Tamaño.
        setTitle("Eventos"); // Titulo de la ventana.
        
        iniciarComponentes(); // Llamamos los componentes.
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Para que al cerrar se deje de ejecutar automaticamente.
    
    }
    
    private void iniciarComponentes(){
        colocarPanel();
        //colocarEtiqueta();
        colocarCajaDeTexto();
        colocarAreaTexto();
        //colocarBoton();
    }
    
    // Panel.
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null); // Desactivamos el diseño por defecto.
        this.add(panel);
        
        // Llamamos al evento.
        //eventoDeMovimientoDeRaton();
        //eventoRuedaDelRaton();
    }
    
    // Etiquetas.
    private void colocarEtiqueta(){
        JLabel etiqueta = new JLabel("Ingrese su nombre: ");
        etiqueta.setBounds(30, 10, 200, 30);
        etiqueta.setFont(new Font("cooper black",0,18));
        panel.add(etiqueta);
    }

    private void colocarAreaTexto(){
        areaTexto = new JTextArea();
        areaTexto.setBounds(230, 30, 200, 300);
        panel.add(areaTexto);
        
        JScrollPane barras = new JScrollPane(areaTexto, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barras.setBounds(230, 30, 200, 300);
        panel.add(barras);
    }
    
    // Caja de Texto.
    private void colocarCajaDeTexto(){
        cajaTexto = new JTextField();
        cajaTexto.setBounds(20, 30, 150, 30);
        panel.add(cajaTexto);
        
        eventosDelTeclado();
    }
    
    // Botones
    private void colocarBoton(){
        boton = new JButton("¡Pulsa aqui!");
        boton.setBounds(150, 350, 150, 40);
        boton.setFont(new Font("arial",0,15));
        panel.add(boton);
    
    // Llamamos el evento.
        //eventoOyenteDeAccion();
        //eventoOyenteDeRaton();
        
        
/*        
        saludo = new JLabel();
        saludo.setBounds(150,200,300,40);
        saludo.setFont(new Font("arial",1,20));
        panel.add(saludo);
*/
}   
    
// VIDEO 28
    private void eventoOyenteDeAccion(){
        // Agregamos EVENTO de tipo (ActionListener).
        ActionListener oyenteDeAccion = (ActionEvent ae) -> {
            saludo.setText("Hola "+cajaTexto.getText());
        };
            
        boton.addActionListener(oyenteDeAccion);   
    }

// VIDEO 29
// VIDEO 30 MouseEvent
    private void eventoOyenteDeRaton(){
        // Creamos el oyente de Raton.
        MouseListener oyenteDeRaton;
        oyenteDeRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                // Alt este presionado.
                if(me.isAltDown()){
                    areaTexto.append("Alt\n");
                }
                // Control este presionado.
                else if(me.isControlDown()){
                    areaTexto.append("Control\n");
                }
                // Shift este presionado.
                else if(me.isShiftDown()){
                    areaTexto.append("Shit\n");
                }
                // Click derecho.
                else if(me.isMetaDown()){
                    areaTexto.append("Right Click\n");
                }
                // Caso contrario pusimos la opc de click izquierdo.
                else{
                    areaTexto.append("Left Click\n");
                }
                if(me.getClickCount() == 2){
                    areaTexto.append("Doble Click\n");
                }
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //areaTexto.append("mousePressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //areaTexto.append("mouseReleased\n");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //areaTexto.append("mouseEntered\n");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //areaTexto.append("mouseExited\n");
            }
        };
        boton.addMouseListener(oyenteDeRaton);
    }

// VIDEO 31
    private void eventoDeMovimientoDeRaton(){
        MouseMotionListener oyenteMovimientoRaton = new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                areaTexto.append("mouse Dragged\n");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                areaTexto.append("mouse Moved\n");
            }
        };
        
        
        panel.addMouseMotionListener(oyenteMovimientoRaton);
    }
    
// VIDEO 32 
    private void eventoRuedaDelRaton(){
        MouseWheelListener ruedaRaton = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if(e.getPreciseWheelRotation() == -1){
                    areaTexto.append("Rueda hacia arriba\n");
                }
                else if(e.getPreciseWheelRotation() == 1){
                    areaTexto.append("Rueda hacia abajo\n");
                }
            }
        };
        panel.addMouseWheelListener(ruedaRaton);
    }

// VIDEO 33
    private void eventosDelTeclado(){
        KeyListener eventoTeclado = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //areaTexto.append("Key Typed\n");
                areaTexto.append(""+e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
                //areaTexto.append("Key Pressed\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //areaTexto.append("Key Released\n");
                //areaTexto.append(""+e.getKeyChar());
                //areaTexto.append("h"+e.getKeyCode());
/*
                if(e.getKeyChar() == 'p'){
                    areaTexto.append("Letra p\n");
                }
                if(e.getKeyChar() == '\n'){
                    areaTexto.append("Enter\n");
                }
                if(e.getKeyChar() == ' '){
                areaTexto.append("Espacio\n");
                }
*/
            }
        };
        
        cajaTexto.addKeyListener(eventoTeclado);
        
        }
    

}