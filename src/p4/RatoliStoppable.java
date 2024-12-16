package p4;

public class RatoliStoppable extends Ratoli {
    private boolean stop = false;
    public RatoliStoppable(String nom) {
        super(nom);
    }

    public boolean isStop() {
        return stop;
    }

    @Override
    public void menja() {
        int seconds = 0;
        System.out.println("El ratolí " + getNom() + " ha començat a menjar");
        while (!stop) {
            System.out.println("El ratolí " + getNom() + " està menjant");
            if (seconds >= 6) stop = true;
            try {
                Thread.sleep(1000);
                seconds++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("El ratolí " + getNom() + " ha acabat de menjar");
    }

    @Override
    public void run() {
        menja();
    }
}
