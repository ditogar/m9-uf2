package p3.ex1;

public class Ratoli implements Runnable {
    private String nom;
    private int tempsMenjar = 0;

    public Ratoli(String nom) {
        this.nom = nom;
    }

    public void setTempsMenjar(int tempsMenjar) {
        this.tempsMenjar = tempsMenjar;
    }

    protected void menja() {
        try {
            System.out.println("El ratolí " + nom + " ha començat a menjar.");
            System.out.println("El ratolí " + nom + " està menjant.");
            Thread.sleep(tempsMenjar);
            System.out.println("El ratolí " + nom + " ha acabat de menjar.");
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("Mickey")) {
            System.out.println("Mickey loves Minnie");
        }
        this.menja();
    }
}
