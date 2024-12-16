package p6.ex4.bus;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();

        for (int i = 0; i < 50; i++) {
            new Thread(new Passatger(bus)).start();
        }
    }
}