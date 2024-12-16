package p6.ex4.productor;

public class Productor implements Runnable {
    private static int counter = 0;
    private int num = 0;
    private Stack stack = new Stack();

    public Productor(Stack stack) {
        this.num = counter++;
        this.stack = stack;
    }

    @Override
    public void run() {
        while (true) {
            stack.push('A');
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
