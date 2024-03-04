// Exercise 1
// VIDEO 34, 35 ,36, 37

package exercise1pressbutton;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Exercise1 extends JFrame {
    private JPanel panel;
    private JLabel showclicks;
    private JButton click;
    private int clicks = 0;
    
    public Exercise1(){
        setSize(400, 400); // Tamaño de ventana.
        setTitle("Exercise 1"); // Title.
        setLocationRelativeTo(null); // Ubicamos en el centro la ventana.
        
        startComponents();
        
        // Para que deje de ejecutar.
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    private void startComponents(){
        placePanel();
        placeLabel();
        placeButton();
    }
    
    private void placePanel(){
        panel = new JPanel();
        
        panel.setLayout(null);
        this.add(panel);
    }
    
    private void placeButton(){
        click = new JButton("Pulsa aquí");
        click.setBounds(90, 250, 200, 50);
        click.setFont(new Font("cooper black",3,20));
        
        panel.add(click);
        
        clickEvent();
    }
    
    private void clickEvent(){
        
        ActionListener eventoAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clicks ++;
                if(clicks == 1){
                    showclicks.setText("Botón pulsado: "+clicks+" vez.");
                }
                else{
                    showclicks.setText("Botón pulsado: "+clicks+" veces.");
                }
            }
        };
        
        // Hacer que se contabilize los clicks y muestre en el JLabel.
/*    
        MouseListener count = new MouseListener() {
            
            @Override
            public void mouseClicked(MouseEvent e) {
                clicks +=1;
                if(clicks == 1){
                    showclicks.setText("Botón pulsado: "+clicks+" vez.");
                }
                else{
                    showclicks.setText("Botón pulsado: "+clicks+" veces.");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        };
        click.addMouseListener(count);
*/        
        click.addActionListener(eventoAccion);
        
        
    }
    
    private void placeLabel(){
        showclicks = new JLabel("Pulsa el Botón");
        showclicks.setBounds(0, 50, 400, 40);
        showclicks.setFont(new Font("arial",0,20));
        showclicks.setHorizontalAlignment(SwingConstants.CENTER);
        
        panel.add(showclicks);
    }
    
    
    
    
    
}
