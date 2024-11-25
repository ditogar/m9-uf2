package p3.ex1;

public class Ex5_3 {
    public static void main(String[] args) {
        Thread mickey = new Thread(new Ratoli("Mickey"));
        Thread minnie = new Thread(new Ratoli("Minnie"));
        Thread jerry = new Thread(new Ratoli("Jerry"));

        minnie.setPriority(Thread.MAX_PRIORITY);

        mickey.start();
        minnie.start();
        jerry.start();
    }
}
