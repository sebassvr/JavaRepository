/*      Block : Arrays
 *      Exercise 14.
 *      Leer dos series de 10 enteros, que estarán ordenados crecientemente. Copiar
 *      (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.    
 *  
 */

import java.util.Scanner;

public class Eighteen_exercise_fourteen_read_two_arrays_and_fusion_ordenadamente{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int[] a = new int[10]; 
        int[] b = new int[10];
        int[] c = new int[20];
        int j=0 , k=0, h=0;
        
        System.out.println("A continuacion rellenaremos las tablas: \n\tTABLA 1");
        
        for (int i=0 ; i < 10 ; i++) {
            System.out.println("Position "+(i+1)+". Ingrese un numero: ");
            a[i] = x.nextInt();
        }
        System.out.println("\n\n\tTABLA 2");
        
        for (int i = 0 ; i < 10; i++) {
            System.out.println("Position "+(i+1)+". Ingrese un numero: ");
            b[i] = x.nextInt();
        }

        while (j < 10 && k < 10) {
                if (a[j] < b[k]) {
                    c[h] = a[j];
                    j++;
                    h++;
                } 
                else{
                    c[h] = b[k];
                    k++;
                    h++;
                }
        }
        
        if (j < 10) {
            while(j < 10){
                c[h] = a[j];
                j++;
                h++;
            }
        } 
        else {
            while(k < 10){
                c[h] = b[k];
                k++;
                h++;
            }
        }

        //Mostrar table3
        
        System.out.println("\tTABLE 3 ORDENADA");
        for (int i = 0; i < 20 ; i++) {
            System.out.println(c[i]+"  ");
        }


        x.close();
    }

}