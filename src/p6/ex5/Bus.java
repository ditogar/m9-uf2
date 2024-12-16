package p6.ex5;

import java.util.List;

public class Bus {
    private final int CAPACITAT = 10;
    private int passatgers = 0;
    private List<Parada> parades;

    public Bus(List<Parada> parades) {
        this.parades = parades;
    }
    public synchronized void puja() {
        while (passatgers >= CAPACITAT) {
            try {
                System.out.println("El bus està ple. " + Thread.currentThread().getName() + " espera");
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("El passatger " + Thread.currentThread().getName() + " puja al bus.");
        passatgers++;
    }

    public synchronized void baixa() {
        if (passatgers > 0) {
            try {
                System.out.println("El passatger " + Thread.currentThread().getName());
                passatgers--;
                notify();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
