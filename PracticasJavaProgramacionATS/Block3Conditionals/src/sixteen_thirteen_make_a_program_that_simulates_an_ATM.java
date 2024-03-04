/*      Block : Conditionals
 *  Exercise 13.
 *  Hacer un programa que simule un cajero automático con un saldo inicial
 *  de 1000 Dólares, con el siguiente menú de opciones:
 *  
 *  1.Add money to the account
 *  2.Withdraw money from account
 *  3.Go out
 */

import javax.swing.JOptionPane;

public class sixteen_thirteen_make_a_program_that_simulates_an_ATM {
    public static void main(String[] args) {
        int menu;
        float cuenta = 1000, edit;

        menu = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1.Add money to the account\n2.Withdraw money from account\n3.Go out"));
        
        switch (menu) {
            case 1: edit = Float.parseFloat(JOptionPane.showInputDialog("How many cash do you want to enter?"));
            cuenta += edit; JOptionPane.showMessageDialog(null, "Now you have "+cuenta+" dollars.");break;
            // Withdraw money
            case 2: edit = Float.parseFloat(JOptionPane.showInputDialog("How many cash do you want to withdraw?"));
            cuenta -= edit; JOptionPane.showMessageDialog(null, "Now you have "+cuenta+" dollars.");break;
            //Go out
            case 3: JOptionPane.showMessageDialog(null, "You have left the program...");break;
            default: JOptionPane.showMessageDialog(null, "Option incorrect");break;
        }


    }
}
