/*      Operador ternario
 * 
 * El operador Ternario '?'
 *  
 *      valor = (Condition) ? valor1 : valor2
 * 
 */

import javax.swing.JOptionPane;

public class four_operator_ternario {
    public static void main(String[] args) {
        int number;

        number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));

        JOptionPane.showMessageDialog(null, (number%2==0) ? "Is ever" : "Is odd");


  //      message = (number%2==0) ? "Is ever" : "Is odd";
  //      JOptionPane.showMessageDialog(null, message);

    }
}
