
package lecturaCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

public class ManipularCSV {
    private BufferedReader lector; // Lee el archivo.
    private String linea; // Recibe la linea de cada fila.
    private String partes[] = null; // Almacena cada linea leida.
    
    public void leerArchivo(String nombreArchivo) {
        try {
            lector = new BufferedReader(new FileReader("archivodepruebas.txt"));
            while ((linea = lector.readLine()) != null) {
                partes = linea.split(",");
                imprimirLinea();
                System.out.println("");
            }
            lector.close();
            linea = null;
            partes = null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void imprimirLinea(){
        for(int i=0; i<partes.length; i++){
            
            if(i < 4 ){
                System.out.print(partes[i]+" ");
            }
        }
        System.out.println("\n");
    }



}
