package seven_Constructor_method;

public class Persona {
	// Attributes
	String nombre;
	int edad;
	
	
	// Methods.
	// Constructor Method.
	public Persona(String nombre, int edad){
	this.nombre = nombre;
	this.edad = edad;
	}
	
	// Method to display data.
	public void mostrarDatos(){
		System.out.println("El nombre es: "+nombre);
		System.out.println("La edad es: "+edad);
	}
	
	
	
	
}
