/*      Block - Arrays 
 *  Exercise 12.
 *  Leer por teclado una tabla de 10 elementos numéricos enteros y una
 *  posición (entre 0 y 9). Eliminar el elemento situado en la posición
 *  dada sin dejar huecos.
 */

import java.util.Scanner;

public class Sixteen_exercise_twelve_read_for_keys_a_table_of_ten_elements {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int[] numbers = new int[10];
        int delete, position = 0;

            // Ingresar los los numeros.
        for (int i = 0; i < 10; i++) {
            System.out.println("Position."+(i+1)+" Enter a number");
            numbers[i] = x.nextInt();
        }
            //Ingresar el numero a eliminar.
        System.out.println("What number do you want to delete?:");
        delete = x.nextInt();
        
            // Guardar la posicion del numero.
        for (int i = 0; i < 10; i++) {
            if(numbers[i] == delete){
                position = i;
            }
        }

            //Cambio sin dejar huecos.
        for (int i = position ; i < 9; i++) {
            numbers[i] = numbers[i+1];
        }

        System.out.println("\n");

            //Imprimir.
        for (int i = 0; i < 9; i++) {
            System.out.print(numbers[i]+"  -  ");
        }








        x.close();
    }
}
