package eight_Method_Overloading;

public class Persona {
	// Attributes.
	String nombre;
	int edad;
	String dni;
	
	// Methods.
	// Constructor Method.
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	// Constructor Method Overloading.
	public Persona(String dni) {
		this.dni = dni;
	}
	
	// Run Method.
	public void correr() {
		System.out.println("Soy "+nombre+", tengo "+edad+" años y estoy corriendo una maraton.");
	}
	
	// Run Method Overloading.
	public void correr(int km) {
		System.out.println("He corrido "+km+" kilometros.");
	}
	
	
	
}
