package p3.ex1;

public class Comptador implements Runnable {
    private int ini;
    private int fi;

    public Comptador(int ini, int fi) {
        this.ini = ini;
        this.fi = fi;
    }

    @Override
    public String toString() {
        return "Comptador " + ini + " : " + fi;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        while (ini <= fi) {
            System.out.println(this);
            ini++;
        }
    }
}
