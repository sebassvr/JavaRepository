/**
 *
 * @author sebassvr
 */
package sincronizacionhilos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        // Creamos los hilos.
        Hilo1 hilo1 = new Hilo1();
        Hilo2 hilo2 = new Hilo2();
        Hilo3 hilo3 = new Hilo3();
        Hilo4 hilo4 = new Hilo4();
        
        // Inicializamos los hilos
        // Hilo 1
        hilo1.start();
        try {
            hilo1.sleep(10);
        } catch (InterruptedException ex) {
            System.out.println("Error1: "+ex);
        }
        
        // Hilo 2
        hilo2.start();
        try {
            hilo2.sleep(10);
        } catch (InterruptedException ex) {
            System.out.println("Error2: "+ex);
        }
        
        // Hilo 3
        hilo3.start();
        try {
            hilo3.sleep(10);
        } catch (InterruptedException ex) {
            System.out.println("Error3: "+ex);
        }
        
        // Hilo 4
        hilo4.start();
        try {
            hilo4.sleep(10);
        } catch (InterruptedException ex) {
            System.out.println("Error4: "+ex);
        }
        
        
        
    }
}
