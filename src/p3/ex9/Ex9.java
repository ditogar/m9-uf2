package p3.ex9;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la hora a la que quieres programar la alarma.");
        int hora = sc.nextInt();

        System.out.println("Introduce el minuto.");
        int minuto = sc.nextInt();

        LocalDateTime ahora = LocalDateTime.now();
        LocalDateTime horaTotal = ahora.with(LocalTime.of(hora, minuto));

        System.out.println("Introduce el recordatorio.");
        String recordatorio = sc.nextLine();

        Thread alarma = new Thread(new Alarma(horaTotal, recordatorio));

        alarma.start();
    }
}
