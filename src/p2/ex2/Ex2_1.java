package p2.ex2;

import java.util.Scanner;

public class Ex2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Introdueix un missatge");
            String input = sc.nextLine();
            if (input.equals("BYE")) {
                System.exit(0);
            } else if (input.equals("ERROR")) {
                System.exit(200);
            }
        }
    }
}
