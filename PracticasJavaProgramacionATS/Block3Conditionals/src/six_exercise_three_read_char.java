/* Block: Conditionals
 *  Exercise 6.
 *  Hacer un programa que lea un carácter por teclado y compruebe si
 *  es una letra mayúscula.
 */

import javax.swing.JOptionPane;

public class six_exercise_three_read_char {
    public static void main(String[] args) {
        char letter;
        letter = JOptionPane.showInputDialog("Enter a char: ").charAt(0);
        
        if(Character.isUpperCase(letter)){
            JOptionPane.showMessageDialog(null, "Is a capital letter");
        }
        else{
            JOptionPane.showMessageDialog(null, "Is a lowercase letter");
        }
        
    }

}
