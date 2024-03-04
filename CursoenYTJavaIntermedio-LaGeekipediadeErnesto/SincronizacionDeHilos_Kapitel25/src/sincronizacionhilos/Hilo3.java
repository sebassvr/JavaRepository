package sincronizacionhilos;

public class Hilo3 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <= 5; i++) {
            System.out.print("E");
            
            try {
                Hilo3.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Error clase3: "+ex);
            }
            
        }
    }
}
