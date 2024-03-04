package thirteen_find_the_Perimeter_and_Area_of_a_Quadrilateral;

public class Cuadrilatero {
	
	// Attributes.
	private double lado1;
	private double lado2;
	
	// Constructor para cuadrilatero de diferentes lados.
	public Cuadrilatero(double lado1, double lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	// Constructor de iguales lados.
	public Cuadrilatero(double lado1) {
		this.lado1 = lado1;
	}
	
	// Getter de Perimetro.
	public double getPerimetro() {
		double perimetro;
		if(lado1 == lado2) {
			perimetro = lado1 * 4;
		}
		else {
			perimetro = lado1 * 2 + lado2 *2;
		}
	return perimetro;
	}
	
	// Getter de Area.
	public double getArea() {
		double area;
		if(lado1 == lado2) {
			area = Math.pow(lado1, 2);
		}
		else {
			area = lado1 * lado2;
		}
	return area;
	}
	
	
	
}