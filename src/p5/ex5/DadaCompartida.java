package p5.ex5;

public class DadaCompartida implements Runnable {
    public static int comptador = 0;
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            synchronized (DadaCompartida.class) {
                comptador++;
            }
        }
    }
}
