package p2.ex8;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex8 {
    public static void main(String[] args) {
        String directory = "C:\\Users\\diego\\Downloads\\";
        String fileName = "output.txt";
        File file = new File(directory + fileName);

        try {
            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println("Se ha creado el archivo");
                }
            }
            ProcessBuilder pb = new ProcessBuilder("notepad.exe", directory, fileName);
            pb.directory(new File(directory));

            Process p = pb.start();
            int exitCode = p.waitFor();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
