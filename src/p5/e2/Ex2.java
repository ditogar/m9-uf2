package p5.e2;

public class Ex2 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        Thread productor = new Thread(new ProductorPila(stack));
        Thread consumidor = new Thread(new ConsumidorPila(stack));

        productor.start();
        consumidor.start();
    }
}
