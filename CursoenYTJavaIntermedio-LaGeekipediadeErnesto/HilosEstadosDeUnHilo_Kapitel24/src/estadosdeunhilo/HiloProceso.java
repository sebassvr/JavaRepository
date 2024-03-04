package estadosdeunhilo;

public class HiloProceso extends Thread {

    public HiloProceso(String nombreHilo) {
        super(nombreHilo);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " " + this.getName());
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Error dentro de la clase: " + ex);
            }
        }
        System.out.println("");
    }

}
