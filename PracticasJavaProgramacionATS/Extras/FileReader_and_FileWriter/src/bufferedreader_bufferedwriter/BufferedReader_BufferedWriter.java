package bufferedreader_bufferedwriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReader_BufferedWriter {
    public static void main(String[] args) {
        try (   
                BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\User\\OneDrive\\Documentos\\Learning Programming\\Java\\Practicas - Java - Programacion ATS\\Extras\\FileReader_and_FileWriter\\nuevo_archivo.txt"),true));
                BufferedReader br = new BufferedReader(new FileReader("nuevo_archivo.txt"));
            )
        {
            // Escribimos en el fichero.
            bw.write("Esto es una prueba usando Buffered");
            bw.newLine();
            bw.write("Seguimos usando Buffered");
            bw.newLine();
            //Guardamos los cambios del fichero.
            bw.flush();
            // Leemos el fichero y lo mostramos por pantalla.
            
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            // Otra forma mas larga de leer e imprimir.
            /*
            String linea = br.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }*/
            
            
        } catch (IOException e) {
            System.out.println("Error E/S: "+e);
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
}
