package p6.ex5;

public class Passatger implements Runnable {
    private static int comptador = 0;
    private int num = 0;
    private Bus bus;

    public Passatger(Bus bus) {
        this.num = comptador++;
        this.bus = bus;
    }

    @Override
    public void run() {
        try {
            bus.puja();
            bus.baixa();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
