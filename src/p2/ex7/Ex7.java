package p2.ex7;

public class Ex7 {
    public static void main(String[] args) {

        try {
            for (int i = 0; i < 100; i++) {
                Process p = new ProcessBuilder("notepad.exe").start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
