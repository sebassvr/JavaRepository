package sincronizacionhilos;

public class Hilo4 extends Thread{
    
    @Override
    public void run(){
        for (int i = 0; i <= 5; i++) {
            System.out.print("K\n");
            
            try {
                Hilo4.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Error clase4: "+ex);
            }
            
        }
    }
}
