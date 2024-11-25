import java.io.File;
import java.util.Map;

public class ex7 {
    public static void main(String[] args) {
        int exitCode = 0;
        try {
            String directory = "/home/46948549y/Documents/";
            String fileName = "output.txt";

            File file = new File(directory + fileName);

            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println("Se ha creado el archivo");
                }
            }

            ProcessBuilder process = new ProcessBuilder("gedit", directory + fileName);
            process.directory(new File(directory));

            Map<String, String> map = process.environment();

            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            Process p = process.start();
            exitCode = p.waitFor();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            exitCode = 200;
        } finally {
            System.exit(exitCode);
        }
    }
}
