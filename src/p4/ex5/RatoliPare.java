package p4.ex5;

import p4.Ratoli;
import java.util.ArrayList;

public class RatoliPare extends Ratoli {
    private ArrayList<Thread> fills;

    public RatoliPare(String nom, ArrayList<Thread> fills) {
        super(nom);
        this.fills = fills;
    }

    private boolean fillsAlimentats() {
        for (Thread t : fills) {
            if (t.isAlive()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        for (Thread t : fills) {
            t.start();
        }
        while (!fillsAlimentats()) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        super.run();
    }
}
