package p4.ex9;

public class Cambrer implements Runnable {
    private Ampolla ampolla;

    public Cambrer(Ampolla ampolla) {
        this.ampolla = ampolla;
    }

    @Override
    public void run() {
        while (true) {
            if (ampolla.getCentilitres() == 0) {
                ampolla.setCentilitres(Ampolla.CAPACITAT);
            }
        }
    }
}
