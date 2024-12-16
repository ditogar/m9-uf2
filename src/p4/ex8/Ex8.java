package p4.ex8;

public class Ex8 {

    public static void main(String[] args) {
        Thread[] daus = new Thread[6];

        int sum = 0;

        for (int i = 0; i < daus.length; i++) {
            Dau dau = new Dau();
            daus[i] = new Thread(dau);
            daus[i].start();
            try {
                daus[i].join();
            } catch (Exception e) {
                e.printStackTrace();
            }
            sum += dau.getNum();
        }
        System.out.println("Resultat: " + sum);
    }
}
