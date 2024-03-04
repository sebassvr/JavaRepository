
package Ventanas;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sebassvr
 */
public class AñadirBinario extends ObjectOutputStream{

    public AñadirBinario(OutputStream out) throws IOException {
        super(out);
    }

    public AñadirBinario() throws IOException, SecurityException {
    }
    
    // Sobreescribimos este método para que no se siga añadiendo la cabecera que impide que se pueda leer el archivo binario.
    @Override
     public void writeStreamHeader(){
         File archivo = new File("atletas.bin");
        try {
            if (archivo.length() == 0) {
                 super.writeStreamHeader();
            }
            else{
                reset();
            }
        }catch (IOException ex) {
                 Logger.getLogger(AñadirBinario.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
} // Fin
