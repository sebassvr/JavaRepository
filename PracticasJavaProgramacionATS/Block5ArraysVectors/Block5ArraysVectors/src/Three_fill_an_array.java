//LLena un arreglo.

import javax.swing.JOptionPane;

public class Three_fill_an_array {
    public static void main(String[] args) {
        int nelements;

        nelements = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of elements: "));

        char[] letters = new char[nelements];

        for (int i = 0; i < nelements; i++) {
            letters[i] = JOptionPane.showInputDialog(i+1+". Enter a letter: ").charAt(0);
        }

        for (int i = 0; i < nelements; i++) {
            System.out.println(letters[i]);
        }

    }
}
