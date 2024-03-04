/**
 * @author sebassvr
 */
/** Existen 3 estados en los hilos.
 * 1. Nuevo (New) // Cuando creamos el hilo.
 *  El hilo (thread), ha sido creado pero no inicializado, es decir, no se
 *  ha ejecutado todavía el método start().
 *  Se producirá un mensaje de error (IILegalThreadStateException) si se intenta
 *  ejecutar cualquier método de la clase Thread Excepto con el método start().
 * 
 * 2. Ejecutable (Runnable) // Cuando le damos start() al hilo.
 *  Cuando el método start() crea los recursos del sistema necesarios para ejecutar
 *  el hilo, programa el thread para ejecutarse, y llama al método run() del thread.
 *  En este punto el hilo está en el estado "Ejecutable".
 * 
 * 3. Bloqueado (Blocked o Not Runnable) // Cuando le damos sleep() al hilo.
 *  En este estado, el hilo se encuentra en ejecución, pero existe una tarea o
 *  actividad del mismo hilo que lo impide.
 * 
 * 4. Muerto (Dead) / Finalizado
 *  Un hilo puede morir de dos formas: por causas naturales o siendo asesinado
 *  (parado). Una muerte natura se produce cuando su método run() termina normalmente,
 *  mientras que una muerte provocada se produce cuando existe una instrucción que
 *  obligue al hilo a finalizar sin haber concluido su tarea por completo.
 */
package estadosdeunhilo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        HiloProceso hilo1 = new HiloProceso("Hilo1"); // Estado 1
        HiloProceso hilo2 = new HiloProceso("Hilo2"); // Estado 1

        hilo1.start(); // Estado 2
        try {
            hilo1.sleep(1000); // Estado 3
        } catch (InterruptedException ex) {
            System.out.println("Error en el hilo1: "+ex);
        }
        
        hilo2.start(); // Estado 2
        hilo2.stop(); // Estado 4
        try {
            hilo2.sleep(3000); // Estado 3
        } catch (InterruptedException ex) {
            System.out.println("Error en el hilo2: "+ex);
        }


    }
}
