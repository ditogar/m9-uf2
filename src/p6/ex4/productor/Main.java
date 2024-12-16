package p6.ex4.productor;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        for (int i = 0; i < 3; i++) {
            new Thread(new Productor(stack)).start();
        }

        for (int i = 0; i < 3; i++) {
            new Thread(new Consumidor(stack)).start();
        }
    }
}
