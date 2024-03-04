import java.util.Scanner;

/* Block: Operators.
 * Exercise 8.
 *  Construir un programa que calcule y muestre por pantalla las
 *  raíces de la ecuación de segundo grado de coeficientes reales.
 *  
 */

public class two_twelve_make_a_program_calculate_second_grade_equation {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		Double a,b,c,ope,pos,neg, result1,result2;
		
		System.out.println("Starting");
		System.out.println("Enter the term 'a'");
		a = x.nextDouble();
		System.out.println("Enter the term 'b'");
		b = x.nextDouble();
		System.out.println("Enter the term 'c'");
		c = x.nextDouble();
		
		ope = Math.sqrt(Math.pow(b,2)-4*a*c);
		
		pos = -b + ope;
		neg = -b - ope;
		
		result1 = pos/2*a;
		result2 = neg/2*a;
		
		System.out.println("Result positive: "+result1);
		System.out.println("Result negative: "+result2);
		
		 
		
		x.close();
	}

}
