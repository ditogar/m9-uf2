package p4;

class Main {
    public static void main(String[] args) {
        RatoliStoppable mic = new RatoliStoppable("Mickey");
        Ratoli min = new Ratoli("Minnie");
        Ratoli jer = new Ratoli("Jerry");

        Thread tmic = new Thread(mic);
        Thread tmin = new Thread(min);
        Thread tjer = new Thread(jer);

        tmic.start();
        tmin.start();
        tjer.start();

        try {
            Thread.sleep(100);
            mic.setStop(true);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
