// KAPITEL 11, 12, 13, 14
// 11. Ejercicio 1 - Crear una agenda de contactos (parte 4)
// 12. Escritura sobre un archivo binario
// 13. Lectura de un archivo binario
// 14. Añadir contenido a un archivo binario

package archivo_binarios;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sebassvr
 */
public class ArchivosBinarios {
    
    // PARA CREAR EL ARCHIVO EN CASO DE QUE NO ESTE CREADO.
    // PARA ESCRIBIR EN EL ARCHIVO BINARIO.
    private void escribirBinario(){
        // Instanciamos el archivo si no esta creado todavia.
        try {
            FileOutputStream archivo = new FileOutputStream("personas.bin");
            // Para escribir.
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            
            // Instanciamos un objeto de persona.
            Persona persona1 = new Persona("Elpepe", 21);
            Persona persona2 = new Persona("PepeMayor", 25);
            Persona persona3 = new Persona("Pepito", 18);
            
            // Escribimos objetos sobre el archivo binario.
            escritura.writeObject(persona1);
            escritura.writeObject(persona2);
            escritura.writeObject(persona3);
            
            escritura.close();
            
        } catch (FileNotFoundException ex) {
            System.err.println("Error: "+ex);
        } catch (IOException ex) {
            System.err.println("Error: "+ex);
        }
    }
    
    // PARA AÑADIR CONTENIDO AL ARCHIVO BINARIO.
    private void añadirBinario(){
        // Instanciamos el archivo si no esta creado todavia.
        try {
            FileOutputStream archivo = new FileOutputStream("personas.bin",true);
            // Para escribir.
            AñadirContenido escritura = new AñadirContenido(archivo);
            
            // Instanciamos un objeto de persona.
            Persona persona1 = new Persona("Juan", 16);
            Persona persona2 = new Persona("Luc", 28);
            
            // Escribimos objetos sobre el archivo binario.
            escritura.writeObject(persona1);
            escritura.writeObject(persona2);
            
            // Cerramos el archivo.
            escritura.close();
            
        } catch (FileNotFoundException ex) {
            System.err.println("Error: "+ex);
        } catch (IOException ex) {
            System.err.println("Error: "+ex);
        }
    }
    
    // PARA LEER BINARIOS.
    private void leerBinario(){
        // Creamos un objeto persona para leer el archivo que contiene objetos.
        Persona objetoPersona;
        try {
            FileInputStream archivo = new FileInputStream("personas.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            
            while(true){ // Recorremos el archivo binario.
                objetoPersona = (Persona)lectura.readObject();
                objetoPersona.mostrarDatos();
            } 
            
        }catch(EOFException ex){
            return; // Excepción cuando finaliza de leer de todo el archivo binario.
        } catch (FileNotFoundException ex) {
            System.err.println("Error: "+ex);
        } catch (IOException ex) {
            System.err.println("Error: "+ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("Error: "+ex);
        }
    
    
    }
    
    
    public static void main(String[] args) {
        ArchivosBinarios archivos = new ArchivosBinarios();
        
        //archivos.escribirBinario();
        archivos.añadirBinario();
        archivos.leerBinario();
    }
}
