package p3.ex4;

import p4.Ratoli;

public class Ex4 {
    public static void main(String[] args) {
        Ratoli mickey = new Ratoli("Mickey");
        Ratoli minnie = new Ratoli("Minnie");
        Ratoli jerry = new Ratoli("Jerry");

        Thread tmickey = new Thread(mickey);
        Thread tminnie = new Thread(minnie);
        Thread tjerry = new Thread(jerry);

        System.out.println("Estat de Mickey " + tmickey.getState());
        System.out.println("Estat de Minnie " + tminnie.getState());
        System.out.println("Estat de Jerry " + tjerry.getState());

        tmickey.start();
        tminnie.start();
        tjerry.start();

        System.out.println("Estat de Mickey " + tmickey.getState());
        System.out.println("Estat de Minnie " + tminnie.getState());
        System.out.println("Estat de Jerry " + tjerry.getState());

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Estat de Mickey " + tmickey.getState());
        System.out.println("Estat de Minnie " + tminnie.getState());
        System.out.println("Estat de Jerry " + tjerry.getState());
    }
}
