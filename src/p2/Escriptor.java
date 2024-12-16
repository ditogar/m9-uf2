package p2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Escriptor {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println("Això és un missatge d'escriptor");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
