package p6.ex1;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        Bus bus = new Bus();

        for (int i = 0; i < 20; i++) {
            new Thread(new Passatger(bus)).start();
        }
    }
}
