package p3.ex9;

import java.time.LocalDateTime;

public class Alarma implements Runnable {
    private LocalDateTime hora;
    private String recordatori;

    public Alarma(LocalDateTime hora, String recordatori) {
        this.hora = hora;
        this.recordatori = recordatori;
    }

    @Override
    public void run() {
        while (LocalDateTime.now().isBefore(hora)) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(recordatori);
    }
}
