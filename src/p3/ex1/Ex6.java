package p3.ex1;

public class Ex6 {
    public static void main(String[] args) {
        Ratoli ratoli1 = new Ratoli("Mickey");
        Ratoli ratoli2 = new Ratoli("Minnie");
        Ratoli ratoli3 = new Ratoli("Jerry");

        ratoli1.setTempsMenjar(10000);
        ratoli2.setTempsMenjar(3000);
        ratoli3.setTempsMenjar(0);

        Thread mickey = new Thread(ratoli1);
        Thread minnie = new Thread(ratoli2);
        Thread jerry = new Thread(ratoli3);

        mickey.start();
        minnie.start();
        jerry.start();
    }
}
