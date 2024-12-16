package p6.ex5;

import java.util.ArrayList;
import java.util.List;

public class Parada {
    private List<Passatger> passatgersEsperant = new ArrayList<>();

    public void setPassatgersEsperant(List<Passatger> passatgersEsperant) {
        this.passatgersEsperant = passatgersEsperant;
    }

    public synchronized void esperaPassatger(Passatger p) {
        passatgersEsperant.add(p);
    }

    public synchronized void despertaPassatgers() {
        for (Passatger p : passatgersEsperant) {
            p.notify();
        }
    }
}
