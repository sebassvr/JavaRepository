package four_Creating_And_Concept;

import javax.swing.JOptionPane;

public class Operacion {
	// Attributes.
	int numero1;
	int numero2;
	int suma;
	int resta;
	int multiplicacion;
	int division;
	
	// Methods.
	 
	// Method to ask the user to enter the numbers.
	public void leerNumeros() {
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
		numero2  = Integer.parseInt(JOptionPane.showInputDialog("Enter another number: "));
	}
	
	// Method to add two numbers
	public void sumar() {
		suma = numero1 + numero2;
	}
	

	/**Method to subtract two numbers.
	 * @author Sebassvr
	 * Prueba de comentario
	 */
	public void restar() {
		resta = numero1 - numero2;
	}
	
	// Method to multiply two numbers.
	public void multiplicar() {
		multiplicacion = numero1 * numero2;
	}
	
	// Method to divide two numbers.
	public void dividir() {
		division = numero1 / numero2;
	}
	
	// Method to display the results
	public void mostrarResultados() {
		System.out.println("La suma es: "+suma);
		System.out.println("La resta es: "+resta);
		System.out.println("La multiplicacion es: "+multiplicacion);
		System.out.println("La division es: "+division);
	}
	
	
	
}
