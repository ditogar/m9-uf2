package p5.e3;

import p5.MyStack;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        ProductorPilaSynchronized productor = new ProductorPilaSynchronized(stack);
        ConsumidorPilaSynchronized consumidor = new ConsumidorPilaSynchronized(stack);
        
        Thread productorThread = new Thread(productor);
        Thread consumidorThread = new Thread(consumidor);

        consumidorThread.start();
        productorThread.start();
    }
}
