package p6.ex4.productor;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private int MAX_CAPACITY = 10;
    private List<Character> stack = new ArrayList<>();
    public synchronized void push(Character c) {
        while (stack.size() >= MAX_CAPACITY) {
            try {
                System.out.println("L'stack està ple.\n" +
                        "El productor " + Thread.currentThread().getName() + " espera.");
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("El productor afegeix l'element");
        stack.add(c);
        notifyAll();
    }

    public synchronized void pop() {
        while (stack.isEmpty()) {
            try {
                System.out.println("L'stack està ple.\n" +
                                "El consumidor " + Thread.currentThread().getName() + " espera.");
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("El consumidor consumeix");
        stack.removeLast();
        notifyAll();
    }
}
