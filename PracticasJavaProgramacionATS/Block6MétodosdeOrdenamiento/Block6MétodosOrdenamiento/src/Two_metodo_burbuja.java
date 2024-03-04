/* Método Burbuja
 *  
 *  ¿Qué es el método burbuja?
 *      Es un sencillo algoritmo de ordenamiento. Funciona revisando cada 
 *      elemento de la lista que va a ser ordenada con el siguiente,
 *      intercambiándolos de posición si están en el orden equivocado. Es
 *      necesario revisar varias veces toda la lista hasta que no se necesiten más
 *      intercambios, lo cual significa que la lista está ordenada.
 *  
 *      EJEMPLO:
 *      4 | 5 | 2 | 1 | 3
 *  
 *      Si numeroActual > numeroSiguiente
 *                  Cambio
 *  
 *  
 *  
 */

public class Two_metodo_burbuja {
    public static void main(String[] args) {
        int[] table = {5,2,3,4,1};
        int aux;
        // Imprimir desordenado
        System.out.println("\n\n\tTabla desordenada: ");
        for (int i = 0 ; i < 5 ; i++) {
            System.out.print(table[i]+"  ");
        }

        //Método burbuja.
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < (4-i); j++) {
                if (table[j] > table[j+1]) {
                    aux = table[j];
                    table[j] = table[j+1];
                    table[j+1] = aux;
                }
            }
        }

        // Imprimir ya ordenado.
        System.out.println("\n\n\tTabla ordenada: ");
        for (int i = 0 ; i<5 ; i++) {
            System.out.print(table[i]+" ");
        }



    }
}
