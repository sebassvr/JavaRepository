/*      Ordenamiento por Selección
 *  ¿Qué es el ordenamiento por Selección?
 *      Es un algoritmo de ordenamiento que requiere O(n^2) operaciones para
 *      ordenar una lista de números. Su funcionamiento es el siguiente:
 *  
 *      1. Buscar el mínimo elemento de la lista.
 *      2. Intercambiar con el primer elemento.
 *      3. Buscar el mínimo del resto de la lista.
 *      4. Intercambiar con el segundo.
 *      5. Y así sucesivamente.
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Four_ordenamiento_por_seleccion {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int arreglo[], nElementos, min, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos: "));

        arreglo = new int[nElementos];

        System.out.println("Rellenando el arreglo: ");
        
        for(int i = 0; i<nElementos; i++){
            System.out.println((i+1)+". Digite un numero: ");
            arreglo[i] = x.nextInt();
        }

        // Ordenamiento por selección.

        for (int i = 0; i < nElementos; i++) {
            min = i;
            
            for (int j = i+1; j < nElementos; j++) {
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }
            aux = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = aux;
        }

        // Imprimir orden creciente
        System.out.println("\nOrden creciente: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i]+"  ");
        }

        // Imprimir orden decreciente
        System.out.println("\n\nOrden creciente: ");
        for (int i = (nElementos-1); i >= 0; i--) {
            System.out.print(arreglo[i]+"  ");
        }


        x.close();
    }
}
