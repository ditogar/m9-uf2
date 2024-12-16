package p3.ex1;

import p3.Ratoli;

public class Main {
    public static void main(String[] args) {
        Thread mickey = new Thread(new Ratoli("Mickey"));

        System.out.println("Estat de mickey " + mickey.getState());
        System.out.println("Està viu? " + mickey.isAlive());

        mickey.start();

        System.out.println("Estat de mickey " + mickey.getState());
        System.out.println("Està viu? " + mickey.isAlive());


    }
}
