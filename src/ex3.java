public class ex3 {
    public static void main(String[] args) {
        try {
            String processCmd = "google-chrome youtube.com";
            Process process = Runtime.getRuntime().exec(processCmd);
            System.out.println(process.pid());
            System.out.println(process.info());
            System.out.println(process.exitValue());
            Thread.sleep(2);
            process.destroy();
            int exitCode = process.waitFor();
            System.out.println("Procés \"" + processCmd + "\" finalitzat amb codi: " + exitCode);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
