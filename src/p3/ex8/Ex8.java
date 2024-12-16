package p3.ex8;

import p3.Comptador;

public class Ex8 {
    public static void main(String[] args) {
        Thread comptador = new Thread(new Comptador(0, 10));

        comptador.start();
    }
}
