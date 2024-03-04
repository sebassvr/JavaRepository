/* Block: POO
 * Exercise 2:
 * Construir un programa que permita dirigir el moviento de un
 * objeto dentro de un tablero y actualice su posición dentro
 * del mismo. Los movientos posibles son 
 * ARRIBA, ABAJO, IZQUIERDA y DERECHA. Tras cada moviento
 * el programa mostrará la nueva dirección elegida y las
 * coordenadas de situación del objeto dentro del tablero.
 * 
 */
package fourteen_exercise_two_move_an_object;

public class Tablero {

	// Attributes.
	private int x;
	private int y;
	
	// Constructor.
	Tablero(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	// Move up.
	public void moveUp() {
		y += 1;
	}
	
	// Move down.
	public void moveDown() {
		y -= 1;
	}
	
	// Move right.
	public void moveRight() {
		x += 1;
	}
	
	// Move left.
	public void moveLeft() {
		x -= 1;
	}
	
	// Get x.
	public int getX() {
		return x;
	}
	// Get y.
	public int getY() {
		return y;
	}

}