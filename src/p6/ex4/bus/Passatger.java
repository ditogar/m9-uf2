package p6.ex4.bus;

import p6.ex4.bus.Bus;

public class Passatger implements Runnable {
    private Bus bus;

    public Passatger(Bus bus) {
        this.bus = bus;
    }

    @Override
    public void run() {
        bus.puja();
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        bus.baixa();
    }
}
