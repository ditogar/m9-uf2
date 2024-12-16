package p3.ex1;

import p3.Ratoli;

public class Ex7 {
    public static void main(String[] args) {
        Thread mickey = new Thread(new Ratoli("Mickey"));
        Thread minnie = new Thread(new Ratoli("Minnie"));
        Thread jerry = new Thread(new Ratoli("Jerry"));

        mickey.setName("Mickey");
        minnie.setName("Minnie");
        jerry.setName("Jerry");

        mickey.start();
        minnie.start();
        jerry.start();
    }
}
