package three_Create_Class;

/* Name of class			  Word new
 * Car            car1 =         new        Car();
 * 				Name of object			Construct Car
 */

public class Coche {
	//Attributes.
	String color;
	String marca;
	int km;
	
	// Main method.
	public static void main(String[] args){
	// Creating an object
		Coche coche1 = new Coche();
	// Filling in the attributes.			
		coche1.color = "Blanco";
		coche1.marca = "Audi";
		coche1.km = 0;
	// Print attributes.
		System.out.println("El color del coche 1 es: "+coche1.color);
		System.out.println("La marca del coche 1 es: "+coche1.marca);
		System.out.println("El kilometraje del coche 1 es: "+coche1.km+"km");
		
	// Other object car2.
		
	// Creating another object.
		Coche coche2 = new Coche();
	// Filling in the attributes.
		coche2.color = "Rojo";
		coche2.marca = "Ferrari";
		coche2.km = 100;
	// Print attributes.
		System.out.println("\nEl color del coche 2 es: "+coche2.color);
		System.out.println("La marca del coche 2 es: "+coche2.marca);
		System.out.println("El kilometraje del coche 2 es: "+coche2.km+"km");
				
		
		
	}
}
