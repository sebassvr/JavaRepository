/*      Block: Conditionals
 *  Exercise 12.
 *  Pedir una nota de 0 a 10 y mostrarla de la forma:
 *  Insufficient
 *  Enough
 *  Good
 *  Remarkable
 *  Outstanding
 */

import javax.swing.JOptionPane;

public class fifteen_exercise_doce_ask_for_grade_zero_to_ten_and_show{
    public static void main(String[] args) {
        int grade;

        //Input
        grade = Integer.parseInt(JOptionPane.showInputDialog("Enter your grade (Beetweem 0 to 10)"));

        //Conditionals
        switch(grade){
            case 1:case 2: JOptionPane.showMessageDialog(null, "Grade insufficient"); break;
            case 3:case 4: JOptionPane.showMessageDialog(null, "Grade enough"); break;
            case 5:case 6: JOptionPane.showMessageDialog(null, "Grade good"); break;
            case 7:case 8: JOptionPane.showMessageDialog(null, "Grade remarkable"); break;
            case 9:case 10: JOptionPane.showMessageDialog(null, "Grade outstanding"); break;
            default:JOptionPane.showMessageDialog(null, "Grade incorrect");break;
        }        

    }

}