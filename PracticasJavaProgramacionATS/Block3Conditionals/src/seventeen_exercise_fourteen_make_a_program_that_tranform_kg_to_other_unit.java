/*      Block : Conditionals
 *      Exercise 14.
 *  Hacer un programa que pase Kg a otra ubnidad de medida de masa, mostrar en pantalla
 *  un menú con las opciones posibles.
 */

import javax.swing.JOptionPane;

public class seventeen_exercise_fourteen_make_a_program_that_tranform_kg_to_other_unit {
    public static void main(String[] args) {
        float masa,other;
        int op;

        masa = Float.parseFloat(JOptionPane.showInputDialog("Enter a valor in Kg: "));

        op = Integer.parseInt(JOptionPane.showInputDialog("\tCONVERSION MENU\n1.kg to tons\n2.kg to lb\n3.Kg to grams\n4.Kg to milligrams"));

        switch (op) {
            case 1: other= masa/1000; JOptionPane.showMessageDialog(null,masa+" kg is "+other+" tons.");break;
            
            case 2: other= masa*2.20462f; JOptionPane.showMessageDialog(null,masa+" kg is "+other+" lb.");break;

            case 3: other= masa*1000; JOptionPane.showMessageDialog(null,masa+" kg is "+other+" grams.");break;

            case 4: other= masa*1000000; JOptionPane.showMessageDialog(null,masa+" kg is "+other+" milligrams.");break;

            default: JOptionPane.showMessageDialog(null, "Option incorrect"); ;break;
        }





    }
}
