package filereader_filewriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader_FileWriter {
    
    public static void main(String[] args) {
        try{
            
            // Abro stream, crea el fichero si no existe.
            FileWriter fw = new FileWriter("fichero1.txt");
            //Escribimos en el fichero un String y un caracter  97 = (a) en asci.
            fw.write("Esto es una prueb");
            fw.write(97);
            fw.write("\r\n"); // Salto de linea.
            // Cierro el stream.
            fw.close();

                // Abre el stream el fichero debe existir.
            FileReader fr = new FileReader("fichero1.txt");
            //Leemos el fichero y lo mostramos por pantalla.
            int valor = fr.read();
            while(valor!=-1){
                System.out.print((char)valor);
                valor = fr.read();
            }
            // Cerramos el stream.
            fr.close();
        }catch(IOException e){
            System.out.println("Error E/S"+e);
        }
        
        // Esta es otra forma de hacerlo y que se cierre automaticamente.
        /*try(
                FileWriter fw = new FileWriter("fichero1.txt");
                FileReader fr = new FileReader("fichero1.txt")
            ){
            
            //Escribimos en el fichero un String y un caracter  97 = (a) en asci.
            fw.write("Esto es una prueb");
            fw.write(97);
            fw.write("\r\n"); // Salto de linea.
            
            // Guardamos los cambios del fichero.
            fw.flush();

            //Leemos el fichero y lo mostramos por pantalla.
            int valor = fr.read();
            while(valor!=-1){ // Mientras valor sea diferente de -1, cuando llega al final devuelve un -1, por eso finaliza ahi.
                System.out.print((char)valor);
                valor = fr.read();
            }
            // Cerramos el stream.
            
        }catch(IOException e){
            System.out.println("Error E/S"+e);
        }*/
    }
}
