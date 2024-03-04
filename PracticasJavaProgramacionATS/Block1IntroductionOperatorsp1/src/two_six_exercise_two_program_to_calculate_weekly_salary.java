import java.util.Scanner;

/*  Block: Operators.
 *  Exercise 2: Hacer un programa que calcule e imprima el salario semanal
 *  de un empleado a partir de sus horas semanales trabajadas y de su
 *  salario por hora.
 */

public class two_six_exercise_two_program_to_calculate_weekly_salary{

    public static void main(String[] args){
        
        Scanner x = new Scanner(System.in);

        final float sph = (float) 10.0;

        int ht;

        System.out.println("Starting program....");
        System.out.println("Enter hours worked: ");
        ht = x.nextInt();

        float sf = ht * sph;
        System.out.println("The hourly wage is: "+sph);
        System.out.println("Your weekly salary for "+ht+" hours worked is: "+sf);

        x.close();








    }

}