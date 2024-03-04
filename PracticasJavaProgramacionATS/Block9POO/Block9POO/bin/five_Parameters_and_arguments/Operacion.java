package five_Parameters_and_arguments;


public class Operacion {
	// Attributes.
	int suma;
	int resta;
	int multiplicacion;
	int division;
	
	// Methods.
	
	// Method to add two numbers
	public void sumar(int num1, int num2) {
		suma = num1 + num2;
	}
	

	/**Method to subtract two numbers.
	 * @author Sebassvr
	 * Prueba de comentario
	 */
	public void restar(int num1, int num2) {
		resta = num1 - num2;
	}
	
	// Method to multiply two numbers.
	public void multiplicar(int num1, int num2) {
		multiplicacion = num1 * num2;
	}
	
	// Method to divide two numbers.
	public void dividir(int num1, int num2) {
		division = num1 / num2;
	}
	
	// Method to display the results
	public void mostrarResultados() {
		System.out.println("La suma es: "+suma);
		System.out.println("La resta es: "+resta);
		System.out.println("La multiplicacion es: "+multiplicacion);
		System.out.println("La division es: "+division);
	}
	
	
	
}
