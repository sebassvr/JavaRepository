/**
 *
 * @author sebassvr
 */

package AgendaDeContactos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
    File texto;
    private String nombre, correo, celular;
    private String[] partes; // Almacena cada linea leida.
    
    public Archivo(Persona persona){
        nombre = persona.getNombre();
        correo = persona.getCorreo();
        celular = persona.getCelular();
        escribirArchivo();
    }
    
    private void escribirArchivo(){
        crearArchivo();
        try (
                FileWriter escribir = new FileWriter(texto, true);
                BufferedWriter escribirAgendaContactos = new BufferedWriter(escribir);
            )
        {
            escribirAgendaContactos.append(nombre+";"+correo+";"+celular);
            escribirAgendaContactos.newLine();
        } catch (IOException ex) {
            //
        }
        
    }
    
    private void crearArchivo(){
        texto = new File("AgendaContactos.txt");
    }
    
    
    
}
