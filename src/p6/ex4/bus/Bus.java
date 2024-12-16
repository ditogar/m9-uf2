package p6.ex4.bus;

public class Bus {
    private final int CAPACITAT = 5;
    private int comptador;

    public Bus() {
        this.comptador = 0;
    }

    public synchronized void puja() {
        while (comptador >= CAPACITAT) {
            try {
                System.out.println("El passatger " + Thread.currentThread().getName() + " està esperant.");
                wait();
            } catch (Exception e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
        comptador++;
        System.out.println("El passatger " + Thread.currentThread().getName() + " ha pujat.");
    }

    public synchronized void baixa() {
        if (comptador > 0) {
            try {
                System.out.println("El passatger " + Thread.currentThread().getName() + " ha baixat del bus.");
                comptador--;
                notify();
            } catch (Exception e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }
}
