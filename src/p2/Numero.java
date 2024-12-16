package p2;

import java.util.Random;

public class Numero {
    public static void main(String[] args) {
        Random random = new Random();
        int n = (int) (Math.random() * 100) + 1;
        System.out.println(n);
    }
}
