
package archivo_binarios;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sebassvr
 */
public class AñadirContenido extends ObjectOutputStream{

    public AñadirContenido(OutputStream out) throws IOException {
        super(out);
    }
    
    public AñadirContenido() throws IOException, SecurityException {
    }
    

    // Sobreescribimos este método para que no se siga añadiendo la cabecera que impide que se pueda leer el archivo binario.
    @Override
     public void writeStreamHeader(){
        try {
            reset();
        } catch (IOException ex) {
            Logger.getLogger(AñadirContenido.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
}
