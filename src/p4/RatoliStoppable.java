package p4;

public class RatoliStoppable extends Ratoli {
    private boolean stop;

    public RatoliStoppable(String nom) {
        super(nom);
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while (!stop) {
            super.run();
        }
    }
}
