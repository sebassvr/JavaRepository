/*      Block : Operators.
 *  Exercise 7.
 *  Pedir tres números y mostrarlos ordenados de mayor a menor.
 */

import javax.swing.JOptionPane;

public class ten_exercise_seven_ask_for_three_numbers_and_show_ordered {
    public static void main(String[] args) {
        int n1,n2,n3;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the third number: "));

        if(n1>n2 && n2>n3){
            JOptionPane.showMessageDialog(null, "Ordered "+n1+" "+n2+" "+n3);
        }

        else if(n1>n2 && n1 > n3){
            JOptionPane.showMessageDialog(null, "Ordered "+n1+" "+n3+" "+n2);
        }

        else if(n2>n1 && n1 > n3){
            JOptionPane.showMessageDialog(null, "Ordered "+n2+" "+n1+" "+n3);
        }

        else if(n2>n1 && n3 > n1){
            JOptionPane.showMessageDialog(null, "Ordered "+n2+" "+n3+" "+n1);
        }

        else if(n3>n1 && n1 > n2){
            JOptionPane.showMessageDialog(null, "Ordered "+n3+" "+n1+" "+n2);
        }

        else {
            JOptionPane.showMessageDialog(null, "Ordered "+n3+" "+n2+" "+n1);
        }

    }
}
