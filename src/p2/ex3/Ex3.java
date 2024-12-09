package p2.ex3;

public class Ex3 {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("notepad");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
