package p5.e2;

public class ConsumidorPila implements Runnable {
    private MyStack stack;

    public ConsumidorPila(MyStack stack) {
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
