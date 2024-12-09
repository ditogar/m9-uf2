package p4.ex4;

import p4.Ratoli;

public class RatoliStoppable extends Ratoli {

    private boolean stop;

    public RatoliStoppable(String nom) {
        super(nom);
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void menja() {
        System.out.println("El ratolí " + getNom() + " ha començat a menjar");
        System.out.println("El ratolí " + getNom() + " està menjant");
        if (stop) {
            System.out.println("El ratolí " + getNom() + " ha acabat de menjar");
        }
    }

    @Override
    public void run() {
        menja();
    }
}
