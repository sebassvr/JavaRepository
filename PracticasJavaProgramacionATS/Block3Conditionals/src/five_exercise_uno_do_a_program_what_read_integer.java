/* Block: Conditionals
 *      Exercise 1:
 *  Hacer un programa que lea un número entero y muestre si el número es
 *  múltiplo de 10.
 */

import javax.swing.JOptionPane;

public class five_exercise_uno_do_a_program_what_read_integer {
    public static void main(String[] args) {
        
        int number;

        number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));

        JOptionPane.showMessageDialog(null, (number%10==0) ? "El numero es múltiplo de 10" : "El numero no es multiplo de 10");








    }

}
