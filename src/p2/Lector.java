package p2;

import java.io.*;
import java.util.Scanner;

public class Lector {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Especifica el número de processos Escriptor que vols llencçar.");
            int numProcesses = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < numProcesses; i++) {
                Process p = new ProcessBuilder("java", "-cp", "C:\\Users\\diego\\IdeaProjects\\m9-uf2\\out\\production\\m9-uf2", "p2.Escriptor").start();
                OutputStream output = p.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);

                int n = 5;
                writer.println(n);

                InputStream input = p.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));

                String line;

                System.out.println("Lector llegeix.");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
