/*  Block : Conditionals
 *  Exercise 8.
 *  Pedir un número entre 0 y 99, 999 y decir cuántas cifras tiene.
 */

import javax.swing.JOptionPane;

public class eleven_exercise_eight_ask_for_a_number_and_see_how_many_digits_it_has {
    public static void main(String[] args) {
        int digits, number;

        number = Integer.parseInt(JOptionPane.showInputDialog("Enter the number: "));

        if(number>0 && number < 10){
            digits = 1;}

        else if(number >= 10 && number < 100){
            digits = 2;}

        else if(number >= 100 && number < 1000){
            digits = 3;}

        else if(number >= 1000 && number < 10000){
            digits = 4;}

        else{
            digits = 5;}
    
        JOptionPane.showMessageDialog(null, "El numero "+number+" tiene "+digits+" digitos.");
    
    }
}
