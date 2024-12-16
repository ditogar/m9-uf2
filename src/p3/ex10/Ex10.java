package p3.ex10;

public class Ex10 {
    public static void main(String[] args) {
        int steps = (int) (Math.random() * 100) + 1;

        Thread rocinante = new Thread(new Cavall("Rocinante", steps));
        Thread spirit = new Thread(new Cavall("Spirit", steps));
        Thread flash = new Thread(new Cavall("Flash", steps));
        Thread rayo = new Thread(new Cavall("Rayo Mcquinn", steps));

        rocinante.start();
        spirit.start();
        flash.start();
        rayo.start();
    }
}
