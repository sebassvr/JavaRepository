/* Block : Conditionals
 *  Exercise 5.
 *  Un obrero necesita calcular su salario semanal, el cual se obtiene de
 *  la siguiente manera:
 *  - Si trabaja 40 horas o menos se le paga $16 por hora.
 *  - Si trabaja mas de 40 horas se le paga $16 por cada una de las primeras
 *    40 horas y 20$ por cada hora extra.
 */

import javax.swing.JOptionPane;

public class eight_exercise_five_calculate_weekly_salary {
    public static void main(String[] args) {
        float weeklysalary;
        int hours,hextra;
        
        hours = Integer.parseInt(JOptionPane.showInputDialog("Enter the hours worked: "));

        if(hours>40){
            hextra = hours - 40;
            hextra *= 20;
            hours = 40 * 16;
            weeklysalary = hextra + hours;}
        
            else {
            weeklysalary = hours * 16;}

        JOptionPane.showMessageDialog(null, "Your weekly salary is: "+weeklysalary);

    }

}
