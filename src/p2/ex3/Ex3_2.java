package p2.ex3;

public class Ex3_2 {
    public static void main(String[] args) {
        String cmd = "cmd /c start chrome";
        String web = "youtube.com";

        try {
            Process p = Runtime.getRuntime().exec(cmd + " " + web);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
