package p5.e2;

import p5.MyStack;

public class ConsumidorPila implements Runnable {
    private MyStack stack;

    public ConsumidorPila(MyStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        do {
            stack.pop();
            System.out.println("Consumidor " + stack);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println("Se ha producido un error.");
            }
        } while (stack.getIdx() != -1);
    }
}
