import javax.swing.JOptionPane;

/* Conditionals.
 * 
 * La sentencia if:
 * 
 * 		if(condition){
 * 
 * 		}
 * 		else{
 * 			Instruction
 * 		}
 *  
 */

public class two_if_else {

	public static void main(String[] args) {
		int num, data = 5;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
		
		if(num == data) {
			JOptionPane.showMessageDialog(null, "The number is 5");
		}
		else {
			JOptionPane.showMessageDialog(null, "The number is different from 5");
		}
		
		
	}

}
