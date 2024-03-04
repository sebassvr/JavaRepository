/*      Block : Contionals
 *      Exercise 11.
 *  Construir un programa que simule el funcionamiento de una calculadora que puede
 *  realizar las cuatro operaciones aritméticas básicas (suma, resta, producto y
 *  división) con valores númericos enteros. El usuario debe especificar la 
 *  operación con el primer carácter del primer parámetro de la línea de conmandos:
 *  S o s para la suma, R o r para resta, P, p, M o m para el producto y D para la
 *  división.
 */

import javax.swing.JOptionPane;

public class fourteen_make_a_program_that_simulates_a_calculator {
    public static void main(String[] args) {
        int menu, n1,n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number: "));

        menu = JOptionPane.showInputDialog("Menu:\n1. Suma (Enter 'S' or 's')\n2. Resta (Enter 'R' or 'r')\n3. Producto (Enter 'P', 'p', 'M' or 'm')\n4. División (Enter 'D' or 'd')\nEnter the operation you want to perform: ").charAt(0);

        switch (menu) {
            case 'S':case 's': JOptionPane.showMessageDialog(null, "The sum is: "+(n1+n2));break;

            case 'R':case 'r': JOptionPane.showMessageDialog(null, "The rest is: "+(n1-n2));break;

            case 'P':case 'p':case 'M':case 'm': JOptionPane.showMessageDialog(null, "The product is: "+(n1*n2));break;

            case 'D':case 'd': JOptionPane.showMessageDialog(null, "The division is: "+(n1/n2));break;

            default: JOptionPane.showMessageDialog(null, "Incorrect literal"); break;
        }

    }
} 
