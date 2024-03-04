/*      Block : Conditionals
 *  Exercise 9.
 *  Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
 *  Suponiendo que todos los mesos son de 30 días.
 */

import javax.swing.JOptionPane;


public class twelve_exercise_nine_ask_for_the_day_month_and_year {
    public static void main(String[] args) {
        int day, month, year;

        day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day: "));
        month = Integer.parseInt(JOptionPane.showInputDialog("Enter the month: "));
        year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year: "));

        if(day >= 1 && day <=30){
                if(month >= 1 && month <=12 ){
                    if(year >= 1 && year <= 2023){
                        JOptionPane.showMessageDialog(null, "The date is correct");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Year incorrect");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Month incorrect");
                }
        }
        else{
            JOptionPane.showMessageDialog(null, "Day incorrect");
        }




    }
}
