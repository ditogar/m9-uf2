package p3.ex2;

import p4.Ratoli;

public class Ex2 {
    public static void main(String[] args) {
        Ratoli mickey = new Ratoli("Mickey");
        Ratoli minnie = new Ratoli("Minnie");
        Ratoli jerry = new Ratoli("Jerry");

        Thread tmickey = new Thread(mickey);
        Thread tminnie = new Thread(minnie);
        Thread tjerry = new Thread(jerry);

        tmickey.start();
        tminnie.start();
        tjerry.start();
    }
}
