package p4.ex6;

import p4.RatoliPareJoin;
import p4.RatoliStoppable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex6 {
    public static void main(String[] args) {
        RatoliStoppable mickey = new RatoliStoppable("Mickey");
        RatoliStoppable minnie = new RatoliStoppable("Minnie");
        RatoliStoppable jerry = new RatoliStoppable("Jerry");
        Thread tmic = new Thread(mickey);
        Thread tmin = new Thread(minnie);
        Thread tjer = new Thread(jerry);

        ArrayList<Thread> fills = new ArrayList<>(Arrays.asList(tmic, tmin, tjer));

        RatoliPareJoin pare = new RatoliPareJoin("Pare", fills);
        Thread tpare = new Thread(pare);

        tmic.start();
        tmin.start();
        tjer.start();
        tpare.start();
    }
}
