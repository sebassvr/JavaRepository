
package archivo_binarios;

import java.io.Serializable;

/**
 *
 * @author sebassvr
 */
public class Persona implements Serializable{ // Hacemos que estos objetos se puedan transformar a bytes.
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\n");
    }
    
}
