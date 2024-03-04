/*  Block : Conditionals
 *  Exercise 2.
 *  Pedir dos números y decir cual es el mayor o si son iguales.
 */

import javax.swing.JOptionPane;

public class five_exercise_two_what_is_the_greatest_number {
    public static void main(String[] args) {
        int n1,n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number:"));
        n2 =  Integer.parseInt(JOptionPane.showInputDialog("Enter the second number:"));

        if(n1>n2){
            JOptionPane.showMessageDialog(null, "The largest number is: "+n1);
        }
            
        else if(n2>n1){
            JOptionPane.showMessageDialog(null, "The largest number is: "+n2);
        }
        
        else{
            JOptionPane.showMessageDialog(null, "The number "+n1+" is equal to the number "+n2);
        }

    }
}
