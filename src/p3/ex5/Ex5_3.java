package p3.ex5;

import p4.Ratoli;

public class Ex5_3 {
    public static void main(String[] args) {
        Ratoli mickey = new Ratoli("Mickey");
        Ratoli minnie = new Ratoli("Minnie");
        Ratoli jerry = new Ratoli("Jerry");

        Thread tmickey = new Thread(mickey);
        Thread tminnie = new Thread(minnie);
        Thread tjerry = new Thread(jerry);

        tminnie.setPriority(Thread.MAX_PRIORITY);

        tmickey.start();
        tminnie.start();
        tjerry.start();
    }
}
