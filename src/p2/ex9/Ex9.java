package p2.ex9;

import java.util.Map;

public class Ex9 {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder();
        Map<String, String> map = pb.environment();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
