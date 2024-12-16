package p2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Sumador {
    public static void main(String[] args) {
        try {
            int sum = 0;
            for (int i = 0; i < 2; i++) {
                Process p = new ProcessBuilder("java", "-cp", "C:\\Users\\diego\\IdeaProjects\\m9-uf2\\out\\production\\m9-uf2",
                        "p2.Numero").start();
                InputStream input = p.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));

                int n = Integer.parseInt(reader.readLine());
                System.out.println("Numero " + (i + 1) + ": " + n);
                sum += n;
            }
            System.out.println("Suma: " + sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
