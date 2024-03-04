// Miembros estaticos de una clase o miembros de clase.
// Estos ya no pertenecen al objeto si no a la clase nomas.
// Todo cambio que se realize se hara para todos los objetos.
package twelve_Static_Members_of_a_Class;

public class Estatico {
	private static String frase = "Primera frase";
	
	public static int sumar(int n1, int n2) {
		int suma = n1 + n2;
		return suma;
		
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(Estatico.frase);
		
		System.out.println("La suma es: "+Estatico.sumar(35,10));
		
		
/*
		Estatico ob1 = new Estatico();
		Estatico ob2 = new Estatico();
		
		ob2.frase = "Segunda frase";
		
		System.out.println(ob1.frase);
		System.out.println(ob2.frase);
*/
		
		
	}

}
