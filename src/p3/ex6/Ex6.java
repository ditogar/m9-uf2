package p3.ex6;

import p3.Ratoli;

public class Ex6 {
    public static void main(String[] args) {
        Ratoli mickey = new Ratoli("Mickey");
        Ratoli minnie = new Ratoli("Minnie");
        Ratoli jerry = new Ratoli("Jerry");

        mickey.setTempsMenjar(10000);
        minnie.setTempsMenjar(0);
        jerry.setTempsMenjar(3000);

        Thread tmickey = new Thread(mickey);
        Thread tminnie = new Thread(minnie);
        Thread tjerry = new Thread(jerry);

        tmickey.start();
        tminnie.start();
        tjerry.start();
    }
}
