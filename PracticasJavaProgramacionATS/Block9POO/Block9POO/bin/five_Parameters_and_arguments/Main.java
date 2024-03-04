/*
 * Métodos: Parámetros y Argumentos.
 * 
 * public void método(int a, String b){   DECLARACIÓN DEL MÉTODO.
 * 										 
 * }
 * 
 * objeto.método(1,"Hola");     INVOCACIÓN DEL MÉTODO.
 * 
 * */

package five_Parameters_and_arguments;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
	// Declare and enter numbers.
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter another number: "));
		Operacion op = new Operacion();
		
	// Call the functions.
		op.sumar(n1,n2);
		op.restar(n1, n2);
		op.multiplicar(n1, n2);
		op.dividir(n1, n2);
		op.mostrarResultados();
		
		
		
		
	}

}
