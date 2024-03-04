/*  Block: Operators
 *  Exercise 4.
 *  En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere
 *  los $300. ¿Cuál será la cantidad que pagará una persona por su compra?
 * 
 */

import javax.swing.JOptionPane;

public class seven_exercise_four_mega_plaza_discount {
    public static void main(String[] args) {
        float tpay, discount = 0.20f;

        tpay = Float.parseFloat(JOptionPane.showInputDialog("Enter the total to pay"));
        
        if(tpay > 300){
            discount *= tpay;
            tpay -= discount; 
        }

        JOptionPane.showMessageDialog(null, "The total to pay is: "+tpay);



    }
}
