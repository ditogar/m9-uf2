package p4;

import java.util.ArrayList;

public class RatoliPare extends Ratoli {
    private ArrayList<RatoliStoppable> fills;

    public RatoliPare(String nom, ArrayList<RatoliStoppable> fills) {
        super(nom);
        this.fills = fills;
    }

    public RatoliPare(String nom) {
        super(nom);
    }

    private boolean recorrerFills() {
        for (RatoliStoppable fill : fills) {
            if (!fill.isStop()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void run() {
        while (recorrerFills()) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        menja();
    }
}
