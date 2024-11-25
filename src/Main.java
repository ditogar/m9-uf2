import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = "Introdueix un paràmetre";
        System.out.println(message);
        String input = sc.nextLine();

        while (true) {
            if (input.equals("BYE")) {
                System.exit(0);
            } else if (input.equals("ERROR")) {
                System.exit(200);
            } else {
                System.out.println(message);
                input = sc.nextLine();
            }
        }
    }
}