package p4.ex9;

public class Main {
    public static void main(String[] args) {
        Ampolla ampolla = new Ampolla();

        Thread b1 = new Thread(new Bevedor(ampolla));
        Thread b2 = new Thread(new Bevedor(ampolla));
        Thread c = new Thread(new Cambrer(ampolla));

        b1.start();
        b2.start();
        c.start();
    }
}
