/*      Block : Busquedas en Java
 *      Búsqueda Secuencial.
 *  
 *      arreglo[] = {3,1,2,5,4}; dato = 2;
 *  
 *  
 */

import javax.swing.JOptionPane;

public class Two_busqueda_secuencial {
    public static void main(String[] args) {
        int arreglo[] = {4,1,5,2,3};
        int dato;
        boolean band = false;

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar: "));

        // Búsqueda Secuencial.
        int i=0;
        while (i<5 && band == false) {
            if(arreglo[i] == dato){
                band = true;
            }
            i++;
        }

        if (band == false) {
            JOptionPane.showMessageDialog(null, "El numero no se encuentra en el arreglo.");
        }
        else{
            JOptionPane.showMessageDialog(null, "El número ha sido encontrado en la posición: "+(i-1));
        }




    }

}
