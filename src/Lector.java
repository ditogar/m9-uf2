import java.io.*;
import java.util.Scanner;

public class Lector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix el número d'execucions");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            executeEscriptor();
        }
    }

    private static void executeEscriptor() {
        try {
            ProcessBuilder pb = new ProcessBuilder("java", "-cp", "/home/46948549y/IdeaProjects/MO9-uf2/out/production/MO9-uf2/Escriptor.class");
            Process escriptor = pb.start();

            OutputStream outputStream = escriptor.getOutputStream();
            PrintWriter writer = new PrintWriter(outputStream, true);

            int n = 5;
            writer.println(n);

            InputStream inputStream = escriptor.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            System.out.println("Lector llegeix:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}
