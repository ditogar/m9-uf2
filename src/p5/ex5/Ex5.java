package p5.ex5;

public class Ex5 {
    public static void main(String[] args) {
        DadaCompartida dadaCompartida = new DadaCompartida();
        for (int i = 0; i < 1000; i++) {
            new Thread(dadaCompartida).start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(DadaCompartida.comptador);
    }
}
