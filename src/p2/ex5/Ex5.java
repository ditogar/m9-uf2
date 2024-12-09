package p2.ex5;

public class Ex5 {
    public static void main(String[] args) {
        String cmd = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
        try {
            Process process = Runtime.getRuntime().exec(cmd);
            Thread.sleep(2000);
            process.destroy();
            int codiRetorn = process.waitFor();
            System.out.println("Procés \"" + cmd + "\" finalitzat amb codi: " + codiRetorn);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
