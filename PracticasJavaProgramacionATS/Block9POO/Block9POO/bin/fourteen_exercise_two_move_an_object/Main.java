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

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// Variables to be used.
			int x = 0;
			int y = 0;
			int op = 0;
		
		// Object.
				Tablero ingame = new Tablero(x,y);
		
		// Scanner.
		Scanner entrada = new Scanner(System.in);
		
		// Introduction.
		System.out.println("Welcome to the cartesian location board.");
		
		// Loop with menu.
		do {
			if(op >= 1 && op <=4) {
				System.out.println("The coordinates are: x,y ("+ingame.getX()+","+ingame.getY()+")");
				// subConditionals.
				// Center.
				if(x == 0 && y == 0) {
					System.out.println("The x and y coordinate is in the center.");
				}
				// X.
				else if(x == 0) {
					System.out.println("The x coordinate is at the center.");
				}
				else if(x > 0) {
					System.out.println("The x coordinate is to the right.");
				}
				else if(x < 0) {
					System.out.println("The x coordinate is to the left.");	
				}
				// Y.
				if(y == 0 && x != 0) {
					System.out.println("The y coordinate is at the center.");
				}
				else if(y > 0) {
					System.out.println("The y coordinate is to the up.");
				}
				else if(y < 0) {
					System.out.println("The y coordinate is to the down.");	
				}
					
			}
			
			//Menu.
			System.out.println("\n\t.:Menu:. ");
			System.out.println("1. Move up.");
			System.out.println("2. Move down.");
			System.out.println("3. Move right.");
			System.out.println("4. Move left.");
			System.out.println("5. Exit the program..");
		// Input option.
			System.out.println("Enter an option: ");
			op = entrada.nextInt();
			
			
			switch (op) {
			case 1:
					//up
				System.out.println("Moving up...");
				ingame.moveUp();
				y ++;
				break;
			case 2:
					//down
				System.out.println("Moving down...");
				ingame.moveDown();
				y --;
				break;
			case 3:
					//right
				System.out.println("Moving right...");
				ingame.moveRight();
				x ++;
				break;
			case 4:
					//left
				System.out.println("Moving left...");
				ingame.moveLeft();
				x --;
				break;
			case 5:
					// Exit the program.
				System.out.println("Good bye take care.");
				break;

			default:
				System.out.println("Wrong option, please re-enter an option.");
				break;
			}
			
		}while(op != 5);
		
		
		entrada.close();
	}

}
