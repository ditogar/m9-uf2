package p2.ex3;

public class Ex3_1 {
    public static void main(String[] args) {
        try {
            String cmd = "cmd /c start chrome";
            Process p = Runtime.getRuntime().exec(cmd);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
