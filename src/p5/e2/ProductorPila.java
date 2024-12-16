package p5.e2;

import p5.e2.MyStack;

public class ProductorPila implements Runnable {
    private MyStack stack;

    public ProductorPila(MyStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        while (true) {
            stack.push('A');
            System.out.println("Productor " + stack);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
