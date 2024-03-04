/**
 *
 * @author sebassvr
 */
package hilosconparametros;

public class Main {

    public static void main(String[] args) {
        Proceso hilo1 = new Proceso("Hilo1"); // Mandamos un String para establecer el nombre del hilo
        Proceso hilo2 = new Proceso("Hilo2");
        Proceso hilo3 = new Proceso("Hilo3");
        
        // Mandamos los parametros a los hilos
        hilo1.ValorDeLaCondicion(3);
        hilo2.ValorDeLaCondicion(5);
        hilo3.ValorDeLaCondicion(8);
        
        // Iniciamos los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }   

}
