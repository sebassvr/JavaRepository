package exercise2choosesport;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Exercise2 extends JFrame {
    private JPanel panel;
    private JLabel etiqueta,imagen;    
    private JRadioButton rBoton1, rBoton2, rBoton3, rBoton4;
    
    
    // Creamos el JFrame.
    public Exercise2(){
        setSize(700, 400);
        setLocationRelativeTo(null);
        setTitle("Exercise 2");
        startComponents();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    // Iniciamos componentes.
    private void startComponents(){
        placePanel();
        placeLabel();
        placeRadioButtons();
    }
    
    // Creamos el panel.
    private void placePanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    
    // Creamos la etiqueta.
    private void placeLabel(){
        etiqueta = new JLabel("Escoja su deporte favorito");
        etiqueta.setBounds(20, 20, 250, 30);
        etiqueta.setFont(new Font("arial", 3, 20));
        panel.add(etiqueta);
    }
    
    // Creamos radio botones.
    private void placeRadioButtons(){
        // Primer radio botón.
        rBoton1 = new JRadioButton("Fútbol");
        rBoton1.setBounds(20, 70, 100, 30);
        rBoton1.setFont(new Font("Arial", 1, 15));
        panel.add(rBoton1);
        
        // Segundo radio botón.
        rBoton2 = new JRadioButton("Baloncesto");
        rBoton2.setBounds(20, 110, 105, 30);
        rBoton2.setFont(new Font("Arial", 1, 15));
        panel.add(rBoton2);
        
        // Tercer radio botón.
        rBoton3 = new JRadioButton("Tenis");
        rBoton3.setBounds(20, 150, 100, 30);
        rBoton3.setFont(new Font("Arial", 1, 15));
        panel.add(rBoton3);
        
        // Cuarto radio botón.
        rBoton4 = new JRadioButton("Natación");
        rBoton4.setBounds(20, 190, 100, 30);
        rBoton4.setFont(new Font("Arial", 1, 15));
        panel.add(rBoton4);
        
        // Creamos un grupo de botones.
        ButtonGroup groupButton = new ButtonGroup();
        groupButton.add(rBoton1);
        groupButton.add(rBoton2);
        groupButton.add(rBoton3);
        groupButton.add(rBoton4);
        
        eventAction();
    }
    
    // Creamos el evento de acción.
    private void eventAction(){
        imagen = new JLabel();
        imagen.setBounds(300, 50, 350, 250);
        panel.add(imagen);
        
        final ImageIcon imgFutbol = new ImageIcon(getClass().getResource("futbol.png"));
        final ImageIcon imgBasquet = new ImageIcon(getClass().getResource("basquet.png"));
        final ImageIcon imgTenis = new ImageIcon(getClass().getResource("tenis.png"));
        final ImageIcon imgNatacion = new ImageIcon(getClass().getResource("natacion.png"));

        // Evento 1.
        ActionListener eventClick1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                imagen.setIcon(new ImageIcon(imgFutbol.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(),Image.SCALE_SMOOTH)));
            }
        };                
        rBoton1.addActionListener(eventClick1);
        
        // Evento 2.
        ActionListener eventClick2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                imagen.setIcon(new ImageIcon(imgBasquet.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(),Image.SCALE_SMOOTH)));
            }
        };                
        rBoton2.addActionListener(eventClick2);
        
        // Evento 3.
        ActionListener eventClick3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                imagen.setIcon(new ImageIcon(imgTenis.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(),Image.SCALE_SMOOTH)));
            }
        };                
        rBoton3.addActionListener(eventClick3);
        
        // Evento 4.
        ActionListener eventClick4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                imagen.setIcon(new ImageIcon(imgNatacion.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(),Image.SCALE_SMOOTH)));
            }
        };                
        rBoton4.addActionListener(eventClick4);
    
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
} //Fin.
