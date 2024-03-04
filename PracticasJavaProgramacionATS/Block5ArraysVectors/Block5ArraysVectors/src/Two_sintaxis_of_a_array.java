/*  
 *      ARRAYS UNIDIMENSIONALES
 *  Sintaxis:
 *  
 *      Tipo_de_variable[] Nombre_del_array = new Tipo_de_variable[dimensión];
 *      
 *      Ejemplos:
 *    - int[] edad = new int[4];
 *    - long[] edad = new long[4];
 *    - float[] estatura = new float[3];
 *    - double[] estatura = new double[3];
 *    - boolean[] estado = new boolean[5];
 *    - char[] sexo = new char[2];
 *    - String[] nombre = new String[2];
 *  
 *    Tambien podemos hacer con valores definidos.
 *      Ejemplo:
 *  
 *      int[] numeros = {5,7,9};
 *  
 */

public class Two_sintaxis_of_a_array {
    public static void main(String[] args) {
        int[] numeros = {1,25,8,3,5,996,6};
    
        for (int i = 0; i < 7; i++) {
            System.out.println(numeros[i]);
        }
    
    }
}
