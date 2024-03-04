/*
    VIDEO 43,44,45,46;
    Exercise 3;
    Hacer un panel con 3 botones, Red Green Blue: RGB
    Y colocar eventos para mover la rueda y que el color de Background cambie.
*/


package exercise3rgbcolor;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class colorRgb extends JFrame {
    private JPanel panel;
    private JLabel label;
    private JButton buttonRed,buttonGreen,buttonBlue;
    private int pressed = 0;
    private int countRed = 0, countGreen = 0, countBlue = 0;
    
    
    
    public colorRgb(){
        setSize(600, 500);
        setLocationRelativeTo(null);
        setTitle("Exercise 3");
        
        startComponents();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void startComponents(){
        placePanel();
        placeLabel();
        placeButtons();
    }
    
    // Colocamos el  Panel.
    private void placePanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
        wheelEvent();
    }
    
    // Colocamos la etiqueta. 
    private void placeLabel(){
        label = new JLabel("Color(Rojo Verde Azul)");
        label.setBounds(100, 30, 400, 50);
        label.setFont(new Font("cooper black",3,18));
        label.setHorizontalAlignment(0);
        panel.add(label);
    }
    
    // Colocamos los botones Red, Green y Blue.
    private void placeButtons(){
        /*
            pressed = 1 -> buttonRed;
            pressed = 2 -> buttonGreen;
            pressed = 3 -> buttonBlue;
        */
        
        // Button 1 RED.
        buttonRed = new JButton("Red");
        buttonRed.setForeground(Color.RED);
        buttonRed.setBounds(50, 300, 125, 50);
        buttonRed.setFont(new Font("Arial",3,15));
        panel.add(buttonRed);
        // Action Listener = 1;
        buttonRed.addActionListener((ActionEvent e) -> {
            pressed = 1;
        });
        
        // Button 2 GREEN.
        buttonGreen = new JButton("Green");
        buttonGreen.setForeground(Color.GREEN);
        buttonGreen.setBounds(225, 300, 125, 50);
        buttonGreen.setFont(new Font("Arial",3,15));
        panel.add(buttonGreen);
        // Action Listener = 2;
        buttonGreen.addActionListener((ActionEvent e) -> {
            pressed = 2;
        });
        
        // Button 3 BLUE.
        buttonBlue = new JButton("Blue");
        buttonBlue.setForeground(Color.BLUE);
        buttonBlue.setBounds(400, 300, 125, 50);
        buttonBlue.setFont(new Font("Arial",3,15));
        panel.add(buttonBlue);
        // Action Listener = 3;
        buttonBlue.addActionListener((ActionEvent e) -> {
            pressed = 3;
        });
        
    }
    
    // Creamos el evento de Rueda.
    private void wheelEvent(){
        MouseWheelListener wheelEvent1 = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if(pressed != 0){ // Si se ha pressed algun botón.
                    if(pressed == 1) { // Se ha pressed el botón Rojo.
                        countRed += e.getWheelRotation();
                        if (countRed < 0) {
                            countRed = 0;
                        }
                        if (countRed > 255) {
                            countRed = 255;
                        }
                    }
                    else if(pressed == 2) { // Se ha pressed el botón Verde.
                        countGreen += e.getWheelRotation();
                        if(countGreen < 0){
                            countGreen = 0;
                        }
                        if(countGreen > 255){
                            countGreen = 255;
                        }
                    }
                    else if(pressed == 3){ // Se ha pressed el botón Azul.
                        countBlue += e.getWheelRotation();
                        if(countBlue < 0){
                            countBlue = 0;
                        }
                        if(countBlue > 255){
                            countBlue = 255;
                        }
                    }
                }
                label.setText("Color (Red = "+countRed+",Green = "+countGreen+", Blue = "+countBlue);
                panel.setBackground(new Color(countRed,countGreen,countBlue));

            }
        };
        
        
        panel.addMouseWheelListener(wheelEvent1);
        
        
        
        
    }
    
    
    
} //FIN.
