package p3;

public class Comptador implements Runnable {
    private int ini;
    private int fi;

    public Comptador(int ini, int fi) {
        this.ini = ini;
        this.fi = fi;
    }

    @Override
    public void run() {
        while (ini <= fi) {
            System.out.print(Thread.currentThread().getName() + " ");
            System.out.println(ini);
            ini++;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
