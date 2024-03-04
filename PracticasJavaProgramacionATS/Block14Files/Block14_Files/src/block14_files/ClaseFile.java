// KAPITEL 3.
// 3. La clase File
package block14_files;

import java.io.File;

/**
 *
 * @author sebassvr
 */
public class ClaseFile {
    public static void main(String[] args) {
        File directorio = new File("carpetaPrueba");
        
        if (directorio.exists()) { // Si el archivo existe.
            System.out.println("El archivo si existe");
            System.out.println("Ruta absoluta: "+directorio.getAbsolutePath());
            System.out.println("¿Es un archivo? "+ directorio.isFile());
            System.out.println("¿Se puede leer? "+directorio.canRead());
        
        
        }
        else{
            System.out.println("El archivo mo existe");
        }
        
        
        
        
    }
}
