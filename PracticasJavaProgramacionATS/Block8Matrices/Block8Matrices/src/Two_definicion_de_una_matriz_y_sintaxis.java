/* ¿QUÉ ES UNA MATRIZ?
 *      
 *      Una matriz en un arreglo bidimensional, necesita dos indices para
 *      acceder a sus elementos. Gráficamente podemos representar una matriz
 *      como una tabla de n filas y m columnas cuyos elementos son todos del
 *      mismo tipo.
 *  
 *      La siguiente figura representa una matriz M de 3 filas y 5 columnas:
 *  
 *          0    |    1  |    2  |    3  |     4  |
 *  
 *      -------------------------------------------  
 *    0  |  1    |   2   |   3   |   4   |   5   |
 *       -----------------------------------------
 *    1  |  2    |   4   |   6   |   8   |   10  |
 *       -----------------------------------------
 *    2  |  3    |   6   |   9   |   12  |   15  | 
 *  
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Two_definicion_de_una_matriz_y_sintaxis {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
    /*    
        // Esta es la manera manual de rellenar una matriz.
        int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
    
        // Imprimir una matriz.
    
        for (int i = 0; i < 3; i++) {  // Numero de filas.
            for (int j = 0; j < 3; j++) {  // Numero de columnas.
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("");
        }
    */

    // Ingresando datos.

    int matriz[][], nFilas, nCol;
    
    nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
    nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));

    matriz = new int[nFilas][nCol];

    // Pedir los numeros
    for (int i = 0; i < nFilas; i++) {  // Numero de filas.
        for (int j = 0; j < nCol; j++) {  // Numero de columnas.
            System.out.println("Ingrese un dato para la posicion ["+(i+1)+"]["+(j+1)+"]: ");
            matriz[i][j] = x.nextInt();
        }
    }

    // Imprimir una matriz.
    System.out.println("La matriz es: ");
    for (int i = 0; i < nFilas; i++) {  // Numero de filas.
        for (int j = 0; j < nCol; j++) {  // Numero de columnas.
            System.out.print(matriz[i][j]+"  ");
        }
        System.out.println("");
    }
    
    
    x.close();    
    }

}
