// KAPITEL 4 5 6
// 4. Crear un archivo o directorio
// 5. Escritura sobre un archivo de texto
// 6. Lectura de un archivo de texto

package block14_files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author sebassvr
 */
public class ArchivosDeTexto {
    File archivo;
    
    private void crearArchivo(){
        archivo = new File("prueba.txt");
        
        try {
            if (archivo.createNewFile()) {
                System.out.println("El archivo se ha creado correctamente");
            }
        } catch (IOException ex) {
            // Esto es para mandar mensajes de advertencia, error, el texto aparece en rojo.
            // System.err.println("");
            System.err.println("No se pudo crear el archivo "+ex);
        }   
    }
    
    private void crearDirectorio(){
        archivo = new File("carpetaPruebaArchivosDePrueba");
        
        if (archivo.mkdir()) {
            System.out.println("Se ha creado el directorio correctamente");
        }
        else{
            System.err.println("Error, no se ha podido crear el directorio");
        }
    }
    
    private void escribirTexto(){
        try {
            FileWriter escribir = new FileWriter("prueba.txt");
            escribir.write("Hola que tal");
            escribir.write("\r\nMas texto");
            escribir.close();
            
        } catch (IOException ex) {
            System.err.println("Error, no se pudo escribir sobre el archivo");
        }
    }
    
    private void añadirTexto(){
        try {
            FileWriter escribir = new FileWriter(archivo,true);
            escribir.write("\r\nMucho mas texto");
            escribir.write("\r\nAhora más");
            escribir.close();
            
        } catch (IOException ex) {
            System.err.println("Error, no se pudo escribir sobre el archivo");
        }
    }
    
     private void leerTexto(){
        try {
            FileReader lector = new FileReader("prueba.txt");
            BufferedReader lectura = new BufferedReader(lector);
            String linea;
            while ((linea = lectura.readLine()) != null) {
                System.out.println(linea + " Espacio ");
                
            }  
        } catch (FileNotFoundException ex) {
            System.err.println("Error: "+ex);
        } catch (IOException e){
            System.err.println("Error: "+e);
        }
        
    }
    
    public static void main(String[] args) {
        ArchivosDeTexto archivos = new ArchivosDeTexto();
        //archivos.crearDirectorio();
        //archivos.crearArchivo();
        //archivos.escribirTexto();
        //archivos.añadirTexto();   
        archivos.leerTexto();
    }
    
   
    
    
}
