package sincronizacionhilos;

public class Hilo1 extends Thread{

    @Override
    public void run(){
        for (int i = 0; i <= 5; i++) {
            System.out.print(i+": G");
            
            try {
                Hilo1.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Error clase1: "+ex);
            }
        
        }
    }
}
