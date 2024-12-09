package p2.ex4;

public class Ex4 {
    public static void main(String[] args) {
        String cmd = "cmd /c start chrome";
        try {
            Process process = Runtime.getRuntime().exec(cmd);
            int codiRetorn = process.waitFor();
            System.out.println("Procés \"" + cmd + "\" finalitzat amb codi: " + codiRetorn);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
