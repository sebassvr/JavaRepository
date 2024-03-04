import java.util.Scanner;

/* Block: operators.
 *     Ejercicio 4: 
 *  
 *  Una compañia de venta de carros usados, paga a su personal de ventas un salario
 *  de $1000 mensuales, mas una comisión de $150 por cada carro vendido, más el 5%
 *  del valor de venta por carro. Cada mes el capturista de la empresa ingresa en
 *  la computadora los datos pertinentes. Hacer un programa que calcule e imprima
 *  el salario mensual de un vendedor dado.
 *  
 */

public class two_eight_company_salesperson_monthly_salary {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);

        System.out.println("Car Sales Company");
        final float bsalary = 1000, commission = (float) 150, carvalue = (float)0.05;
        float carstotalvalue,finalcommission,finalsalary;
        int cars;

        System.out.println("Enter how many cars you sold: ");
        cars = x.nextInt();
        System.out.println("Enter the total value of all cars sold: ");
        carstotalvalue = x.nextFloat();

        finalcommission = carstotalvalue * carvalue;

        finalsalary = bsalary + (commission * cars) + finalcommission;

        System.out.println("\nThe final salary: ");
        System.out.println(cars+" sold.");
        System.out.println(finalcommission+" dollars of final comission.");
        System.out.println("Final Salary: "+finalsalary);



        x.close();
    }

}
