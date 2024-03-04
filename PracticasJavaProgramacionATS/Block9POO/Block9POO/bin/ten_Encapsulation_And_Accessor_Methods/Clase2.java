package ten_Encapsulation_And_Accessor_Methods;

public class Clase2 {

	public static void main(String[]args) {
		Clase1 objeto1 = new Clase1();
		
		// objeto1.edad = -5;
		
		// Ahi podemos establecer con el Set a pesar de que este en private.
		objeto1.setEdad(10);
		
		System.out.println("La edad es: "+objeto1.getEdad());
		
		objeto1.setNombre("Sebastian");
		System.out.println("El nombre es: "+objeto1.getNombre());
		
		
	}
	
}
