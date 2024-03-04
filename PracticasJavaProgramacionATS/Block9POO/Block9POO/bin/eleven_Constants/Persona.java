package eleven_Constants;

public class Persona {
	
	// Las constantes (final) no pueden tener setters
	// ya que no pueden establecerse otro valor por que son constantes.
	// Attributes.
	private final String nombre;
	private int edad;
	
	// Constructor.
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void mostrarDatos() {
		System.out.println("El nombre es: "+nombre);
		System.out.println("La edad es: "+edad);
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	
	
	
	
	
	
}
