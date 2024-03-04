/*      Block : Conditionals
 *  Exercise 6.
 *  Hacer un programa que tome dos números y diga si ambos son pares o impares.
 */

import javax.swing.JOptionPane;

public class nine_exercise_six_do_a_program_take_two_numbers_say_even_or_odd {
    public static void main(String[] args) {
        int n1,n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number: "));

        JOptionPane.showMessageDialog(null, (n1%2==0&&n2%2==0)? "They're even": "They're odd");
    }
    
}
