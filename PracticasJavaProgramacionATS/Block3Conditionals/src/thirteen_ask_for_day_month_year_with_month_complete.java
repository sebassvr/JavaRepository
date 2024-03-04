/*  Block : Contionals
 *  Exercise 10.
 *  Pedir el día, mes y año de una fecha e iondicar si la fecha es correcta.
 *  Con meses de 28, 30 y 31 días. Sin años bisiestos.
 */

import javax.swing.JOptionPane;

public class thirteen_ask_for_day_month_year_with_month_complete {
    public static void main(String[] args) {
        int day, month, year;

        day = Integer.parseInt(JOptionPane.showInputDialog("Enter the day: "));
        month = Integer.parseInt(JOptionPane.showInputDialog("Enter the month: "));
        year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year: "));

        if(day >= 1 && day <=31){
                if(month >= 1 && month <=12 ){
                    if(month == 2 && day <= 28){    
                        if(year >= 1 && year <= 2023){
                            JOptionPane.showMessageDialog(null, "The date is correct");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Year incorrect");
                        }
                    }
                    else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 ||month == 12 && day <= 31){
                        if(year >= 1 && year <= 2023){
                            JOptionPane.showMessageDialog(null, "The date is correct");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Year incorrect");
                        }
                    }
                    else if(month == 4 || month == 6 || month == 9 || month == 11 && day <= 30){
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
                    JOptionPane.showMessageDialog(null, "Month incorrect");
                }
        }
        else{
            JOptionPane.showMessageDialog(null, "Day incorrect");
        }


    }
}
