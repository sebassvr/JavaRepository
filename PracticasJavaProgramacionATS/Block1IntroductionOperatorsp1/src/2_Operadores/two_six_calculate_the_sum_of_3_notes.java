import java.util.Scanner;

/*  Bloque: OPERADORES
 *  Ejercicio 1: 
 *  Hacer un programa que calcule e imprima la suma de tres calificaciones.
*/

public class two_six_calculate_the_sum_of_3_notes{

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        float note1,note2,note3;

        System.out.print("Enter the 3 notes: ");
        note1 = x.nextFloat();
        note2 = x.nextFloat();
        note3 = x.nextFloat();
        
        float suma = note1 + note2 + note3;

        System.out.println("The result of 3 notes is: "+suma);

        x.close();
    }

}