package p6.ex1;

public class Bus {
    private final int CAPACITAT = 5;
    private int passatgersPujats = 0;

    public synchronized void puja() {
        while (passatgersPujats >= CAPACITAT) {
            try {
                System.out.println(Thread.currentThread().getName() + " està esperant per pujar.");
                wait();
            } catch (Exception e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
        passatgersPujats++;
        System.out.println(Thread.currentThread().getName() + " ha pujat al bus.\n" +
                "Passatgers totals " + passatgersPujats);
    }
    public synchronized void baixa() {
        if (passatgersPujats > 0) {
            passatgersPujats--;
            System.out.println(Thread.currentThread().getName() + " ha baixat del bus.\n" +
                    "Passatgers totals " + passatgersPujats);
            notifyAll();
        }
    }
}
