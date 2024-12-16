package p4.ex9;

public class Bevedor implements Runnable {
    private Ampolla ampolla;
    private Got got;

    public Bevedor(Ampolla ampolla) {
        this.ampolla = ampolla;
        this.got = new Got(ampolla);
    }

    public void beure() {
        int centilitres = got.getCentilitres();
        if (centilitres == 0) {
            got.omplir();
        }
        if (centilitres >= 2) {
            got.setCentilitres(centilitres - 2);
        }
        System.out.println(Thread.currentThread().getName() + " capacitat del got = " + centilitres);
    }

    @Override
    public void run() {
        while (true) {
            int time = (int) ((Math.random() * 6) + 1) * 100;
            beure();
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
