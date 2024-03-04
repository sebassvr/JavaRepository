/* Cycles
 *  Exercise 1.
 *  Leer un número y mostrar su cuadrado, repetir el proceso hasta que se
 *  introduzca un número negativo.
 *  
 */

import java.util.Scanner;

public class Five_read_a_number_and_show_his_square {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        int num;

        System.out.println("Enter a number: ");
        num = x.nextInt();
                
        while(num>0){
            //Number the squeared
            System.out.println("The squared number is: "+Math.pow(num, 2));
            //input again
            System.out.println("Enter a number: ");
            num = x.nextInt();
            }
        
        //Final message
        System.out.println("Go out");
            
        x.close();
    }
        
}
