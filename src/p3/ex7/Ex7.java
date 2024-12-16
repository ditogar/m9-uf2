package p3.ex7;

import p3.Ratoli;

public class Ex7 {
    public static void main(String[] args) {
        Ratoli mickey = new Ratoli("Mickey");
        Ratoli minnie = new Ratoli("Minnie");
        Ratoli jerry = new Ratoli("Jerry");

        Thread tmickey = new Thread(mickey);
        tmickey.setName("Mickey");
        Thread tminnie = new Thread(minnie);
        Thread tjerry = new Thread(jerry);

        tmickey.start();
        tminnie.start();
        tjerry.start();
    }
}
