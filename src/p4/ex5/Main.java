package p4.ex5;

import p4.ex4.RatoliStoppable;

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

        RatoliPare pare = new RatoliPare("Pare", new ArrayList<>(Arrays.asList(tmic, tmin, tjer)));
        Thread thread = new Thread(pare);

        thread.start();
        try {
            Thread.sleep(10000);
            mickey.setStop(true);
            minnie.setStop(true);
            jerry.setStop(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
