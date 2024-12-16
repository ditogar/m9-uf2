package p4.ex5;

import p4.RatoliStoppable;
import p4.RatoliPare;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RatoliStoppable mickey = new RatoliStoppable("Mickey");
        RatoliStoppable minnie = new RatoliStoppable("Minnie");
        RatoliStoppable jerry = new RatoliStoppable("Jerry");
        Thread tmic = new Thread(mickey);
        Thread tmin = new Thread(minnie);
        Thread tjer = new Thread(jerry);

        RatoliPare pare = new RatoliPare("Pare", new ArrayList<>(Arrays.asList(mickey, minnie, jerry)));
        Thread thread = new Thread(pare);

        tmic.start();
        tmin.start();
        tjer.start();
        thread.start();

    }
}
