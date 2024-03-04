package hilos_threads;

public class Main {

    public static void main(String[] args) {
        
        // Primero debemos crear ambos objetos y luego iniciarlos.
        // No debemos crear un objeto y iniciarlo y luego crear otro objeto y luego iniciarlo por que seria como no estar usando hilos.
        HeredandoThread_Forma1 hilo1 = new HeredandoThread_Forma1();
        Thread hilo2 = new Thread(new ImplementandoRunnable_Forma2());
    
        
        // Ahora hacemos que arranquen los hilos con el metodo start().
        hilo1.start();
        hilo2.start();
        
    }
}
