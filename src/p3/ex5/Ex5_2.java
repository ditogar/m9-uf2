package p3.ex5;

import p4.Ratoli;

public class Ex5_2 {
    public static void main(String[] args) {
        Ratoli mickey = new Ratoli("Mickey");
        Ratoli minnie = new Ratoli("Minnie");
        Ratoli jerry = new Ratoli("Jerry");

        Thread tmickey = new Thread(mickey);
        Thread tminnie = new Thread(minnie);
        Thread tjerry = new Thread(jerry);

        tmickey.setName("Mickey");
        tminnie.setName("Minnie");
        tjerry.setName("Jerry");

        System.out.println("Nom de Mickey " + tmickey.getName());
        System.out.println("Nom de Minnie " + tminnie.getName());
        System.out.println("Nom de Jerry " + tjerry.getName());
    }
}
