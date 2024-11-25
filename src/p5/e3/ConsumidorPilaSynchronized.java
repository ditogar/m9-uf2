package p5.e3;

import p5.MyStack;

public class ConsumidorPilaSynchronized implements Runnable {
    private MyStack stack;

    public ConsumidorPilaSynchronized(MyStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        do {
            synchronized (this) {
                stack.pop();
            }
            System.out.println("Consumidor " + stack);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println("Se ha producido un error.");
            }
        } while (stack.getIdx() != -1);
    }
}
