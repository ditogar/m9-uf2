package p6.ex1;

public class Passatger implements Runnable {
    private Bus bus;

    public Passatger(Bus bus) {
        this.bus = bus;
    }

    @Override
    public void run() {
        bus.puja();
        try {
            Thread.sleep((int) ((Math.random() * 10) + 1) * 1000);
        } catch (Exception e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
        bus.baixa();
    }
}
