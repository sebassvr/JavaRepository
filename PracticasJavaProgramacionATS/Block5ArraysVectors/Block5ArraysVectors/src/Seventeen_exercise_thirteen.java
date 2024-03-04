/*  Exercise 13:
 *      Leer 10 enteros en una tabla. Guardar en otra tabla los elementos pares
 *      de la primera, y a continuación los elementos impares.
 *  
 */

import java.util.Scanner;

public class Seventeen_exercise_thirteen {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int[] table = new int[10];
        int[] even = new int[10];
        int[] odd = new int[10];
        int par=0,impar=0,cero=0;
        
        for (int i : table) {
            System.out.println("Enter a number: ");
            table[i] = x.nextInt();

            if (table[i]==0) {
                
                cero++;
            } 
            else if (table[i]%2==0){
                even[par] = table[i];
                par++;
            }
            else{
                odd[impar] = table[i];
                impar++;
            }
        }

        System.out.println("There are "+par+" even numbers and they are: ");
        for (int i = 0; i < par; i++) {
            System.out.print(even[i]+"  ");
        }

        System.out.println("\nThere are "+impar+" odd numbers and they are: ");
        
        for (int i = 0; i < impar; i++) {
            System.out.print(odd[i]+"  ");
        }

        System.out.println("\nAnd there are "+cero+" zeros");









        x.close();
    }   
}
