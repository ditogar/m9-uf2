package p3.ex5;

import p4.Ratoli;

public class Ex5 {
    public static void main(String[] args) {
        Ratoli mickey = new Ratoli("Mickey");

        Thread tmickey = new Thread(mickey);

        System.out.println("Estat de Mickey " + tmickey.getState());
        System.out.println("Està viu? " + tmickey.isAlive());

        tmickey.start();

        System.out.println("Estat de Mickey " + tmickey.getState());
        System.out.println("Està viu? " + tmickey.isAlive());

        tmickey.setName("Mickey Thread");
        tmickey.setPriority(1);

        System.out.println("ID de Mickey " + tmickey.threadId());
        System.out.println("ID de Mickey " + tmickey.getId());
        System.out.println("Nom de Mickey " + tmickey.getName());
        System.out.println("Prioritat de Mickey " + tmickey.getPriority());
    }
}
