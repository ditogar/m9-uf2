package p4.ex8;

public class Dau implements Runnable {
    private int num;

    public int getNum() {
        return num;
    }
    @Override
    public void run() {
        num = (int) (Math.random() * 6) + 1;
        System.out.println(num);
    }
}
