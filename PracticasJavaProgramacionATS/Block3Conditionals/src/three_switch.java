import javax.swing.JOptionPane;

public class three_switch {

	public static void main(String[] args) {
		int data;
		
		data = Integer.parseInt(JOptionPane.showInputDialog("Enter a number beetween 1 - 5"));

		switch(data){
			case 1: JOptionPane.showConfirmDialog(null, "Es el numero 1");
			break;
			case 2: JOptionPane.showConfirmDialog(null, "Es el numero 2");
			break;
			case 3: JOptionPane.showConfirmDialog(null, "Es el numero 3");
			break;
			case 4: JOptionPane.showConfirmDialog(null, "Es el numero 4");
			break;
			case 5: JOptionPane.showConfirmDialog(null, "Es el numero 5");
			break;
			default: JOptionPane.showConfirmDialog(null, "El numero no esta en el rango");
			break;
			
		}
	
	}

}
