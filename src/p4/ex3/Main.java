package p4.ex3;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread();
        thread1.start();
        System.out.println(thread1.getName());

        Thread thread2 = new Thread();
        thread2.start();
        thread2.setName("Prova");
        System.out.println(thread2.getName());
    }
}
