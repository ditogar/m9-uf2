package p4;

import java.util.ArrayList;

public class RatoliPareJoin extends Ratoli {
    private ArrayList<Thread> fills;

    public RatoliPareJoin(String nom, ArrayList<Thread> fills) {
        super(nom);
        this.fills = fills;
    }

    @Override
    public void menja() {
        super.menja();
    }

    @Override
    public void run() {
        try {
            for (Thread t : fills) {
                t.join();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        menja();
    }
}
