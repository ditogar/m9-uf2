package p2.ex6;

public class Ex6 {
    public static void main(String[] args) {
        String cmd = "notepad.exe";
        try {
            Process process = Runtime.getRuntime().exec(cmd);
            Thread.sleep(2000);
            System.out.println(process.pid());
            System.out.println(process.info());
            System.out.println(process.exitValue());
            process.destroy();
            int codiRetorn = process.waitFor();
            System.out.println("Procés \"" + cmd + "\" finalitzat amb codi: " + codiRetorn);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
