/*      Block : Metodos de Ordenamientos.
 *      
 *  ¿Qué es el ordenamiento por Inserción?
 *      Es una manera muy natural de ordenar para un ser
 *      humanod, y puede usarse fácilmente para ordenar un
 *      mazo de cartas numeradas en forma arbitraria. Requiere
 *      o(n^2) operaciones para ordenar una lista de n elementos.
 *  
 *      EJEMPLO:
 *      5 | 3 | 4 | 1 | 2 
 *  
 *      Comprobar si el elemento de su izquierda ya es menor que el
 *  
 *      Si numeroIzq > numeroActual
 *               cambio
 *  
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Three_ordenamiento_por_insercion {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int arreglo[],nElementos,pos,aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of elements: "));

        arreglo = new int[nElementos];

        System.out.println("Digite el arreglo: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println("Enter a number: ");
            arreglo[i] = x.nextInt();
            }
        
        // Ordenamiento por Insercción

        for(int i=0; i<nElementos; i++){
            pos = i;
            aux = arreglo[i];

            while((pos > 0 ) && (arreglo[pos-1] > aux)){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux;
        }

        //Imprimir ordenadamente
        System.out.println("Print ordenadamente: ");
        for (int i = 0; i<nElementos ; i++) {
            System.out.print(arreglo[i]+"  ");
        }

        //Imprimir ordenamente inverso
        System.out.println("\n\nPrint ordenadamente inverso: ");
        for (int i = (nElementos-1); i>=0 ; i--) {
            System.out.print(arreglo[i]+"  ");
        }




        x.close();
    }
}
