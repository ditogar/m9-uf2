package p5.e3;

public class Ex3 {
    public static void main(String[] args) {
        MySynchronizedStack stack = new MySynchronizedStack();

        Thread productor = new Thread(new ProductorPila(stack));
        Thread consumidor = new Thread(new ConsumidorPila(stack));

        productor.start();
        consumidor.start();
    }
}
