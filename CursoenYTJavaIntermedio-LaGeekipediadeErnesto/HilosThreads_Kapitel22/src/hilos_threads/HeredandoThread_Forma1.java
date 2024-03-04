package hilos_threads;

public class HeredandoThread_Forma1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Proceso 1");
        }

    }

}
