package thirteen_find_the_Perimeter_and_Area_of_a_Quadrilateral;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Cuadrilatero C1;
		
		// Intro.
		JOptionPane.showMessageDialog(null,"Programa para sacar el perimetro y area de un cuadrilatero..");
		
		// Ingresando datos de los lados.
		Double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado1: "));
		Double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado2: "));
		
		if(lado1 == lado2) {
			C1 = new Cuadrilatero(lado1);
			System.out.println("Es un cuadrilatero de iguales lados: ");
			System.out.println("Su perimetro es: "+C1.getPerimetro());
			System.out.println("Su area es: "+C1.getArea());
		}
		else {
			C1 = new Cuadrilatero(lado1,lado2);
			System.out.println("Es un cuadrilatero de diferentes lados: ");
			System.out.println("Su perimetro es: "+C1.getPerimetro());
			System.out.println("Su area es: "+C1.getArea());
		}
		
		
		
	}

}