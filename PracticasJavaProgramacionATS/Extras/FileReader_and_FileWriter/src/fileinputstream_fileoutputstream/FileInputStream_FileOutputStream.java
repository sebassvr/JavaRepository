package fileinputstream_fileoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileInputStream_FileOutputStream {
    public static void main(String[] args) {
        try(
                FileOutputStream fos = new FileOutputStream("C:\\Users\\User\\OneDrive\\Documentos\\Learning Programming\\Java\\Practicas - Java - Programacion ATS\\Extras\\FileReader_and_FileWriter\\fichero_bin.ddr");
                FileInputStream fis = new FileInputStream("fichero_bin.ddr");
            )
        {
            String texto = "Esto es una prueba para ficheros binariossss";
            
            // Copiamos el texto en un array de bytes.
            byte codigos[] = texto.getBytes();
            
            fos.write(codigos);
            
            
        } catch(FileNotFoundException ex) {
            Logger.getLogger(FileInputStream_FileOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileInputStream_FileOutputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
