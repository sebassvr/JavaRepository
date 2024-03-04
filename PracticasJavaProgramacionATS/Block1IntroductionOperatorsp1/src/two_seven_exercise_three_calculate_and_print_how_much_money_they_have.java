import java.util.Scanner;

/*   Block : Operators.
 * Ejercicio 3:
 *  Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo.
 *  Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. Hacer un programa que
 *  calcule e imprima la cantidad de dinero que tienen entre los tres.
 * 
 */


public class two_seven_exercise_three_calculate_and_print_how_much_money_they_have {
    
    public static void main (String[] args){

        float g, l, j, t;

        Scanner entrada = new Scanner (System.in);

        System.out.print("Digite cuantos dolares tiene Guillermo: ");
        g = entrada.nextFloat();

        l = g/2;
        j = (g+l)/2;

        t = g+l+j;

        System.out.println("Guillermo tiene "+g+" dolares");
        System.out.println("Luis la mitad de lo que posee Guillermo por lo tanto tiene "+l+" dolares");
        System.out.println("Juan tiene la mitad de lo que poseen Luis y Guillermo juntos por lo tanto tiene "+j+" dolares");
        System.out.println("El total de dinero es "+t+" dolares");
        entrada.close();
    }
}
