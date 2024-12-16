package p5.e3;

import p5.e2.MyStack;

public class ConsumidorPila implements Runnable {
    private MySynchronizedStack stack;

    public ConsumidorPila(MySynchronizedStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        while (true) {
            stack.pop();
            System.out.println("Consumidor: " + stack);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
