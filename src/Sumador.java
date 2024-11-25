import java.io.*;

public class Sumador {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Iteració " + (i + 1));
            int num = executeNumero();
            System.out.println("Número ha retornat: " + num);
            count += num;
            if (i != n - 1) {
                System.out.println("Suma total actual: " + count + "\n");
            }
        }
        System.out.println("Suma final: " + count);
    }
    private static int executeNumero() {
        try {
            ProcessBuilder pb = new ProcessBuilder("/home/46948549y/.jdks/openjdk-23/bin/java", "-cp", "/home/46948549y/IdeaProjects/MO9-uf2/out/production/MO9-uf2/", "Numero");
            Process numero = pb.start();

            InputStreamReader stream = new InputStreamReader(numero.getInputStream());
            BufferedReader reader = new BufferedReader(stream);

            return Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return 0;
    }
}
