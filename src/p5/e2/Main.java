package p5.e2;

import p5.MyStack;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        ProductorPila productor = new ProductorPila(stack);
        ConsumidorPila consumidor = new ConsumidorPila(stack);

        Thread productorThread = new Thread(productor);
        Thread consumidorThread = new Thread(consumidor);

        consumidorThread.start();
        productorThread.start();
    }
}
