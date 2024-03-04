/*  Block : Operators
 *  Exercise 6.
 *  Hacer un programa que calcule el cuadrado de una suma.
 */

import java.util.Scanner;

public class two_ten_program_that_calculates_the_square_of_a_sum{
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a, b, result;

        System.out.println("Ingrese dos numeros: ");
        a=x.nextInt();
        b=x.nextInt();
        result = (int) Math.pow((a+b),2);

        System.out.println("The result is: "+result);


        x.close();
    }

}
